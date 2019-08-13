def call(body) {
def get = new URL("http://35.224.91.226:5000/todo/api/v1.0/tasks").openConnection();
def getRC = get.getResponseCode();
println(getRC);
if(getRC.equals(200)) {
    println(get.getInputStream().getText());
}
}
