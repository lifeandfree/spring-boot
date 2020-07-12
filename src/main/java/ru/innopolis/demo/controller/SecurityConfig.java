//package ru.innopolis.demo.controller;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.AuthenticationEntryPoint;
//import org.springframework.security.web.authentication.AuthenticationFailureHandler;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import javax.servlet.Filter;
//
///**
// * SecurityConfig.
// *
// * @author lifeandfree
// */
////@Configuration
////@EnableWebSecurity
////@EnableGlobalMethodSecurity(securedEnabled = true)
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    private AuthenticationManager authenticationManager;
//    private AuthenticationEntryPoint authenticationEntryPointHandler;
//
//    public SecurityConfig(AuthenticationManager authenticationManager, AuthenticationEntryPoint authenticationEntryPointHandler) {
//        this.authenticationManager = authenticationManager;
//        this.authenticationEntryPointHandler = authenticationEntryPointHandler;
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable().httpBasic().disable()
//                .exceptionHandling()
//                .authenticationEntryPoint(authenticationEntryPointHandler)
//                .and()
//                .addFilterAt(authenticationTokenFilter(), UsernamePasswordAuthenticationFilter.class)
//                .authorizeRequests().antMatchers("/swagger-**").permitAll();
//    }
//
//    @Bean
//    public TokenAuthFilter authenticationTokenFilter() {
//        return new TokenAuthFilter("/**");
//    }
////
////    @Bean
////    public AuthenticationManager authenticationManager() {
////        return new TokenAuthenticationManager();
////    }
//}
