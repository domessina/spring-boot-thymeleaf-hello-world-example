pipeline {
  agent {
    docker {
      image 'maven:3.3.9-jdk-8'
      args ' -w C:\\\\Users\\\\d.messina\\\\.jenkins\\\\workspace\\\\full-workflow_blue-ocean'
    }

  }
  stages {
    stage('initialize') {
      steps {
        sh '''echo PATH = ${PATH}
echo M2_HOME = ${M2_HOME}
mvn clean'''
      }
    }
    stage('Build') {
      steps {
        sh 'mvn install'
      }
    }
    stage('Report JUnit') {
      steps {
        junit(testResults: '/target/surefire-reports/*', allowEmptyResults: true)
      }
    }
  }
}