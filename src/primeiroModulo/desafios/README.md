# Fibonacci

Faça um método `@Desafio("Fibonacci")` que retorne uma lista `java.util.List` com os primeiro números `Integer` da série de *Fibonacci* até *passar* de *350*.

> A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, etc...

Faça um segundo método `@Desafio("isFibonnaci")` que recebe um `Integer` como parâmetro e retorne `Boolean`.
Caso o número recebido por parâmetro esteja entre os números da sequência de *Fibonnaci* do `@Desafio("Fibonnaci")` retorne `true`, senão, `false`.

## Tópicos

Neste desafio você aprenderá:

- Variáveis e métodos
- Operadores matemáticos
- Controle de fluxo
- Listas

## Requisitos
​
Para este desafio você precisará :

- Java 8 +

Para instalar no MacOS, usando o HomeBrew basta executar:

    brew cask install java

Para instalar no Linux e no Windows, confira os links na seção de conteúdo.



# Criptografia de Júlio César


Segundo o Wikipedia, criptografia ou criptologia (em grego: kryptós, “escondido”, e gráphein, “escrita”) é o estudo e prática de princípios e técnicas para comunicação segura na presença de terceiros, chamados “adversários”. Mais geralmente, a criptografia refere-se à construção e análise de protocolos que impedem terceiros, ou o público, de lerem mensagens privadas. Muitos aspectos em segurança da informação, como confidencialidade, integridade de dados, autenticação e não-repúdio são centrais à criptografia moderna. Aplicações de criptografia incluem comércio eletrônico, cartões de pagamento baseados em chip, moedas digitais, senhas de computadores e comunicações militares. 
Das Criptografias mais curiosas na história da humanidade podemos citar a criptografia utilizada pelo grande líder militar romano Júlio César para comunicar com os seus generais. Essa criptografia se baseava na substituição da letra do alfabeto avançado três casas. Por exemplo:


* **Normal**:  `a ligeira raposa marrom saltou sobre o cachorro cansado`
* **Cifrado**: `d oljhlud udsrvd pduurp vdowrx vreuh r fdfkruur fdqvdgr`

O objetivo desse desafio é que você automatiza a criptografia e descriptografia dessas menagens:

Regras:

* As mensagens serão convertidas para minúsculas tanto para a criptografia quanto para descriptografia.
* No nosso caso os números serão mantidos, ou seja:
    * Normal: 1
    * Cifrado: 1


## Tópicos

Neste desafio você aprenderá:

* Java

## Requisitos

Para este desafio você precisará de:

- Java 8 (ou superior)
- Git


# Calculadora de Salário Líquido

No Brasil, as pessoas que trabalham "com carteira assinada" (CLT) têm uma parte do seu *salário bruto (isto é, o salário integral, sem descontos)* retida pela empresa empregadora para o pagamento de alguns tributos, como, por exemplo, a Previdência Social (INSS) e o Imposto de Renda Retido na Fonte (IRRF). Após esse desconto, o valor que a pessoa contratada recebe é denominado **salário líquido**.

Neste desafio, vamos implementar um algoritmo que será responsável por receber como parâmetro o salário bruto e retornar o salário líquido, já com todos os descontos de INSS e IRRF. Esse algoritmo deve ser implementado na classe **CalculadoraSalario** no método **calcularSalarioLiquido**, esse método deve receber um valor do tipo **double** e retornar um valor do tipo **int** (**Utilize o método Math.round() para arredondar o resultado final**).

Lembre-se que é uma boa prática deixar cada método com apenas 1 responsabilidade, então fique à vontade para criar métodos privados na classe para melhorar a legibilidade de seu algoritmo.

**Observações:**
Para simplificar o desafio, serão utilizados valores fictícios e não os valores oficiais das tabelas de alíquotas da Previdência Social e Receita Federal.



## Fórmula do cálculo

### Primeiro passo
Primeiro deve ser calculado o valor do desconto do INSS, o mesmo deve ser calculado conforme a tabela abaixo:


| Faixa salarial  |  Percentual de desconto  |
| --- | --- |
|  Até R$ 1.500,00 | 8% |
|  De R$ 1.500,01 até R$ 4.000,00 | 9% |
|  Acima de R$ 4.000,00 |  11% |

**Exemplo:**
- Para um salário bruto de **R$1.000,00** ou **R$1.500,00**, deverá ser aplicado o desconto de 8% resultando em valores líquidos de  **R$920,00** ou **R$1.320,00**, respectivamente.
- Para um salário bruto de **R$1.500,01** ou **R$10.000,00**, deverá ser aplicado o desconto de 11% resultando em valores líquidos de **R$1.335,00** ou **R$ 8.900,00**, respectivamente.

### Segundo passo

Após obter o valor do **salário bruto - INSS**, utilizaremos esse valor como referência para realizar o cálculo do IRRF e realizar o desconto correto. Esse valor de referência (salário bruto - INSS) deverá ter um percentual descontado de acordo com a tabela abaixo:

| Faixa salarial  |  Percentual de desconto  |
| --- | --- |
|  Até R$ 3.000,00 | ISENTO |
|  De R$ 3.000,01 até R$ 6.000,00 | 7.5% |
|  Acima de R$ 6.000,00 |  15% |

**Exemplo**

- Após descontar o INSS, obtivemos o valor de **R$1.320,00**, como esse valor é até R$ 3.000,00, não haverá desconto do IRRF, totalizando um **salário líquido final de R$ 1.320,00**.
- Após descontar o INSS, obtivemos o valor de **R$8.900,00**, como esse valor é maior que **R$3.000,00**, haverá o desconto de **15%** desse valor, totalizando um **salário líquido final de R$7.565,00**. 

**Observações**
- Caso o valor do salário base recebido seja abaixo do salário mínimo **(R$ 1.039,00)**, o algoritmo deve retornar **0.0**.

## Tópicos

Neste desafio, você aprenderá::
- Variáveis e métodos;
- Operadores aritméticos;
- Operadores lógicos;
- Controle de fluxo (estrutura condicional).

## Requisitos
Para este desafio você precisará 

- Java 8++

Para instalar no MacOS, usando o HomeBrew basta executar:

    brew cask install java

Para instalar no Linux e no Windows, confira os links na seção de conteúdo.

