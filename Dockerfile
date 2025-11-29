FROM eclipse-temurin:21-jdk
EXPOSE 8080
ADD target/devops-docker-jenkins-pipeline.jar devops-docker-jenkins-pipeline.jar
ENTRYPOINT ["java","-jar","devops-docker-jenkins-pipeline.jar"]