FROM openjdk:8-jdk-alpine
EXPOSE 8989
ADD target/*.jar exempleKubernetesJenkins-Kubernetes.jar
ENTRYPOINT ["java","-jar","./exempleKubernetesJenkins-Kubernetes.jar"]
