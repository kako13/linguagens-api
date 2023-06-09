# linguagens-api

## Proposta

A proposta desta API é fornecer um **ranking fictício e customizável** das melhores linguagens de programação.

Permite que o usuário administre (
**[registrar](https://kako13.github.io/linguagens-api-doc/docs/linguagens/adicionar/)**,
**[alterar](https://kako13.github.io/linguagens-api-doc/docs/linguagens/atualizar/)**,
**[remover](https://kako13.github.io/linguagens-api-doc/docs/linguagens/remover)**,
**[listar](https://kako13.github.io/linguagens-api-doc/docs/linguagens/listar/)** e
**[buscar](https://kako13.github.io/linguagens-api-doc/docs/linguagens/obter-por-id/)**
)* de acordo com seu critério

Sim! É simples mesmo!

## Motivação

O desenvolvimento deste projeto foi uma demanda proposta durante a Imersão Java - Alura. 

Trata-se de uma API para ser consumida por outra aplicação **([alura-stickers](https://github.com/kako13/alura-stickers))**.

Mas também pode ser testada via:

#### **[- documentação docusaurus](https://kako13.github.io/linguagens-api-doc)** 
#### **[- documentação swagger-ui](https://imersao-alura-linguagens.fly.dev/ranking/swagger-ui/index.html#/)**
#### **[- swagger editor](https://editor.swagger.io)** (baixando o **[.json](https://imersao-alura-linguagens.fly.dev/ranking/v3/api-docs)** ou **[.yaml](https://imersao-alura-linguagens.fly.dev/ranking/v3/api-docs.yaml)** do projeto e colando no área de edição)


## Tecnologias 

##### - Spring Rest 
##### - Spring Data MongoDB 
##### - MongoDB Atlas 
##### - OpenAPI 3 

## Especificação OpenAPI  

Essa API é documentada no **formato OpenAPI**. Este projeto foi **extendido** e utiliza as features deste [template](https://github.com/PaloAltoNetworks/docusaurus-template-openapi-docs) do [Docusaurus](https://docusaurus.io). 

Como dependência utilizei `springdoc-openapi-starter-webmvc-ui` na `versão v2`, conforme a recomendado na [documentação](https://springdoc.org/v2/) ao utilizar `spring-boot v3`.

Confira a **[documentação completa](https://kako13.github.io/linguagens-api-doc)** e seu respectivo fonte em [documentação completa](https://github.com/kako13/linguagens-api-doc).

Espero que goste do projeto e sinta-se à vontade para sugerir melhorias!

###### *Os códigos e mensagens customizadas de retorno ainda estão em desenvolvimento