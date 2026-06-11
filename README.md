<p align="center">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="150" alt="Java Logo">
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-POO-yellow?logo=java">
  <img src="https://img.shields.io/badge/Status-%20Concluído-success">
  <img src="https://img.shields.io/badge/IFSP-Extensão-blue">
</p>

# ☕ Atividades Java - Aprendizados em Programação Orientada a Objetos

---

## 📚 Sobre o Projeto

Este repositório reúne atividades desenvolvidas em **Java** durante as aulas da graduação, apresentando uma evolução gradual desde os fundamentos da linguagem até os primeiros conceitos de **Programação Orientada a Objetos (POO)**.

O projeto foi organizado por aulas dentro da pasta `src`, permitindo acompanhar a sequência dos conteúdos estudados e praticados ao longo do aprendizado.

---

## 🎯 Objetivo do Projeto

O principal objetivo deste projeto é registrar minha evolução nos estudos de Java, praticando conceitos fundamentais como:

- Estrutura básica de programas Java;
- Declaração e utilização de variáveis;
- Entrada e saída de dados;
- Operadores aritméticos;
- Estruturas condicionais;
- Estruturas de repetição;
- Manipulação de textos;
- Matrizes;
- Métodos;
- Classes e objetos;
- Construtores;
- Relacionamento entre classes;
- Herança;
- Manipulação de datas com `LocalDate`;
- Tratamento de exceções com `try/catch`.

---

# 📂 Estrutura das Aulas

---

## ⌨️ Aula 1 - Primeiro Programa em Java

Na **Aula 1**, foi praticada a estrutura inicial de uma aplicação Java utilizando o método `main`.

### Aprendizados

- Criação de classes;
- Uso do método `public static void main`;
- Impressão de mensagens com `System.out.println`;
- Primeiro contato com pacotes (`package`).

### Arquivo

```text
A01ex01.java
```

---

## 🔢 Aula 2 - Variáveis, Operadores e Entrada de Dados

Na **Aula 2**, foram praticados conceitos básicos de variáveis, tipos de dados e cálculos.

### Aprendizados

- Uso de `String`, `int` e `double`;
- Operações matemáticas;
- Cálculo de média e resto da divisão;
- Entrada de dados com `Scanner`;
- Conversão de argumentos recebidos via `args`;
- Exibição de resultados no console.

### Arquivos

```text
A02ex01.java
A02ex02.java
A02ex03.java
```

---

## 🖥️ Aula 3 - Entrada Gráfica e Estruturas Condicionais

Na **Aula 3**, os exercícios evoluíram para entrada e saída gráfica utilizando `JOptionPane`.

### Aprendizados

- Entrada de dados por caixas de diálogo;
- Conversão de texto para número com `Double.parseDouble`;
- Cálculo de área;
- Aplicação de regras de classificação;
- Estruturas `if`, `else if` e `else`.

### Arquivos

```text
A03ex01.java
A03ex02.java
A03ex03.java
```

---

## 🔀 Aula 4 - Condicionais, Repetição e Manipulação de Texto

Na **Aula 4**, foram utilizados recursos mais avançados de controle de fluxo.

### Aprendizados

- Laço `for`;
- Estrutura `switch`;
- Validação de divisão por zero;
- Uso de `Math.pow`;
- Manipulação de texto com `replaceAll`;
- Busca de palavras utilizando `contains`.

### Arquivos

```text
A04ex01.java
A04ex02.java
A04ex03.java
A04ex04.java
```

---

## 🧮 Aula 5 - Matrizes

Na **Aula 5**, foram desenvolvidas atividades utilizando matrizes bidimensionais.

### Aprendizados

- Criação de matrizes `int[][]`;
- Preenchimento com laços aninhados;
- Exibição formatada;
- Alteração de elementos pares e ímpares;
- Aplicação de lógica condicional em matrizes.

### Arquivos

```text
A05ex01.java
A05ex02.java
```

---

## ⚙️ Aula 6 - Métodos e Reaproveitamento de Código

Na **Aula 6**, iniciou-se o estudo de métodos para organizar e reutilizar código.

