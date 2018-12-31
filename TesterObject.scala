package com.netflix.movies.utility

import org.scalatest.FunSuite

object TesterObject extends App{

    test (testName= "testDummy") {
    val inputParam1 : Seq[String] = Seq("Ram","Sam","Puja","Jam")
    val inputParam2 : Seq[String] = Seq("is","has","does not","is")
    val inputParam3 : Seq[String] = Seq("good","money","speak English","tasty")
    val expectedOutput : Seq[Option[String]] = Seq(Option("Ram is good"))
    
    com.netflix.movies.utility.DummyObject()
  }

}
