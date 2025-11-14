# 🚀 Desafio de Programação Orientada a Objetos (POO) em Java

Este projeto é a solução para o Desafio de POO do Bootcamp Java Developer, com o objetivo de demonstrar a aplicação dos quatro pilares da Orientação a Objetos em um sistema de gerenciamento de cursos e mentorias.

## 🎯 Objetivo do Projeto

Modelar a estrutura de uma plataforma de ensino (Bootcamp) utilizando os conceitos de Abstração, Encapsulamento, Herança e Polimorfismo. O sistema deve permitir a inscrição de Desenvolvedores (Devs) em Bootcamps, o registro de progresso e o cálculo da Experiência (XP) total adquirida.

## 💡 Pilares da POO Aplicados

O projeto foi estruturado utilizando as seguintes classes para demonstrar os pilares:

| Pilar | Classes/Recurso | Descrição da Aplicação |
| :--- | :--- | :--- |
| **Abstração** | `Conteudo`, `Dev`, `Bootcamp` | Foco no que é essencial (título, descrição, progresso, cálculo de XP). |
| **Encapsulamento** | Todos os atributos (`titulo`, `cargaHoraria`, etc.) | Utilização de modificadores `private` nos atributos e acesso por meio de métodos `public` (`getters` e `setters`) para proteger o estado interno dos objetos. |
| **Herança** | `Curso`, `Mentoria` | Ambas herdam da classe abstrata `Conteudo`, aproveitando atributos comuns e o contrato do método `calcularXp()`. |
| **Polimorfismo** | Método `calcularXp()` | O método possui implementações diferentes em `Curso` (XP baseado na carga horária) e em `Mentoria` (XP com bônus fixo). |

## 📁 Estrutura do Projeto

O código-fonte está organizado seguindo a convenção de pacotes Java:
desafio-poo-dio/ ├── src/ │ ├── br/com/dio/desafio/dominio/ │ │ ├── Conteudo.java │ │ ├── Curso.java │ │ ├── Mentoria.java │ │ ├── Bootcamp.java │ │ ├── Dev.java │ │ ├── Main.java (Classe de execução e testes) ├── .gitignore ├── README.md
## ⚙️ Como Executar

Para rodar o projeto e ver a aplicação dos conceitos de POO:

1.  **Clone o Repositório:**
    ```bash
    git clone [https://docs.github.com/pt/repositories/creating-and-managing-repositories/quickstart-for-repositories](https://docs.github.com/pt/repositories/creating-and-managing-repositories/quickstart-for-repositories)
    ```
2.  **Abra no VS Code:**
    Abra a pasta clonada (`desafio-poo-dio`) no Visual Studio Code.
3.  **Execute a Classe Principal:**
    Execute a classe `Main.java` (o VS Code deve ter um botão 'Run' diretamente nela).

A saída no console demonstrará o processo de inscrição do `Dev`, o progresso (progredir()), e a soma final do XP, onde o Polimorfismo é aplicado para calcular corretamente o XP de Cursos e Mentorias.

---

"O README finaliza a etapa de documentação, garantindo a clareza e a rastreabilidade da solução de POO implementada."
