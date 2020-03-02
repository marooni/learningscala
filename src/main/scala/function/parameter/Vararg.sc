
// asterisk symbol (*) marks a function parameter as matching one or more input arguments
def sum(items: Int*): Int = {
  var total = 0
  for (i <- items) total += i
  total
}

sum(10,20,30)
sum(0)
