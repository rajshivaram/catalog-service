FROM eclipse-temurin:17
COPY catalog-service-0.0.1-SNAPSHOT.jar catalog-service.jar
ENTRYPOINT ["java", "-jar", "catalog-service.jar"]


DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS flyway_schema_history;