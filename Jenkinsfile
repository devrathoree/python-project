pipeline {  agent any 
  stages {
        stage('Build') { 
            steps {
                echo "This is Build step."
            }
        }
        stage('Test') { 
            steps {
                echo "This is Test step."
            }
        }
        stage('Deploy') {         
            steps {
              script{
                 echo "This is Deploy step."
                 def branchName = "${env.BRANCH_NAME}"
                  echo "Branch Name: ${branchName}"
                  if (branchName == "master") {
                    println("Deploying to Prod.")
                  }  
                  else if (branchName == "test") {
                    println("Deploying to Test.")
                  } 
                  else {
                   println("Deploying to some other branch.")
                  }
               }              }            }
        }
    }
}
