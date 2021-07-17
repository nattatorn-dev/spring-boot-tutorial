## Run the Application

```sh
$ ./mvnw spring-boot:run
```

### Feature
- Annotations
- Validations
- H2 DataStore
- Lombok

#### Mysql
```sh
docker run --name=mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=dcbapp -p 3306:3306 -d mysql
```