def call(String image) {
    sh "trivy image ${image}"
}
