package com.firstscala.spark
import java.time.{ZonedDateTime, ZoneId}
import java.time.format.DateTimeFormatter
//Libraries for Method 3
import java.time.Instant
import java.time.temporal.ChronoUnit

object YesterdayDate {
  def main(arr: Array[String]): Unit = {
    //Method 1
    val yesterday = ZonedDateTime.now(ZoneId.of("UTC")).minusDays(1)
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm'Z'")
    val result = formatter format yesterday
    println(result)
    // Method 2
    val today = java.time.LocalDate.now
    val yesterday_date= java.time.LocalDate.now.minusDays(1)
    println(today)
    println(yesterday_date)
    //Method 3
    val now = Instant.now
    val daybefore = now.minus(1, ChronoUnit.DAYS)
    System.out.println(now)
    System.out.println(daybefore)
  }
}