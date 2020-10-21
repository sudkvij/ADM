FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD target/employee-0.0.1-SNAPSHOT.jar employeeapp.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/employeeapp.jar"]
