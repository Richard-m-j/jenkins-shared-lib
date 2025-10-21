def call(String username, String projectName, String tag) {
    sh """
        docker build -t ${username}/${projectName}:latest -t ${username}/${projectName}:${tag} .
    """
}