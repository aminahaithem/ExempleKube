FROM openjdk:8
EXPOSE 8989
ADD target/ExempleKubernetesJenkins-Kubernetes.jar /home/devops/devops/ExempleKubernetesJenkins-Kubernetes.jar
ENTRYPOINT ["java","-jar","ExempleKubernetesJenkins-Kubernetes.jar"]
