def call(String IMAGE_NAME , String TAG ){
    withCredentials([usernamePassword(credentialId: 'docker-creds' , usernameVariable: 'docker_user' , usernamePassword: 'docker_token')]){
        sh" docker login -u ${docker_user} -p ${docker_token} "
    }
    sh " docker tag ${IMAGE_NAME} ${docker_user}/${IMAGE_NAME}:${TAG} "
    sh " docker push ${docker_user}/${IMAGE_NAME}:${TAG} "
}
