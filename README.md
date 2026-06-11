# Atividade Java - Aprendizados em ProgramaA?A?o Orientada a Objetos

Este repositA?rio reA?ne atividades desenvolvidas em Java durante as aulas, com uma evoluA?A?o gradual desde os fundamentos da linguagem atA? os primeiros conceitos de ProgramaA?A?o Orientada a Objetos (POO).

O projeto foi organizado por aulas dentro da pasta `src`, permitindo acompanhar a sequA?ncia dos conteA?dos estudados e praticados.

## Objetivo do projeto

O objetivo principal deste projeto A? registrar meus aprendizados em Java, praticando:

- Estrutura bA?sica de um programa Java.
- DeclaraA?A?o e uso de variA?veis.
- Entrada e saA?da de dados.
- Operadores aritmA?ticos.
- Estruturas condicionais.
- Estruturas de repetiA?A?o.
- ManipulaA?A?o de textos.
- Matrizes.
- MA?todos.
- Classes e objetos.
- Construtores.
- Relacionamento entre classes.
- HeranA?a.
- Uso de datas com `LocalDate`.
- Tratamento de erros com `try/catch`.

## Estrutura das aulas

### Aula 1 - Primeiro programa em Java

Na `Aula1`, foi praticada a estrutura inicial de uma classe Java com o mA?todo `main`.

Aprendizados:

- CriaA?A?o de uma classe.
- Uso do mA?todo `public static void main`.
- ImpressA?o de mensagens com `System.out.println`.
- Primeiro contato com pacotes (`package`).

Arquivo principal:

- `A01ex01.java`

## Aula 2 - VariA?veis, operadores e entrada de dados

Na `Aula2`, foram praticados conceitos bA?sicos de variA?veis, tipos de dados e cA?lculos.

Aprendizados:

- Uso de `String`, `int` e `double`.
- OperaA?A?es matemA?ticas como soma, produto, mA?dia e resto da divisA?o.
- Entrada de dados com `Scanner`.
- ConversA?o de argumentos recebidos pelo `args`.
- ExibiA?A?o de resultados no console.

Arquivos:

- `A02ex01.java`
- `A02ex02.java`
- `A02ex03.java`

## Aula 3 - Entrada grA?fica e estruturas condicionais

Na `Aula3`, os exercA?cios evoluA?ram para entrada e saA?da grA?fica usando `JOptionPane`, alA?m da aplicaA?A?o de decisA?es com `if`, `else if` e `else`.

Aprendizados:

- Entrada de dados com caixas de diA?logo.
- ConversA?o de texto para nA?mero com `Double.parseDouble`.
- CA?lculo de A?rea.
- AplicaA?A?o de regras de classificaA?A?o.
- Uso de condicionais para definir resultados.

Arquivos:

- `A03ex01.java`
- `A03ex02.java`
- `A03ex03.java`

## Aula 4 - Condicionais, repetiA?A?o e manipulaA?A?o de texto

Na `Aula4`, foram praticadas estruturas de controle mais completas.

Aprendizados:

- LaA?o `for` para contagem progressiva.
- Estrutura `switch` para criaA?A?o de uma calculadora.
- ValidaA?A?o de divisA?o por zero.
- Uso de `Math.pow` para potA?ncia.
- ManipulaA?A?o de texto com `replaceAll`.
- Uso de `contains` para verificar palavras em uma frase.

Arquivos:

- `A04ex01.java`
- `A04ex02.java`
- `A04ex03.java`
- `A04ex04.java`

## Aula 5 - Matrizes

Na `Aula5`, os exercA?cios trabalharam com matrizes bidimensionais.

Aprendizados:

- CriaA?A?o de matriz `int[][]`.
- Preenchimento de matriz com laA?os aninhados.
- ExibiA?A?o formatada de valores.
- AlteraA?A?o de elementos pares e A?mpares.
- Uso de lA?gica condicional dentro de uma matriz.

Arquivos:

- `A05ex01.java`
- `A05ex02.java`

## Aula 6 - MA?todos e reaproveitamento de cA?digo

Na `Aula6`, foi iniciado o estudo de mA?todos, separando responsabilidades em blocos reutilizA?veis.

Aprendizados:

- CriaA?A?o de mA?todos `static`.
- MA?todos com retorno, como `String buscarNome(int codigo)`.
- MA?todos sem retorno, como `void mostrarMaior`.
- Passagem de parA?metros.
- Sobrecarga de mA?todos com o mesmo nome e parA?metros diferentes.
- SeparaA?A?o de lA?gica em uma classe auxiliar, como `Calendario`.
- Reaproveitamento de mA?todos entre classes.

Arquivos:

- `A06ex01.java`
- `A06ex02.java`
- `A06ex03.java`
- `A06ex04.java`
- `A06ex05.java`
- `A06ex06.java`
- `Calendario.java`

## Aula 7 - Classes, objetos, construtores e associaA?A?o

