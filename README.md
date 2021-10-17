<h1> ☕ API de Reservas de Quartos ☕</h1>
<p> ➤ <strong><i>Essa API foi desenvolvida em Java com acesso a banco PostgreSQL.  </i></strong></p>

<br><h2> 📋 UML do Projeto 📋</h2>

<h3> ● Estrutura das camadas: </h3>
<img src="https://user-images.githubusercontent.com/79023639/137562469-8007bda7-d827-411f-a3ed-d366505110eb.png" width=550/>

<h3> ● Diagrama UML (entidades): </h3>
<img src="https://user-images.githubusercontent.com/79023639/137640606-40c096c5-00aa-4248-8426-bc665e547d08.png" width=500/>

<h2>📋 Documentação 📋</h2>
  <p>➤ [POST] Criar usuário - <i><strong>/clients</strong></i></p>

  <p>➤ [GET] Listar os usuários- <i><strong>/clients</strong></i></p>

  <p>➤ [GET] Buscar um usuário por Id - <i><strong>/clients/{id}</strong></i></p>

  <p>➤ [PUT] Atualizar usuário por Id - <i><strong>/clients/{id}</strong></i></p>

  <p>➤ [DELETE] Excluir usuário por id - <i><strong>/clients/{id}</strong></i></p><br>
  
  <p><strong>HEROKU:</strong> <a href="https://bedrooms-reservation.herokuapp.com/clients">https://bedrooms-reservation.herokuapp.com/clients</a></p>
<hr>
<details>
    <br>
     <summary><b>IMAGENS DO PROJETO (CLIQUE AQUI PARA VER) </b></summary>
  <p><strong>Abra a imagem se estiver ruim de enxergar. ⚠️</strong></P>
  <ul>
    <li> <h2> EndPoints</h2> </li>
    <img src="https://user-images.githubusercontent.com/79023639/137640149-b4bc4aa3-6297-4a89-ab89-72126f285ed5.png" width=650>
    <li> <h2> GET (/clients) </h2> </li>
    <img src="https://user-images.githubusercontent.com/79023639/137640136-f77a0964-905c-43e8-927a-2f6205d30771.png" width=650>
    <li> <h2> GET (/clients/{id}) </h2> </li>
     <p>➤ Retornará apenas o usuário correspondente ao Id, mas se não tiver nenhum usuário com o id especificado retornará um status 404 </p>
    <img src="https://user-images.githubusercontent.com/79023639/137606207-aee63d8b-750f-4635-9919-504da5692501.png" width=650>
    <li> <h2> POST (/clients)</h2> </li>
    <p>➤ Retornará um status 201 e os dados dele se adicionar o novo usuário </p>
    <img src="https://user-images.githubusercontent.com/79023639/137640139-1d4d7a0b-2a1b-46de-89c0-d762ec0309f8.png" width=650>
    <li> <h2> PUT (/clients/{id})</h2> </li>
    <img src="https://user-images.githubusercontent.com/79023639/137640143-2d85a82a-409b-4236-a230-5444fd65c26f.png" width=650>
    <li> <h2> DELETE (/clients/{id})</h2> </li>
    <p>➤ Se ocorrer tudo bem irá retornar um status 204 </p>
    <img src="https://user-images.githubusercontent.com/79023639/137640148-1070f2dd-6a26-4923-b5bc-d7d67d27d2e8.png" width=650>
  </ul>
</details>

 <hr>
<h2>🛠️ Ferramentas Usadas 🛠️ </h2>
<p><img height="37em" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white">
<img height="37em" src="https://img.shields.io/badge/Hibernate-808080?style=for-the-badge&logo=Hibernate&logoColor=white">
<img height="37em" src="https://img.shields.io/badge/JPA-%230077B5?style=for-the-badge&logo=JPA&logoColor=white">
<img height="37em" src="https://camo.githubusercontent.com/281c069a2703e948b536500b9fd808cb4fb2496b3b66741db4013a2c89e91986/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f506f737467726553514c2d3331363139323f7374796c653d666f722d7468652d6261646765266c6f676f3d706f737467726573716c266c6f676f436f6c6f723d7768697465" 
data-canonical-src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&amp;logo=postgresql&amp;logoColor=white" style="max-width: 100%;">
<img height="37em" src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"></p>
