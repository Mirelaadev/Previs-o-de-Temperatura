# Previsão de Temperaturas em Java

Esse projeto foi desenvolvido para praticar **Programação Orientada a Objetos (POO)** em Java.

A ideia é usar anos com dados de temperatura mensal como base e calcular a previsão para anos futuros (ano + 3), aplicando regras específicas definidas na atividade.

Foi um exercício importante para entender melhor como funcionam objetos, arrays de objetos e encapsulamento.
## Regras aplicadas na previsão

A previsão segue algumas regras importantes:

- A temperatura do mês futuro é calculada usando como base o **mesmo mês de 3 anos atrás**.  
  Exemplo: para calcular janeiro/2017, é usado janeiro/2014.

- O valor final é calculado através da **média aritmética entre três meses**:
    - o mês equivalente (3 anos antes)
    - o mês anterior
    - o mês sucessor

  Exemplo: fevereiro/2017 usa janeiro/2014, fevereiro/2014 e março/2014.

- Se o mês não tiver antecessor ou sucessor (como janeiro ou dezembro),  
  o valor do mês equivalente é considerado **duas vezes** na média.

- Após calcular a média, é aplicado um acréscimo anual:
    - `+0.13` para cada ano
    - Caso exista ano bissexto no período, usa-se `+0.14` no lugar de um dos `0.13`

Essas regras exigiram tratamento especial para o primeiro e último mês do ano, além da verificação de ano bissexto.


## O que eu pratiquei aqui

- Criação de classes (`Ano` e `Mes`)
- Instanciação de objetos com `new`
- Arrays de objetos
- Uso de getters
- Laços `for`
- Estruturas condicionais
- Manipulação de índices
- Formatação de números com duas casas decimais
- Aplicação de regra de negócio com anos bissextos

## Estrutura
### Classe `Mes`
Representa um mês com:
- Nome
- Temperatura

### Classe `Ano`
Representa um ano com:
- Valor do ano
- Array com 12 meses
