# Micro serviço para retorno de informações sobre texto

Serviço REST que contém apenas um método POST que recebe uma string no body e retorna um objeto contendo as seguintes informações:

*  O próprio texto
*  Número de caracteres no texto
*  Número de palavras
*  Número de buracos no texto
    *   Exemplo: 
        * 'B' e '8' tem 2 buracos
        * 'b' e 'O' tem 1 buraco 


POST:
`/text-information`  
body:
`Hello, World!`  
Response:

```
{  
    "texto": "Hello, World!",  
    "tamanho": 13,  
    "totalDePalavras": 2,  
    "totalDeBuracos": 4  
}
```
