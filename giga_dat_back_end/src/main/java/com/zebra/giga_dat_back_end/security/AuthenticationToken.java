package com.zebra.giga_dat_back_end.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Arrays;
import java.util.Collection;

public class AuthenticationToken extends AbstractAuthenticationToken {
    private static final long serialVersionUID = -1949976839306453197L;

    private String uid;

    public AuthenticationToken(String uid) {
        super(Arrays.asList());
        this.uid = uid;
    }

    public AuthenticationToken(
            Collection<? extends GrantedAuthority> authorities, UserDetailsImpl authenticatedUser, String uid) {
        super(authorities);
        this.uid = uid;
    }

    @Override
    public Object getCredentials() {
        return uid;
    }

    @Override
    public Object getPrincipal() {
        return uid;
    }

    public String getUid() {
        return uid;
    }
}
