package com.complete.rt.config.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;

public class JwtAuthenticationToken extends AbstractAuthenticationToken {

    private final AccountContext accountContext;

    public JwtAuthenticationToken(AccountContext accountContext) {
        super(null);
        this.accountContext = accountContext;
    }

    @Override
    public Object getCredentials() {
        return accountContext;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }
}
