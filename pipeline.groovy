pipeline {
    agent any

    stages {
        stage('Get Code') {
            steps {
                git changelog: false, poll: false,  url: 'https://github.com/EsraaElkheshen/Restful-Project.git'
            }
        }

        stage('Run Test') {
            steps {
                bat 'newman run  "Restful-Booker.postman_collection.json" -e "RestFull_Testing.postman_environment.json" --reporters=cli,htmlextra'
            }
        }
    }
}
