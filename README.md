# MercadinhoFacisa - API REST

Esta é uma API REST para um supermercado simples, construída com **Spring Boot**, **Spring Data JPA** e **H2 Database**.  
Ela permite gerenciar produtos, clientes e carrinhos de compras.

---

## Tecnologias utilizadas

- Java 17
- Spring Boot 3.3.2
- Spring Data JPA
- H2 Database (em memória)
- Maven
- Postman (para testes)

---

## Estrutura do projeto

- `Produto`: entidade que representa os produtos do supermercado.
- `Cliente`: entidade que representa os clientes.
- `Carrinho`: entidade que representa um carrinho de compras.
- `ItemCarrinho`: entidade que representa um item dentro do carrinho.

O projeto segue a estrutura padrão do Spring Boot com pacotes separados para:

- `controller`: endpoints REST
- `service`: lógica de negócio
- `repository`: acesso ao banco
- `model`: entidades JPA
- `dto` (opcional): objetos de transferência de dados

---

## Como rodar

1. **Clone o projeto**:
   ```bash
   git clone <URL_DO_PROJETO>
   cd mercadinhofacisa
