def call(string dockerHubUser, string pname, string imgtag){
  withCredentials([usernamePassword('credentialsId':"docker-userpass",
    passwordVariable:"dockerHubPass",
    usernameVariable:"dockerHubUser")]){
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  }
  sh "docker image tag notes-app:latest ${dockerHubUser}/${pname}:${imgtag}"
  sh "docker push ${dockerHubUser}/${pname}:${imgtag}"
}
