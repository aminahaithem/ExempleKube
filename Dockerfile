FROM openjdk:8
EXPOSE 8989
ADD target/ExempleKubernetesJenkins-Kubernetes.jar ExempleKubernetesJenkins-Kubernetes.jar
ENTRYPOINT ["java","-jar","ExempleKubernetesJenkins-Kubernetes.jar"]
