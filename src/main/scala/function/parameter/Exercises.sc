
// 1. Write a function that computes the area of a circle given its radius.
def circleArea(radius: Double): Double = radius * radius * math.Pi
circleArea(30)

// 2. Provide an alternate form of the function in exercise 1 that takes the radius as a String.
def circleArea2(radius: String): Double = {
  radius.isEmpty match {
    case false => math.pow(radius.toDouble, 2) * math.Pi
    case true => 0
  }
}
circleArea2("30")
circleArea2("")

// 3. Write a function that takes a milliseconds value and returns a string describing
// the value in days, hours, minutes, and seconds.
def prettyTime(millis: Long): String = {
  val secs = millis / 1000

  val days = secs / 86400
  val hours = (secs % 86400) / 3600
  val minutes = (secs % 3600) / 60
  val seconds = secs % 60

  s"$days days $hours hours $minutes minutes $seconds seconds"
}

prettyTime(172000000L)