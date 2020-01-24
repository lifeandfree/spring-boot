package ru.innopolis.demo.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

/**
 * TokenAuthenticationManager.
 *
 * @author lifeandfree
 */
@Component
public class TokenAuthenticationManager implements AuthenticationManager {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        if (authentication instanceof TokenAuthentication)
            return authentication;
        authentication.setAuthenticated(false);
        return authentication;
    }
}
