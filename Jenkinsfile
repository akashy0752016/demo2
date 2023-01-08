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
    }
}