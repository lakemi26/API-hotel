# API-hotel

Aplicação de gerenciamento de hotel

Dominio:

- Hospede                                            
    - Nome completo                                  
    - Documento                                      
    - Data de nascimento                             
    - Endereço
    - DDD
    - Telefone
    - Email

Post/hospede
Put/hospede
Get/hospede
Get/hospede/filtro?nome=?&documento=?&email=?


- Quarto
    - Número do quarto
    - Status
    - Tipo de acomodação
        - Casal (2 pessoas / 1 cama)
        - Solteiro (1 cama)
        - Duplo (2 pessoas / 2 camas)

Post/quarto
Put/quarto
Get/quarto
Get/quarto?status=?&acomodacao=?


- Reserva
    - identificação do hospede 1
    - identificação do hospede 2
    - Número do quarto
    - Data de entrada
    - Data de saída

Post/reserva
Put/reserva
Patch/reserva
Get/reserva/{id}
get/reserva?data_entrada=?&data_saida=?&status=?



Regras:

1. Menor de 18 anos não se hospeda






#### Verificar documentação com Seagger

> http://localhost:8080/swagger-ui/index.html

#### Acessar o h2-console

> localhost:8080/h2-console