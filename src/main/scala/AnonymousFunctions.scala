package anonymousfunctions

object AnonymousFunctions {
  /*
  Instead of:
  def spiceItUp(x: String): String = { x + "!"}

  we can use an anonymous function
   */

  Seq("chips", "salsa", "burrito").map(x => x + "!")
}
