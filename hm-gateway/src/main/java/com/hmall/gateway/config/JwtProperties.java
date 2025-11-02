package com.hmall.gateway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;

/**
 * Properties for JWT keystore location and credentials.
 * Bound from properties with prefix "hm.jwt" (see application.yaml).
 */
@ConfigurationProperties(prefix = "hm.jwt")
public class JwtProperties {

    /** keystore location, e.g. classpath:hmall.jks */
    private Resource location;

    private String alias;

    private String password;

    private String tokenTTL;

    public Resource getLocation() {
        return location;
    }

    public void setLocation(Resource location) {
        this.location = location;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTokenTTL() {
        return tokenTTL;
    }

    public void setTokenTTL(String tokenTTL) {
        this.tokenTTL = tokenTTL;
    }
}
