//package ru.innopolis.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.authentication.event.AbstractAuthenticationEvent;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.Filter;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * TokenAuthFilter.
// *
// * @author lifeandfree
// */
////@Component
//public class TokenAuthFilter extends AbstractAuthenticationProcessingFilter {
//
//    public TokenAuthFilter(String s) {
//        super(s);
//    }
//
//    @Override
//    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {
//        String token = request.getHeader(HttpHeaders.AUTHORIZATION);
//
//        // парс токена
//        // Authorization Bearer dfdfd
//
//        return new TokenAuthentication(token);
//    }
//
////    @Autowired
//    @Override
//    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
//        super.setAuthenticationManager(authenticationManager);
//    }
//}
