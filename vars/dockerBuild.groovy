def call(string username,string projectName, string tag){
    sh '''
        docker build -t $username/${projectName} .
        docker image tag $username/${projectName}:latest .
        docker image tag $username/${projectName}:${tag} ${username}/${projectName}:${tag}
    '''
}