package com.example.spring_cloud.controller;

import com.example.spring_cloud.service.MeuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuController {

    private final MeuService meuService;

    public MeuController(MeuService meuService) {
        this.meuService = meuService;
    }

    @GetMapping("/chamar")
    public String chamarOutroServico() {
        return meuService.chamarOutroServico();
    }
}
