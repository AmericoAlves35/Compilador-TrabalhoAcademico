# Teoria da Computação e Compiladores - Paulista Noturno
DESENVOLVIMENTO DE COMPILADOR
PROF. FERNANDO KAKUGAWA



Alunos 8° semestre Paulista I Ciência da Computação (noturno):
125111361572 - Alan Morais Coutinho
125111352073 - Amanda Rodrigues Velloso Santana
125111376128 - Américo Alves dos Santos
125111356728 - Giovani Silva Santos
125111343786 - Gustavo Santos Nascimento

Descrição:
Arquivo com o codigo fonte se encontra no diretório 'src\antlr' o nome do arquivo .g4 e 'Atres';
No diretório 'src\testes' encontra-se o arquivo .txt denominado 'teste3', o mesmo ja possui um tete de todos os pontos requisitados no trabalho A3, mais um exemplo da gramatica aplicada a nossa linguagem;

para executar e compilar nossa liguagem basta usar os seguintes comandos respectivamente:
//no seu cmd altere o diretorio para onde o projeto esta salvo usando o comando 'cd' caso use Windows;
- cd diretorio_raiz\A3_antlr\src\antlr
//após esse passo vamos gerar os arquivos necessários do ANTLR com o seguinte comando;
- antlr4 Atres.g4
//assim que todos os arquivos ANTLR forem gerados basta compilar em java;
- javac *.java
//em seguida para gerar a arvore em java e verificar a procedencia dos testes sera necessario voltar um diretorio;
- cd ..
//para gerar a arvore em java e executar o arquivo para gerar o resultado final basta ultilizar o seguinte comando;
- grun antlr.Atres comeco testes\teste3.txt -gui

OBS.: para criar ou modificar os testes, recomendamos que altere ou crie dentro da pasta testes no diretorio 'src\testes';
