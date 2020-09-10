  node {
	stage ('SCM checkout'){
		git "https://github.com/n111391/pipes"
		}
	stage ('Build'){
    	dir("CucumberJava") {
	   bat "mvn clean install"
       }
       	dir("CucumberJava/target") {
	   bat "java -jar CucumberJava 0.0.1-SNAPSHOT.jar"
       }
		}
}
