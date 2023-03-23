## Projeto

Projeto Memes sugere uma estrutura de Serviços inicial para um sistema originalmente concebido como Monolito.

### Domínios Identificados

-> Usuarios </br>
-> Categorias </br>
-> Memes </br>

### Tecnologias utilizadas

-> Java 11 </br>
-> Spring 2.7.9 </br>
-> MongoDB </br>

### Observação

Necessário o MongoDB (mongod) instalado localmente para subir serviços.

MongoDB no Docker: </br>

a) Iniciar Docker Desktop; </br>
b) docker pull mongo </br>
c) docker run -v ~/docker --name mongodb -p 27017:27017 mongo </br>
d) Acompanhamento pelo Mongo Compass </br>

### Postman

-> Inserir um Meme: </br>

POST/memelandia/memes </br>

    {
      "nome": "Super-Soccer",
      "descricao": "Futebol",
      "imgUrl": "https://i.ytimg.com/vi/OAb0LLdCOAo/maxresdefault.jpg",
      "dataCadastro": "2023-03-23T15:08:49.462",
      "categoriaMeme": "1",
      "usuario": "2"
    }
