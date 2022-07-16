# 017---Project-Spring-Amigo

Studies related Spring Boot Project. Used Spring Boot, MySQL, Hibernate, Spring-JPA.

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
3. Controller(create API)
4. Service(code for get, post, update and delete)
5. Repository(Interface/ provide JpaRepository for database related functions)
~~6. Configuration (no need of this one)~~

StudentController <<-- StudentService <<-- [StudentRepository] -->> ~~StudentConfig~~
// note - [StudentRepository] used(extends) JPARepository methods/ functions to perform at [StudentService] and [StudenConfig]