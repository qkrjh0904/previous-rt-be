package com.complete.rt.config.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationProvider implements AuthenticationProvider {

    private static final String BEARER_TOKEN_PREFIX = "Bearer ";
    private final JwtTokenProvider jwtTokenProvider;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {


        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return false;
    }

    public Authentication getAuthentication(String authorization) {
        String token = Optional.ofNullable(authorization)
                .filter(this::isBearerToken)
                .map(this::getJwtToken)
                .orElse(null);


        jwtTokenProvider.authenticate(token);

        AccountContext accountContext = new AccountContext("id");
        Authentication authentication = new JwtAuthenticationToken(accountContext);
        return authenticate(authentication);
    }

    private String getJwtToken(String s) {
        return null;
    }

    private boolean isBearerToken(String s) {
        return false;
    }
}
