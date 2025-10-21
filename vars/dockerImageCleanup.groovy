def call(String username, String projectName, String ImageTag){
    
    sh """
     docker rmi ${username}/${projectName}:${ImageTag}
     docker rmi ${username}/${projectName} ${username}/${projectName}:latest
    """
}