Na `Aula7`, o projeto entra mais diretamente em ProgramaA?A?o Orientada a Objetos.

Foram criadas as classes `Fabricante` e `Produto`, alA?m de uma classe principal para testar os objetos.

Aprendizados de POO:

- Uma classe representa um modelo para criar objetos.
- Um objeto A? uma instA?ncia de uma classe.
- A classe `Fabricante` possui o atributo `nome`.
- A classe `Produto` possui os atributos `nome`, `modelo` e `fabricante`.
- Foram criados construtores vazios e construtores com parA?metros.
- O uso de `this` ajuda a diferenciar atributos da classe dos parA?metros recebidos.
- A classe `Produto` se relaciona com a classe `Fabricante`, mostrando associaA?A?o entre objetos.

Exemplo de conceito praticado:

```java
Fabricante samsung = new Fabricante("Samsung");
Produto hd = new Produto("HD", "SSD 1TB", samsung);
```

Esse exemplo mostra que um produto pode possuir um fabricante, ou seja, um objeto pode guardar referA?ncia para outro objeto.

Arquivos:

- `Fabricante.java`
- `Produto.java`
- `main.java`

## Aula 8 - MA?todos de instA?ncia e heranA?a

Na `Aula8`, foram praticados conceitos importantes de POO, como mA?todos de instA?ncia e heranA?a.

Aprendizados de POO:

- CriaA?A?o de classes com comportamentos prA?prios.
- MA?todos de instA?ncia, como `ligar`, `desacelerando` e `acelerar`.
- CriaA?A?o da classe `Veiculo`.
- CriaA?A?o da classe `Moto` herdando de `Veiculo` com `extends`.
- Entendimento de que uma classe filha pode herdar comportamentos de uma classe pai.

Exemplo de heranA?a:

```java
class Moto extends Veiculo {
}
```

Nesse caso, `Moto` herda o comportamento de `Veiculo`, como o mA?todo `acelerar`.

Arquivos:

- `Veiculo.java`
- `Carro.java`

## Aula 9 - Datas, repetiA?A?o e tratamento de erro

Na `Aula9`, foi desenvolvido um programa para listar o perA?odo de fA?rias de um funcionA?rio.

Aprendizados:

- Uso de `LocalDate` para trabalhar com datas.
- FormataA?A?o de datas com `DateTimeFormatter`.
- ConversA?o de texto para data.
- ValidaA?A?o de data inicial e final.
- Uso de `while` para percorrer um intervalo de datas.
- Tratamento de erro com `try/catch`.
- Captura de `DateTimeParseException` para datas invA?lidas.

Arquivo:

- `FeriasFuncionario.java`

## Principais aprendizados em ProgramaA?A?o Orientada a Objetos

Com base nos arquivos das aulas, os principais conceitos de POO praticados foram:

### Classe

Classe A? um modelo que define atributos e comportamentos. No projeto, exemplos de classes sA?o:

- `Produto`
- `Fabricante`
- `Carro`
- `Veiculo`
- `Calendario`

### Objeto

Objeto A? uma instA?ncia criada a partir de uma classe. Na `Aula7`, foram criados objetos como:

```java
Fabricante logitech = new Fabricante("Logitech");
Produto mouse = new Produto("Mouse", "M170", logitech);
```

### Atributos

Atributos sA?o caracterA?sticas de uma classe. Por exemplo, em `Produto`:

```java
String nome;
String modelo;
Fabricante fabricante;
```

### MA?todos

MA?todos representam aA?A?es ou comportamentos. Exemplos:

- `buscarNome`
- `mostrarMaior`
- `nomeDiaSemana`
- `ligar`
- `acelerar`

### Construtores

Construtores sA?o usados para inicializar objetos. Na classe `Produto`, foi usado um construtor com parA?metros:

```java
public Produto(String nome, String modelo, Fabricante fabricante) {
    this.nome = nome;
    this.modelo = modelo;
    this.fabricante = fabricante;
}
```

### AssociaA?A?o

AssociaA?A?o acontece quando uma classe se relaciona com outra. No projeto, `Produto` possui um `Fabricante`, mostrando que objetos podem se conectar.

### HeranA?a

HeranA?a permite que uma classe aproveite caracterA?sticas e comportamentos de outra. Na `Aula8`, `Moto` herda de `Veiculo`:

```java
class Moto extends Veiculo {
}
```

## ConclusA?o

Este projeto mostra minha evoluA?A?o nos estudos de Java. Comecei com comandos simples de saA?da no console, avancei para variA?veis, entrada de dados, cA?lculos, condicionais, laA?os, matrizes e mA?todos, atA? chegar aos primeiros pilares da ProgramaA?A?o Orientada a Objetos.

As aulas finais mostram a importA?ncia de organizar o cA?digo em classes, criar objetos, usar construtores, relacionar classes entre si e aplicar heranA?a. Esses conceitos sA?o essenciais para desenvolver sistemas Java mais organizados, reutilizA?veis e fA?ceis de manter.

