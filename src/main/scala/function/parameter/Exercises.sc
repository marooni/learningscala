
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
