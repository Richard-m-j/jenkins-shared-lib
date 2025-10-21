def call(String username, String projectName, String tag) { 
    sh """   
     trivy image ${username}/${projectName}:latest > scan.txt
     cat scan.txt
    """
}