package com.netflix.movies.utility

object DummyObject extends java.io.Serializable {
  
  def getOutput(inputParam1 : String, inputParam2 : String, inputParam3 : String) : Option[String] = {
    Option(inputParam1+ " " + inputParam2 + " " + " " + inputParam3)
  }

}
