# Curso DIO Desafio Projeto API Spring Boot Deploy na Nuvem

Ainda não consegui realizar o deploy no HEROKU.

Utilizando o passo a passo do professor com as dependecias do Swagger abaixo, foi necessario inserir uma parametrização no application.properties para funcionar corretamente:

Dependecias utilizadas:


código necessário no application.properties:
spring.mvc.pathmatch.matching-strategy=ant-path-matcher

Em outra aula identifiquei que também é possível utilizar o Swagger a depencia abaixo, neste caso não houve a configuração da Classe SwaggerConfig, não tendo as opções personalizadas.
para testar é um modo mais rapido e não houve a necessidade também de inserir nenhum código no application.properties

		<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-ui</artifactId>
			<version>1.6.9</version>
		</dependency>





