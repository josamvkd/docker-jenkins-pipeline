pipeline{
    agent any
    tools{
        maven 'M3'
    }
    stages{
        stage('Maven Build'){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/josamvkd/docker-jenkins-pipeline']])
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Image'){
            steps{
                script{
                    sh 'docker build -t josamvkd/devops-docker-jenkins-pipeline .'
                }
            }
        }
        stage('Push Image Hub '){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')])
                    {
                        sh 'docker login -u josamvkd -p ${dockerhubpwd}'
                    }
                    sh 'docker push josamvkd/devops-docker-jenkins-pipeline'
                }
            }
        }
    }
}