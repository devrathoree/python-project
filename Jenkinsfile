pipeline {
    agent any
    stages {
        stage('Build Master Branch') {
            when {
                branch 'master'
            }
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
        stage('Build Development Branch') {
            when {
                branch 'development'
            }
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
        stage('Build Stages Branch') {
            when {
                branch 'stages'
            }
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
        stage('Other Branches') {
            when {
                not {
                    anyOf {
                        branch 'master'
                        branch 'development'
                        branch 'stages'
                    }
                }
            }
            steps {
                echo "Branch not configured for automatic builds"
            }
        }
    }
}
