def call(String IMAGE_NAME , String TAG){
    docker build -t ${IMAGE_NAME}:${TAG} .
}