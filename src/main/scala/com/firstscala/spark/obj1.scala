package com.firstscala.spark

import org.apache.spark.{SparkConf, SparkContext}

object obj1 {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
    conf.setMaster("local")
    conf.setAppName("scala_app")

    val sc = new SparkContext(conf)

    val rdd1 = sc.makeRDD(Array(1, 2, 3, 4))
    rdd1.collect().foreach(println)
  }

}
