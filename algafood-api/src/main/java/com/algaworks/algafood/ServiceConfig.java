package com.algaworks.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {

	@Bean
	AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);
		return ativacaoClienteService;
	}

}
