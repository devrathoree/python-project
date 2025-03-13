def call(String IMAGE_NAME , String TAG){
    sh "docker build -t ${IMAGE_NAME}:${TAG} ."
}
