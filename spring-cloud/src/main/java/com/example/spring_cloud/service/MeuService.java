package com.example.spring_cloud.service;

import com.example.spring_cloud.client.MeuClient;
import org.springframework.stereotype.Service;

@Service
public class MeuService {

    private final MeuClient meuClient;

    public MeuService(MeuClient meuClient) {
        this.meuClient = meuClient;
    }

    public String chamarOutroServico() {
        return meuClient.obterDados();
    }
}
