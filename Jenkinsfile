pipeline {
  agent none
  stages {
    stage('Maven Install') {
      agent {
        docker {
          image 'maven:3.5.0'
        }
      }
      steps {
		echo 'Making build.'
		sh 'mvn clean install'
      }
    } 
  stage('Docker Build') {
      agent any
      steps {
        sh 'docker build -t coinclaim:latest .'
      }
    }
	  
	  stage('Docker push') {
       agent any
       steps {
       sh docker.withRegistry('https://registry.hub.docker.com', 'docker030303'){
       def customIMage =docker.build('coinclaim:latest')
       customIMage.push()
       }
      }
    }
  }
}
