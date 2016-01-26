package com.redbullmediahouse.dataservices.apiscraper

import scala.io.Source
import scala.util.parsing.json.JSON

/**
  * Created by lverzosa on 1/26/16.
  */
object ScraperMain {
  def main(args: Array[String]) {
    val uri:String = "https://api.github.com/repos/lverzosa/scala-experiments"
    val result:String = Source.fromURL(uri).mkString
    val json:Option[Any] = JSON.parseFull(result)

    println(json.get)
  }
}
