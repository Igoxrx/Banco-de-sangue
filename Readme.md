# Banco de Sangue

## Resumo

Este projeto em Java simula o gerenciamento centralizado de um banco de sangue utilizando conceitos fundamentais de Programação Orientada a Objetos (POO). O sistema permite o cadastro de hemocentros, o registro de doadores, o controle de estoque de bolsas de sangue e a realização de transferências entre diferentes unidades.

## Dependências e Requisitos

* **Linguagem:** Java (JDK 8 ou superior).
* **Bibliotecas:** Nenhuma biblioteca externa é necessária (apenas o padrão da linguagem).
* **Ferramentas:** Terminal, Prompt de Comando ou qualquer IDE de sua escolha (Eclipse, IntelliJ, etc.).

## Instruções de Instalação e Execução

Para rodar o projeto manualmente, siga os passos abaixo:

1.  **Organização dos arquivos:**
    Organize os arquivos do código-fonte em um diretório seguindo a estrutura do pacote (ex: `src/bancodesangue/`).

2.  **Acesso ao Terminal:**
    Abra o terminal e navegue até a raiz do projeto (onde está a pasta `src`).

3.  **Compilação:**
    Crie uma pasta para os binários e compile os arquivos:
    ```bash
    mkdir bin
    javac -d bin src/bancodesangue/*.java
    ```

4.  **Execução:**
    Execute o programa através da classe principal:
    ```bash
    java -cp bin bancodesangue.Main
    ```

## Exemplo de Uso

A classe `Main` já está configurada com um script de demonstração que registra unidades, doadores e executa transferências. Ao rodar o sistema, a saída no console mostrará as ações ocorrendo conforme o exemplo abaixo:

```text
Hemocentro Hemomias incluido.
Hemocentro Hemoce incluido.
Foi inserido a doação ao hemocentro Hemomias
Foi inserido a doação ao hemocentro Hemoce
Hemocentro: Hemomias
O tipo sanguíneo: A+, A quantidade de bolsas: 1
```

## Licença

Este projeto é destinado a fins educacionais para demonstrar a aplicação de POO em sistemas de gerenciamento.
