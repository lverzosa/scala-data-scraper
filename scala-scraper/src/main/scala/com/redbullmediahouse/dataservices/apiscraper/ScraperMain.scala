package com.redbullmediahouse.dataservices.apiscraper

import scala.io.Source
import scala.util.parsing.json.JSON
import spray.json._
import DefaultJsonProtocol._

/**
  * Created by lverzosa on 1/26/16.
  */
object ScraperMain {
  def main(args: Array[String]) {
    val uri:String = "https://api.github.com/repos/lverzosa/scala-experiments/branches"
    val result:String = Source.fromURL(uri).mkString
    val json:Option[Any] = JSON.parseFull(result)

    //println(json.get)

    //val resultArray:List[Map[String, Any]] = json.get.asInstanceOf[List[Map[String, Any]]]

    //resultArray.foreach( (x:Map[String, Any]) => println(x.getOrElse("name","MISSING_NAME")) )

    println(result.parseJson)
  }
}
