
// specifying a default value for a parameter
def greet1(prefix: String = "", name: String): String = s"$prefix$name"

// have to call the function with named parameter
val greeting1 = greet1(name = "Paul")

// reorder function parameter
def greet2(name: String, prefix: String = ""): String = s"$prefix$name"

// now we can call it without using a parameter name
val greeting2 = greet2("Paul")
val greeting3 = greet2("Paul", "hello ")