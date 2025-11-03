package com.hmall.gateway.filters;

import com.hmall.gateway.config.AuthProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
@Component
@RequiredArgsConstructor
public class AuthGlobalFilter implements GlobalFilter, Ordered {

    private final AuthProperties authProperties;

    // 构造函数注入
//    public AuthGlobalFilter(AuthProperties authProperties) {
//        this.authProperties = authProperties;
//    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //1.获取request

        //2.判断是否需要做登录验证

        //3.获取token

        //4.校验并解析token

        //TODO 5.传递用户信息

        //6.放行

        return null;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
