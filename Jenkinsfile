pipeline {
    agent any
    
    
   

    stages {
        stage('Build') {
            steps {
                bat 'mvn compile' 
                echo 'Compiling Project....'
                echo 'Compiled Successfully'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
                echo 'Testing.....'
                echo 'Tested Successfully'
            }
        }
        
          stage('Packaging') {
            steps {
                bat 'mvn package'
                echo 'Packaging.....'
                echo 'JAR file  Successfully created'
            }
        }
            
         
    }
}