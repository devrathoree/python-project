def call(String IMAGE_NAME , String TAG ){
    withCredentials([usernamePassword(credentialsId: 'docker_creds' , usernameVariable: 'docker_user' , passwordVariable: 'docker_token')]){
        sh" docker login -u ${docker_user} -p ${docker_token} "
    }
    sh " docker tag "${IMAGE_NAME}":"${TAG}" "${docker_user}"/"${IMAGE_NAME}":"${TAG}" "
    sh " docker push "${docker_user}"/"${IMAGE_NAME}":"${TAG}" "
}
