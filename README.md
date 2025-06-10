<h1 align="center">🏨 API Hotel</h1>

<p align="center">
    Sistema de gerenciamento de hóspedes, quartos e reservas.<br/>
    Desenvolvido com Sprin Boot + H2 Database para fins estudantis.
</p>

---

## 🚀 Funcionalidades

### 🧍‍♂️ Hóspedes
Campos:
- 👤 Nome completo
- 📄 Documento
- 🎂 Data de nascimento
- 🏠 Endereço
- ☎️ DDD + Telefone
- 📧 Email

**Endpoints:**

POST /hospede <br/>
PUT /hospede <br/>
GET /hospede <br/>
GET /hospede/filtro?nome=&documento=&email=?<br/>

---

### 🛏️ Quarto
Campos:
- 🔢 Número do quarto
- 🚦 Status
- 🛌 Tipo de acomodação:
  - Casal 👫
  - Solteiro 👤
  - Duplo 👬

**Endpoints:**

POST/quarto <br/>
PUT/quarto <br/>
GET/quarto <br/>
GET/quarto?status=?&acomodacao=? <br/>

---

### 📆 Reserva
Campos:
- 👤 Hóspede 1 (obrigatório)
- 👥 Hóspede 2 (opcional)
- 🛏️ Número do quarto
- 📅 Data de entrada
- 📅 Data de saída

**Endpoints:**


Post/reserva <br/>
Put/reserva <br/>
Patch/reserva <br/>
Get/reserva/{id} <br/>
get/reserva?data_entrada=?&data_saida=?&status=? <br/>

---

## ⚖️ Regra de Negócio

- ❌ Menores de **18 anos não podem se hospedar.**

---

## 🛠️ Tecnologias Utilizadas

| Ferramenta          | Descrição                               |
|---------------------|-----------------------------------------|
| ☕ Java 24           | Linguagem principal do projeto          |
| 🌱 Spring Boot      | Framework para API REST                 |
| 🗃️ H2 Database      | Banco de dados em memória               |
| ✅ Spring Validation| Validações automáticas de entrada       |
| ✍️ Lombok           | Redução de boilerplate (getters/setters)|
| 🔄 MapStruct        | Conversão entre DTOs e entidades        |
| 📄 Swagger/OpenAPI  | Documentação interativa da API          |

---

## 📑 Documentação da API

Acesse o Swagger:

👉 [`http://localhost:8080/swagger-ui/index.html`](http://localhost:8080/swagger-ui/index.html)

---

## 💾 Console do Banco H2

Acesse o console:

👉 [`http://localhost:8080/h2-console`](http://localhost:8080/h2-console)

- JDBC URL: `jdbc:h2:mem:testdb`
- Usuário: `sa`
- Senha: *(deixe em branco)*

---

## ⚙️ Pré-requisitos

- ☕ Java 21 ou superior
- 📦 Maven 3.8+ (ou use o wrapper ./mvnw)
- 💻 IDE com suporte ao Spring Boot (recomendado)