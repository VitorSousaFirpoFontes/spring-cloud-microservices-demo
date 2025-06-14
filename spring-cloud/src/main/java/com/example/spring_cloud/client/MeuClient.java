package com.example.spring_cloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "outro-servico") // esse nome deve ser igual ao "spring.application.name" do outro microserviço
public interface MeuClient {

    @GetMapping("/api/dados")
    String obterDados();
}
