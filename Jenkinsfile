pipeline
{
    agent any
    stages {
        stage("Git")
        {
            steps{
              git "https://github.com/aminahaithem/ExempleKube.git"
            }
           
        }
        stage("compile")
        {
            steps{
                sh "mvn clean compile"
            }
        }
        stage("install")
        {
            steps{
                sh "mvn clean install package"
            }
        }
        stage("Build docker")
        {
            steps{
                sh "docker build -f Dockerfile -t  exemplekubernetesjenkins ."
            }
        }
		stage("deployment kubernetes")
        {
            steps{
                sh "kubectl create deployment exemplekubernetesjenkins --image=exemplekubernetesjenkins --port=8989"
            }
        }
              
    }
   
}