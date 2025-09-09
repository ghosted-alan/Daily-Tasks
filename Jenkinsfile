pipeline {
    agent any

    tools {
        maven 'Maven3'      
        jdk 'JDK11'         
    }

    environment {
        BASE_URL = "http://parabank.parasoft.com/parabank/index.htm"
    }

    stages {
        stage('Checkout') {
            steps {
                
                git branch: 'main', url: 'https://github.com/your-repo/BankingAutomation.git'
            }
        }

        stage('Build') {
            steps {
                echo "Building project..."
                sh 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                echo "Running TestNG tests..."
                sh 'mvn test -DsuiteXmlFile=testng.xml -DbaseUrl=${BASE_URL}'
            }
        }

        stage('Reports') {
            steps {
                echo "Archiving reports..."
                publishHTML(target: [
                    allowMissing: false,
                    keepAll: true,
                    reportDir: 'test-output',
                    reportFiles: 'index.html',
                    reportName: 'TestNG Report'
                ])
                publishHTML(target: [
                    allowMissing: false,
                    keepAll: true,
                    reportDir: 'test-output',
                    reportFiles: 'ExtentReport.html',
                    reportName: 'Extent Report'
                ])
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
            archiveArtifacts artifacts: 'test-output/**/*.*', fingerprint: true
        }
        success {
            echo '✅ Build and tests succeeded!'
        }
        failure {
            echo '❌ Build or tests failed. Please check reports.'
        }
    }
}