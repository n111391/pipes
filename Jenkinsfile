pipeline {
  agent {
    node {
      label 'my-defined-label'
      customWorkspace '/some/other/path'
    }
	stage ('SCM checkout'){
		git "https://github.com/n111391/pipes"
		}
		
	 stage('Clean') {
                dir("CucumberJava"){
                    bat 'mvn clean'
                }
            }
     stage ('Build'){
    	dir("CucumberJava") {
			bat "mvn install"
		}
	}
	stage ('Run'){
       	dir("CucumberJava/target") {
			bat "java -jar CucumberJava 0.0.1-SNAPSHOT.jar"
		}
	}
post {
        always {
            dir("CucumberJava"){
                 bat 'mvn clean'
            }
        }
    }
}
}