# Microservices com Spring Boot

## 💡 Sobre o Projeto

Este é um projeto desenvolvido como parte complementar do bootcamp **Spring + React** da [`DevSuperior`](https://devsuperior.com.br), com foco em arquitetura de microsserviços utilizando **Spring Boot**, **Spring Cloud** e diversas ferramentas do ecossistema Spring.

O sistema é composto por diversos microsserviços que se comunicam entre si, com autenticação via OAuth2 e JWT, registro de serviços com Eureka, roteamento via API Gateway Zuul, configuração centralizada com Config Server, e execução em containers Docker com suporte a escalonamento automático e balanceamento de carga.

O armazenamento de dados é feito com **PostgreSQL 12**.

---

## 🧱 Estrutura de Microsserviços

### `hr-worker`
Responsável por fornecer os dados dos trabalhadores (nome, valor da diária e quantidade de dias trabalhados). Serviço escalável e exposto para comunicação com outros microsserviços.

### `hr-payroll`
Realiza o cálculo de pagamento com base nos dados obtidos do `hr-worker`. Também é um serviço escalável.

### `hr-user`
Gerencia os dados dos usuários que acessam o sistema, com persistência em banco PostgreSQL.

### `hr-oauth`
Responsável pela autenticação e autorização dos usuários, utilizando OAuth2 e JWT.

### `hr-eureka-server`
Servidor de descoberta de serviços utilizando o **Eureka**, permitindo que os microsserviços se registrem e descubram uns aos outros dinamicamente.

### `hr-api-gateway-zuul`
Funciona como o gateway da aplicação, roteando as requisições entre os serviços. Também atua como servidor de recursos para autenticação e autorização.

### `hr-config-server`
Servidor centralizado de configuração, responsável por buscar e aplicar configurações armazenadas em um repositório remoto no GitHub.

---

## 🛠️ Tecnologias Utilizadas

### Backend
- Java
- Spring Boot
- Spring Cloud
  - Feign
  - Ribbon
  - Hystrix
  - OAuth2
  - JWT
  - Eureka Server
  - Config Server
  - API Gateway Zuul
- Spring Security
- JPA / Hibernate
- Maven
- PostgreSQL
- H2 Database (para testes)
- PgAdmin
- Docker

---

## 👨‍💻 Autor

**Diego Oliveira**  
[LinkedIn]([https://www.linkedin.com](https://www.linkedin.com/in/diego-oliveyra/))
