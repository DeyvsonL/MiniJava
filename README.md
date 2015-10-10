#MiniJava

Disciplina: Teoria e Implementa��o de Linguagens Computacionais

Implementa��o de analizador l�xico para a linguagem MiniJava, um subconjunto de Java.

##Elementos L�xicos

* **Whitespace** - Espa�os em branco, quebras de linha, tabula��es e carriage return
* **Coment�rios** - Qualquer texto entre /* e */
* **Palavras-chave** - class, public, extends, static, void, int, boolean, while, if, else, return,
false, true, this, new
* **Operadores** -  ||, &&, ==, !=, <, <=, >, >=, +, -, *, /, %, !
* **Delimitadores** -  ; . , = ( ) { } [ ]
* **Identificadores** -  um identificador come�a com uma letra ou underline e � seguido por
qualquer quantidade de letras, underline e d�gitos. Apenas letras entre A/a e Z/z s�o permitidos,
h� diferen�a entre mai�scula e min�scula. Palavras-chave n�o s�o identificadores
* **Literais Inteiros** - uma sequ�ncia de d�gitos iniciada com qualquer um dos d�gitos entre 1 e 9
e seguida por qualquer n�mero de d�gitos entre 0 e 9. O d�gito 0 tamb�m � um inteiro.
* **Literais ponto flutuante** - Uma parte inteira seguida de uma parte fracion�ria, separada por
ponto. A parte fracion�ria, podemos incluir um expoente, seguindo os exemplos dos slides de an�lise
l�xica.

*Obs.: Coment�rios e whitespace n�o tem significado algum, exceto para separar os tokens.*