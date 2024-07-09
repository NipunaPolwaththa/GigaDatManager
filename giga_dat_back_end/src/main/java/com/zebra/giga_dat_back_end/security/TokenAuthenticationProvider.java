package com.zebra.giga_dat_back_end.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class TokenAuthenticationProvider implements AuthenticationProvider {
    @Value("${auth-token-header-name}")
    private String principalRequestHeader;

    @Value("${auth-token}")
    private String token;

    @Value("${auth-token-type}")
    private String tokenType;
    // This would be a JPA repository to snag your user entities

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        AuthenticationToken authenticationToken =  (AuthenticationToken) authentication;

        if( authenticationToken == null)
            throw new BadCredentialsException("No authentication token present.");

        if( authenticationToken.getUid() == null )
            throw new BadCredentialsException("Authentication found but no token present.");

        if(!authenticationToken.getUid().contains(token) )
            throw new BadCredentialsException("The authentication token was not the expected value.");

        authentication.setAuthenticated(true);

        return authentication;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return AuthenticationToken.class.isAssignableFrom(authentication);
    }
}
