package test

class Test implements Serializable {
  def script
  
  Test(script){
    this.script = script
  }
  
  def print(def msg){
    this.script.echo "${msg}"
  }
}
