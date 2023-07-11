FROM openjdk:17
EXPOSE 8083
ADD target/docker-assesment.jar docker-assesment.jar
ENTRYPOINT ["java","-jar","/docker-assesment.jar"]