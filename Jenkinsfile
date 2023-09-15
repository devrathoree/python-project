pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                echo 'start contanier'
                echo "building container"
                sh 'sudo apt update'
                sh 'sudo apt install docker.io -y'
                echo 'remove privous contanier'
                sh 'cd /home/ubuntu/python-project && sudo chmod +x cantainerstop.sh && sudo ./cantainerstop.sh'
                sh 'cd /home/ubuntu/python-project && sudo docker build -t myimage .'
                sh 'sudo docker run -it -d --name mycontainer -p 5002:5000 myimage'
            }
        }
    }
}

