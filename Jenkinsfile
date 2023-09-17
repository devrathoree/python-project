pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
              script{
                  echo "This is Deploy step."
                  def branchName = "${env.BRANCH_NAME}"                 
                  
                  if(branchName == "master"){
                    steps {
                      echo 'start contanier'
                      echo "building container"
                      sh 'sudo apt update'
                      sh 'sudo apt install docker.io -y'
                      echo 'remove privous contanier'
                      sh 'cd /home/ubuntu/python-project && sudo chmod +x cantainerstop.sh && sudo ./cantainerstop.sh'
                      sh 'cd /home/ubuntu/python-project && sudo docker build -t myimage .'
                      sh 'sudo docker run -it -d --name mycontainer -p 5000:5000 myimage'
                   }

                 }
                 else if(branchName == "test"){
                    println("Deploying to Test.")                 
                     
                 }              
                  
              }
          }
       }
   }
}
