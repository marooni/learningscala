
// type parameters can increase the flexibility and reusability of functions
// as they transition these types from being fixed to being set by the caller of the function

// type of input and output parameter is parameterized
// A is used to define the type of the value parameter a and the return type of the function
def identity[A](a: A): A = a

val s: String = identity[String]("Hello")
val i: Int = identity[Int](10)

// we can remove the types of the parameters and the values because
// Scala compiler can infer the types
val s = identity("Hello")
val i = identity(10)
