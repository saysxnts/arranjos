# Análise de Array com Java Streams

![Status](https://img.shields.io/badge/status-conclu%C3%ADdo-brightgreen)
![Java](https://img.shields.io/badge/Java-8%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

## 📖 Sobre o Projeto

Este é um programa em Java que demonstra a execução de operações de análise de dados em um array de inteiros. As funcionalidades incluem encontrar os valores mínimo e máximo, calcular a soma total e contar a frequência de um elemento específico.

O diferencial deste projeto é a implementação inteiramente baseada na **API de Streams do Java (Java 8+)**, que permite uma abordagem de programação funcional, resultando em um código mais conciso, declarativo e legível em comparação com laços de repetição tradicionais.

---

## ✨ Funcionalidades

- Encontrar o menor valor em um array de inteiros.
- Encontrar o maior valor em um array de inteiros.
- Calcular a soma de todos os elementos do array.
- Contar o número de ocorrências de um valor específico.
- Exibir um resumo completo com todos os resultados da análise.

---

## 🛠️ Tecnologias e Conceitos Praticados

- **Java (8 ou superior)**: Linguagem principal do projeto.
- **API de Streams**:
  - Criação de streams a partir de arrays com `Arrays.stream()`.
  - Operações terminais como `.min()`, `.max()`, `.sum()`, e `.count()`.
  - Operações intermediárias como `.filter()` para selecionar elementos.
  - Uso de `mapToInt()` para conversão de streams.
- **Programação Funcional (básico)**:
  - Expressões Lambda (ex: `n -> n.equals(numero)`).
  - Method References (ex: `Integer::compare`, `Integer::intValue`).
- **Classe `Optional`**: Tratamento de resultados que podem não existir (retorno de `.min()` e `.max()`), utilizando `orElseThrow()` para garantir a segurança.

---

## 🚀 Como Rodar o Projeto

### **Pré-requisitos**

- **JDK (Java Development Kit)** versão 8 ou superior.

### **Instalação e Execução**

1.  **Salve o código** em um arquivo chamado `Arranjo.java`.

2.  **Abra um terminal** na pasta onde você salvou o arquivo.

3.  **Compile o arquivo**:
    ```bash
    javac Arranjo.java
    ```

4.  **Execute o programa**:
    ```bash
    java Arranjo
    ```

### Exemplo de Saída

A execução do programa com os dados definidos no método `main` produzirá a seguinte saída no console:
```
Array fornecido:[940, 880, 830, 790, 750, 660, 650, 590, 510]
Menor número: 510
Maior número: 940
Soma dos números: 6500
O número 940 repete 1 vezes.
```

---

## ✒️ Autor

**Guilherme**
