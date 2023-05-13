package br.com.alura.linguagensapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(info = @Info(title = "Linguagens API", version = "1.0", description =  "Swagger Ranking linguagens JSON \n\n## Introduction  \nEste é um exemplo do Ranking de linguagens. \n\n## Especificação OpenAPI  \nEssa API é documentada no **formato OpenAPI**. O projeto foi **extendido** e utiliza as features deste [template](https://github.com/PaloAltoNetworks/docusaurus-template-openapi-docs) e do [Docusaurus](https://docusaurus.io). A dependência utilizada doi a `springdoc-openapi-starter-webmvc-ui` na `versão v2` (https://springdoc.org/v2/), conforme a recomendação da [documentação](https://springdoc.org/v2/), quando utilizado `spring-boot v3`. \n\nEncontre mais sobre o Swagger em [http://swagger.io](http://swagger.io) ou em [irc.freenode.net, #swagger](http://swagger.io/irc/). \n\n## Proposta  \nA proposta desta API é fornecer um ranking fictício customizável das melhores linguagens de programação. \n\nAdministre o ranking conforme seus critérios. \n\n\n\nSim! É simples mesmo!"))
@SpringBootApplication
public class LinguagensApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(br.com.alura.linguagensapi.LinguagensApiApplication.class, args);
	}
}
