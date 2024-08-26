package com.GoF.lab_padroes_de_projetos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Controller:
 * 	> Lida com as requisições HTTP.
 * 	> Atende ao frontend ou outras partes do sistema, processando entradas e retornando saídas.
 * 	> Atua como a camada de apresentação ou interface entre a aplicação e o mundo exterior.
 *
 * Model:
 * 	> Representa a estrutura de dados e as regras de negócio básicas.
 * 	> Contém entidades que são mapeadas para tabelas de banco de dados.
 * 	> Pode incluir DTOs e Enums.
 *
 * Service:
 * 	> Contém a lógica de negócio.
 * 	> Coordena operações complexas e interações entre entidades.
 * 	> Chamado pelos controladores para executar operações de negócio.
 */

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
