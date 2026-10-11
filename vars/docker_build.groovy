def call(string name, string imgtag){
  sh "docker build -t ${name}:${imgtag} . "
}
