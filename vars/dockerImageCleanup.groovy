def call(String username, String projectName, String ImageTag){
    
    sh """
        docker rmi ${username}/${projectName}:${ImageTag} ${username}/${projectName}:latest
    """
}