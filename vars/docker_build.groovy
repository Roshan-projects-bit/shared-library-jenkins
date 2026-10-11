def call(String name, String imgtag){
  sh "docker build -t ${name}:${imgtag} . "
}
