def call(String username, String projectName, String tag) {
    sh """
     docker image build -t ${username}/${projectName} . 
     docker image tag ${username}/${projectName} ${username}/${projectName}:${tag}
     docker image tag ${username}/${projectName} ${username}/${projectName}:latest
    """
}