
// two input parameters have been split into their own parameter group
def max(x: Int)(y: Int): Int = {
  if (x > y) x else y
}

max(10)(20)

// not working
//max(10)

