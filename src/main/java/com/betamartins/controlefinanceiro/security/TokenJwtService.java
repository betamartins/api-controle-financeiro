package com.betamartins.controlefinanceiro.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.betamartins.controlefinanceiro.model.user.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenJwtService {

    @Value("${api.security.secretKey}")
    private String secretKey;

    public String createJwtToken(User usuario){
        try {
            Algorithm algorithm = Algorithm.HMAC256(this.secretKey);
            return JWT.create()
                    .withIssuer("Betamartins.com")
                    .withSubject(usuario.getLogin())
                    .withExpiresAt(this.getExpireDate())
                    .sign(algorithm);
        } catch (JWTCreationException exception){
            throw new RuntimeException("Erro ao criar token JWT", exception);
        }
    }

    public String getSubject(String tokenJwt){
        try{
            Algorithm algorithm = Algorithm.HMAC256(this.secretKey);
            return JWT.require(algorithm)
                    .withIssuer("Betamartins.com")
                    .build()
                    .verify(tokenJwt)
                    .getSubject();
        } catch (JWTVerificationException exception) {
            throw new RuntimeException("Token JWT inválido ou expirado.");
        }
    }

    private Instant getExpireDate() {
        return LocalDateTime.now().plusHours(12).toInstant(ZoneOffset.of("-03:00"));
    }

}
