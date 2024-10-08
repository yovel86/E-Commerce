package com.projects.userservice.services;

import com.projects.userservice.models.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JwtService {

//    @Value("${JWT_SECRET_KEY}")
    private String secretKey = "56b058a99cc309ca73abf5deb0523d9a1a1c8abcb672771904a5ed77c67cbfb2";

    public String generateToken(User user, Date expiresAt) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("name", user.getName());
        claims.put("email", user.getEmail());
        return createToken(claims, expiresAt);
    }

    private String createToken(Map<String, Object> claims, Date expiresAt) {
        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(new Date())
                .setExpiration(expiresAt)
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();
    }

}
