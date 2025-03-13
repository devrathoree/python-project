def call(String IMAGE_NAME , String TAG){
  sh" trivy image --severity HIGH,CRITICAL ${IMAGE_NAME}:${TAG}"
}
