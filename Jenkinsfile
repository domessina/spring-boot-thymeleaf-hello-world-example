pipeline {
  agent {
    docker {
      image 'maven:3.3.9-jdk-8'
    }

  }
  stages {
    stage('initialize') {
      steps {
        sh '''echo PATH = ${PATH}
echo MAVEN_HOME = ${MAVEN_HOME}
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