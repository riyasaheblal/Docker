FROM openjdk:17
EXPOSE 8080
ADD target/dockertest.jar dockertest.jar
ENTRYPOINT ["java","-jar","/dockertest.jar"]