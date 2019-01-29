FROM openjdk:8
ADD target/docker_demo.jar docker_demo.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "docker_demo.jar"]