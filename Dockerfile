FROM openjdk:8
EXPOSE 8989
ADD target/ExempleKubernetesJenkins-Kubernetes.jar /usr/local/tomcat/webapps/ExempleKubernetesJenkins-Kubernetes.jar
ENTRYPOINT ["java","-jar","ExempleKubernetesJenkins-Kubernetes.jar"]
