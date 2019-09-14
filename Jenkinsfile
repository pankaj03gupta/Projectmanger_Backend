node{
   stage('SCM Checkout'){
     git 'https://github.com/pankaj03gupta/Projectmanger_Backend'
   }
   stage('Compile-Package'){
      // Get maven home path
      def mvnHome =  tool name: 'maven-3', type: 'maven'   
      sh "${mvnHome}/bin/mvn package"
      def jdkHome =  tool name: 'jdk', type: 'jdk8'   
      sh "${jdkHome}/bin package"
   }
   
}
