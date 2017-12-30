package com.kaiyujin.anemoneapi;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //認証チェック不要パスを設定
                .antMatchers(
                        "/health_check",
                        "/login/"
                ).permitAll()
                .anyRequest().authenticated()
                .and().csrf().disable();
    }
}