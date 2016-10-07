package badsyntax

object BadSyntax {
  // Square brackets (not angle brackets) are for types (not indexing)
  val things: Seq[String] = Seq("", "1", "3")

  val thing0 = things(0)
  // Value at index zero of things
  val thing2 = things(2) // Value at index two of things

  // Tuples are awesome and encouraged!
  val rad: (Int, String) = (1337, "Yeah")

  val radInt = rad._1
  // The syntax for access is kinda lame
  val radString = rad._2 // :(
}
