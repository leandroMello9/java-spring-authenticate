# java-spring-authenticate
Aplicação de autenticação JWT feita em spring boot.


<h2>Pré Requisitos</h2>
1 - Instalando Docker: https://docs.docker.com/engine/install/ubuntu/
2 - Instalando OpenJdk17: https://jdk.java.net/archive/
3 - Criando o container mysql para cadastrar os usuários, execute o seguinte comando <br/>
docker run -d -e MYSQL_ROOT_PASSWORD=secret -e MYSQL_DATABASE=taskdb --name mysqldb -p 3307:3306 mysql
4 - Verifique se o container foi criado e esta executando: <br/>
docker container ls


<h2>Iniciando Aplicação</h2>
 - No terminal execute o seguinte comando: <p>mvn spring-boot:run</p>
 obs: após iniciar a aplicação a tabela users será criada na base de dados.
 - A aplicação ira ser iniciada na porta 8005


 <h2>Iniciando Aplicação Com Docker Compose</h2>
 - No terminal execute o comando docker compose -d, ira subir a aplicação e o banco de dados.
 - A aplicação ira executar na porta 8005
 - O banco de dados na porta padrão 3306

 



