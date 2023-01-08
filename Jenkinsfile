pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/akashy0752016/demo2.git'
            }
        }
        stage('Build') {
            steps {
                script {
                    sh 'chmod +x ./gradlew'
                    sh './gradlew clean test --no-daemon'
                }
            }
        }
        stage('Docker Build and Tag') {
           steps {
                sh 'docker build -t demo2:latest .'
                sh 'docker tag demo2 akashy075/demo2:latest'
            }
        }
        stage('Docker Build and Tag') {
           withDockerRegistry([ credentialsId: "dockerHub", url: "" ])
           steps {
                sh 'docker build -t demo2:latest .'
                sh 'docker tag demo2 akashy075/demo2:latest'
            }
        }
    }
}