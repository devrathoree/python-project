def call(String IMAGE_NAME , String TAG){
  sh" trivy image  ${IMAGE_NAME}:${TAG}"
}
