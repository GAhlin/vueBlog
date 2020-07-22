package com.dangelion.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @Author Gavin
 * @Date 2020/7/22
 */
public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String jwt) {
        this.token = jwt;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
