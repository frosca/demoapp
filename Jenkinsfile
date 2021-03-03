node {
  def mvnHome = tool name: 'maven-3', type: 'maven'
  
  stage('SCM Checkout') {
    git 'https://github.com/frosca/demoapp/'
  }
  
  stage('Compile') {
    bat "${mvnHome}/bin/mvn clean compile"
  }

  stage('Test') {
   bat "${mvnHome}/bin/mvn test"
  }

 stage('Deploy') {
    bat 'docker-compose up --build -d'
 }

 stage('Health Check') {
    def response = bat 'curl http://localhost:8080/actuator/health'
    echo '${response}'
 }
 
  stage('Clean up') {
    bat 'docker-compose down'
 }
}
