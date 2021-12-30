pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Hello World'
                maven(command: "clean compile")

            }
        }
    }
}
