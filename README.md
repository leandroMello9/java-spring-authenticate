 🛡️ Aplicação de Autenticação JWT com Spring Boot
 Esta é uma aplicação de autenticação utilizando JWT (JSON Web Token) desenvolvida com Spring Boot. Ela permite o cadastro, login e acesso a rotas protegidas com base em tokens JWT, utilizando um banco de dados MySQL para persistência.
 
 ✅ Pré-requisitos
 Certifique-se de ter instalado:
 
 Docker
 
 Java 17 (OpenJDK)
 
 Maven (caso vá rodar localmente)
 
 ⚙️ Subindo a Aplicação com Docker Compose
 Se você já possui o docker-compose.yml na raiz do projeto, basta executar:
 
 docker compose up -d
 
 A aplicação será iniciada na porta 8005.
 
 O banco de dados MySQL estará disponível na porta 3306.
 
 A tabela users será criada automaticamente na base de dados taskdb.
 
 Para verificar os containers ativos:
 docker container ls
 
 ▶️ Executando a Aplicação Localmente (sem Docker)
 Caso queira executar manualmente:
 
 Certifique-se de que o container do MySQL está rodando:
 
  docker run -d \
   -e MYSQL_ROOT_PASSWORD=secret \
   -e MYSQL_DATABASE=taskdb \
   --name mysqldb \
   -p 3307:3306 \
   mysql
 Execute a aplicação:
 
 mvn spring-boot:run
 
 A aplicação será iniciada na porta 8005.
 
 📬 Endpoints:
 
 🔐 Cadastro
 POST /api/auth/register
 {
   "username": "joao",
   "email": "joao@email.com",
   "password": "123456"
 }
 
 🔑 Login
 POST /api/auth/login
 {
   "username": "joao",
   "password": "123456"
 }
 
 Resposta:
 
 {
   "token": "eyJhbGciOiJIUzI1NiIsInR..."
 }
 
 🔒 Acesso Protegido
 GET /api/user/profile
 
 Headers:
 
 Authorization: Bearer <token>
