FROM openjdk:8
EXPOSE 8080


ADD target/deployapi.jar deployapi.jar


ENTRYPOINT ["java", "-jar", "/deployapi.jar"]