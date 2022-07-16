# 017---Project-Spring-Amigo

Studies related Spring Boot Project.

.
.
.
.
.
.
.
.
.
.
.
# Notes

mysql-connector and spring-jpa dependencies are needed to connect to MySQL and Spring Boot APP.
model -> api(controller) -> Service -> Repository(database)

# Path

1. Model
2. Database Connection
3. Controller(API)
4. Service
5. Repository(Interface)
6. Configuration

StudentController <<-- StudentService <<-- [StudentRepository] -->> StudentConfig
// note - [StudentRepository] used(extends) JPARepository methods/ functions to perform at [StudentService] and [StudenConfig]