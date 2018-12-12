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
	   stage('Docker Push'){
		  docker.withRegistry('https://registry.hub.docker.com', 'docker030303@'){
		  	app.push('coinclaim:latest')
		  }
	  }
  }
}
