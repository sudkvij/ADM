# we will use openjdk 8 with alpine as it is a very small linux distro
##FROM openjdk:8-jdk-alpine
# copy the packaged jar file into our docker image
#COPY target/employee-0.0.1-SNAPSHOT.jar /employeeapp.jar
# set the startup command to execute the jar
#CMD ["java", "-jar", "/employeeapp.jar"]

#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#EXPOSE 8080
#RUN mkdir -p /app/
#RUN mkdir -p /app/logs/
#ADD target/employee-0.0.1-SNAPSHOT.jar /app/app.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=container", "-jar", "/app/app.jar"]

FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD target/employee-0.0.1-SNAPSHOT.jar employeeapp.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/employeeapp.jar"]