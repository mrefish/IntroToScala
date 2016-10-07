package syntax

// A comment!
/* Another comment */
/** A documentation comment */

object Syntax {
  // objects are singletons

  val something = new Something(7)

  def getNothing(): Nothing = {
    val n = Nothing(true)

    n // last value is returned and return keyword is optional but discouraged
  }
}

trait Thing {
  // traits are similar to interfaces
  val property: Int // trait properties and functions may be left blank
  val tacos: String = "chicken" // or provided

  def function(s: String): String
}

class Something(count: Int) extends Thing {
  val property = 1 // vals, immutable variables (encouraged)
  val far: Boolean = false // types optional (encouraged)
  var boo = "meh" // vars, mutable variables (discouraged)

  // override keyword
  override def function(s: String): String = {
    val thing = s + " thing" // semicolons optional (discouraged)

    thing // last value is returned and return keyword is optional but discouraged
  }
}

case class Nothing(useless: Boolean)
