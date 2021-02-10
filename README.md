# Teste Altimus
## Tecnologias utilizadas:

* Banco de dados PostgreSQL

• Java 8+

• Maven

• Spring

• JPA

• Lombok

• REST com JSON

### Requisitos da Prova:

•  Deve ser possível consultar uma listagem de veículos a partir de um aplicativo WEB. 
  Essa listagem deve ser armazenada em um banco de dados relacional de sua preferência.

•  Deve ser possível cadastrar veículos com os seguintes campos: data de cadastro, placa, RENAVAM, modelo, opcionais, valor de venda.

• Deve ser possível editar um veículo cadastrado.

• Deve ser possível excluir um veículo cadastrado.

• Os seguintes campos devem possuir uma máscara de formatação: data de cadastro, placa e valor de venda.

•A data deve conter os dias do mês e ano corrente, assim como horas e minutos.
  O valor de venda deve usar um separador para milhares de decimais. Para a placa, basta o hífen.

• O campo modelo deve ser apresentado no cadastro de veículo como um select-one-menu,
   ou seja, o usuário pode escolher 1 modelo de vários cadastrados em um menu de seleção.

• O usuário pode escolher e selecionar múltiplos opcionais cadastrados. O componente a ser utilizado para isso é de livre escolha.


## Gerando o pacote
Sendo um projeto Maven, execute os goals clean e install na raiz do projeto para baixar as dependências e gerar o jar do projeto.


```bash
$ mvn clean install

```

## Exemplos

http://localhost:9000/api-veiculo/v1/opcionais/salvar

```
{
	"nome":"Ar Condicionado"
}

```

retorno 200: 
```
{
    "id": 1,
    "nome": "Ar Condicionado"
}
```
http://localhost:9000/api-veiculo/v1/modelos/salvar

```
{
	"nomeModelo":"FORD KA",
	"ano":"2020"
	
}
```

retorno OK:

```
{
    "id": 1,
    "nomeModelo": "FORD KA",
    "ano": "2020"
}

```
http://localhost:9000/api-veiculo/v1/veiculos/salvar

```
{
    
    "placa": "QAM5619",
    "renavam": "123455",
    "valor": 250,
    "dataDeCadastro": "2021-02-09T18:45:19.211+00:00",
    "modelo": {
        "id": 1,
        "nomeModelo": "FORD KA",
        "ano": "2020"
    },
    "opcionais": [
        {
            "id": 1,
            "nome": "Ar Condicionado"
        }
        ]
}

```

retorno OK:

```
{
    "id": 2,
    "placa": "QAM5619",
    "renavam": "123455",
    "valor": 250,
    "dataDeCadastro": "2021-02-09T18:45:19.211+00:00",
    "modelo": {
        "id": 1,
        "nomeModelo": "FORD KA",
        "ano": "2020"
    },
    "opcionais": [
        {
            "id": 1,
            "nome": "Ar Condicionado"
        }
    ]
}

```


