def call(String username, String projectName, String tag){
    withCredentials([usernamePassword(
            credentialsId: "docker",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        sh "docker login -u '$USER' -p '$PASS'"
    }
    sh "docker image push ${username}/${projectName}:${tag}"
    sh "docker image push ${username}/${projectName}:latest"   
}