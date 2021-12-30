pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Hello World'
                sh "cd src"
                sh "javac main.java"
                sh "java main"

            }
        }
    }
}
