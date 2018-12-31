package com.netflix.movies.utility

import org.scalatest.FunSuite

object TesterObject extends App{

    test (testName = "testDummy") {
        val inputParam1 : Seq[String] = Seq("Ram","Sam","Puja","Jam")
        val inputParam2 : Seq[String] = Seq("is","has","does not","is")
        val inputParam3 : Seq[String] = Seq("good","money","speak English","tasty")
        val expectedOutput : Seq[Option[String]] = Seq(Option("Ram is good"),Option("Sam has money"),Option("Puja does not speak English"),Option("Jam is tasty"))
        for (i <- inputParam1.indices){
            val outValue = com.netflix.movies.utility.DummyObject.getOutput(inputParam1(i),inputParam2(i),inputParam3(i))
            assert(outValue == expectedOutput(i))
            println(s"Passed Test case :: ${i+1}")
        }   
        println("getOutput Testing successful")
    }

}
