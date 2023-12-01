package com.betamartins.controlefinanceiro.controller.authentication;

import com.betamartins.controlefinanceiro.model.user.User;
import com.betamartins.controlefinanceiro.model.user.dto.UserAuthData;
import com.betamartins.controlefinanceiro.security.TokenJwtService;
import com.betamartins.controlefinanceiro.security.dto.DadosJwtToken;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenJwtService tokenJwtService;

    @PostMapping
    public ResponseEntity<?> login(@RequestBody @Valid UserAuthData userData){
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(userData.login(), userData.password());
        Authentication auth = authenticationManager.authenticate(token);
        String tokenJwt = this.tokenJwtService.createJwtToken((User) auth.getPrincipal());
        return ResponseEntity.ok(new DadosJwtToken(tokenJwt));
    }

}