### Aprendizados

- Métodos `static`;
- Métodos com retorno;
- Métodos sem retorno;
- Passagem de parâmetros;
- Sobrecarga de métodos;
- Classe auxiliar `Calendario`;
- Reutilização de código.

### Arquivos

```text
A06ex01.java
A06ex02.java
A06ex03.java
A06ex04.java
A06ex05.java
A06ex06.java
Calendario.java
```

---

## 🏗️ Aula 7 - Classes, Objetos, Construtores e Associação

Nesta aula, foram introduzidos conceitos fundamentais da Programação Orientada a Objetos.

### Aprendizados

- Criação de classes e objetos;
- Atributos e construtores;
- Uso da palavra-chave `this`;
- Associação entre objetos;
- Modelagem de relacionamentos entre classes.

### Exemplo

```java
Fabricante samsung = new Fabricante("Samsung");
Produto hd = new Produto("HD", "SSD 1TB", samsung);
```

### Arquivos

```text
Fabricante.java
Produto.java
Main.java
```

---

## 🚗 Aula 8 - Métodos de Instância e Herança

Nesta aula, foram explorados conceitos importantes da orientação a objetos.

### Aprendizados

- Métodos de instância;
- Classe `Veiculo`;
- Herança com `extends`;
- Reutilização de comportamentos;
- Especialização de classes.

### Exemplo

```java
class Moto extends Veiculo {
}
```

### Arquivos

```text
Veiculo.java
Carro.java
```

---

## 📅 Aula 9 - Datas e Tratamento de Exceções

Na **Aula 9**, foi desenvolvido um sistema para exibição de férias de funcionários.

### Aprendizados

- Uso de `LocalDate`;
- Formatação com `DateTimeFormatter`;
- Conversão de texto para data;
- Estruturas de repetição;
- Tratamento de exceções;
- Uso de `DateTimeParseException`.

### Arquivo

```text
FeriasFuncionario.java
```

---

# 🧠 Principais Conceitos de POO Aplicados

## 📦 Classe

Uma classe funciona como um modelo para criação de objetos.

Exemplos:

- `Produto`
- `Fabricante`
- `Veiculo`
- `Carro`
- `Calendario`

---

## 🎯 Objeto

Objetos são instâncias criadas a partir de classes.

```java
Fabricante logitech = new Fabricante("Logitech");
Produto mouse = new Produto("Mouse", "M170", logitech);
```

---

## 🏷️ Atributos

Representam as características de uma classe.

```java
String nome;
String modelo;
Fabricante fabricante;
```

---

## ⚡ Métodos

Representam ações ou comportamentos.

Exemplos:

- `buscarNome()`
- `mostrarMaior()`
- `nomeDiaSemana()`
- `ligar()`
- `acelerar()`

---

## 🛠️ Construtores

Responsáveis por inicializar objetos.

```java
public Produto(String nome, String modelo, Fabricante fabricante) {
    this.nome = nome;
    this.modelo = modelo;
    this.fabricante = fabricante;
}
```

---

## 🔗 Associação

Ocorre quando uma classe se relaciona com outra.

```text
Produto → Fabricante
```

---

## 🧬 Herança

Permite reutilizar atributos e comportamentos de outra classe.

```java
class Moto extends Veiculo {
}
```

---

# 🎓 Conclusão

Este projeto representa minha evolução nos estudos de **Java**, desde os primeiros programas executados no console até a aplicação dos conceitos fundamentais da **Programação Orientada a Objetos**.

Ao longo das atividades, foram praticados conceitos como variáveis, estruturas condicionais, laços de repetição, matrizes, métodos, classes, objetos, construtores, associação e herança. Esses conhecimentos são essenciais para o desenvolvimento de aplicações Java mais organizadas, reutilizáveis e de fácil manutenção.

O repositório serve como um registro do meu aprendizado e da minha evolução acadêmica na área de desenvolvimento de software.

---

## 💻 Desenvolvido por

**Matheus Dias Pereira**  

🎓 Software Engineer 

---