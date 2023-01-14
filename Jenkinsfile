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
                    sh './gradlew clean build --no-daemon'
                }
            }
        }
        stage('Docker Build and Tag') {
           steps {
                script {
                    sh 'docker build -t demo2:latest .'
                    sh 'docker tag demo2 akashy075/demo2:latest'
                }
           }
        }
        stage('Publish image to Docker Hub') {
           steps {
                script {
                    withCredentials([usernamePassword(credentialsId: 'dockerHub', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')]) {
                        sh 'docker push akashy075/demo2:latest'
                    }
                }
           }
        }
    }
}