Banco de Sangue

Resumo

Este projeto em Java simula o gerenciamento centralizado de um banco de sangue utilizando conceitos de Programação Orientada a Objetos (POO). O sistema permite cadastrar hemocentros, registrar doadores, controlar o estoque de bolsas de sangue e realizar transferências entre unidades.

Dependências e Requisitos

Linguagem: Java (JDK 8 ou superior).

Bibliotecas: Nenhuma biblioteca externa é necessária (apenas o padrão da linguagem).

Ferramentas: Terminal, Prompt de Comando ou qualquer IDE de sua escolha (Eclipse, IntelliJ, etc.).

Instruções de Instalação e Execução

Organize os arquivos do código-fonte em um diretório seguindo o pacote (ex: src/bancodesangue/).

Abra o terminal e navegue até a raiz do projeto (onde está a pasta src).

Compile os arquivos e envie para uma pasta bin:

mkdir bin
javac -d bin src/bancodesangue/*.java


Execute o programa através da classe principal:

java -cp bin bancodesangue.Main


Exemplo de Uso

A classe Main já está configurada com um script de demonstração que registra unidades, doadores e executa transferências. Ao rodar o sistema, a saída no console mostrará as ações ocorrendo:

Hemocentro Hemomias incluido.
Hemocentro Hemoce incluido.
Foi inserido a doação ao hemocentro Hemomias
Foi inserido a doação ao hemocentro Hemoce
Hemocentro: Hemomias
O tipo sanguíneo: A+, A quantidade de bolsas: 1
