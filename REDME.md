# Nuach Server

### Requirements
- JDK21
- Maven
- Docker

### Build
- `./mvnw package && java -jar target/gs-spring-boot-docker-0.1.0.jar`

- `mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)`

- `docker build -t nuach/server .`

- `docker run -p 8080:8080 -t nuach/server`