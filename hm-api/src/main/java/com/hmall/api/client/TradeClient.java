package com.hmall.api.client;

import com.hmall.api.dto.OrderFormDTO;
import com.hmall.api.vo.OrderVO;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("trade-service")
public interface TradeClient {
    @PutMapping("/orders/{orderId}")
    void markOrderPaySuccess(@PathVariable("orderId") Long orderId);

    @PostMapping("/orders")
    Long createOrder(@RequestBody OrderFormDTO orderFormDTO);

    @GetMapping("/orders/{id}")
    OrderVO queryOrderById(@Param("订单id")@PathVariable("id") Long orderId);
}
