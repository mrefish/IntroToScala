package higherorderfunctions

import caseclasses.CaseClasses._

object HigherOrderFunctions {
  val black: Color = Color("Black")
  val blue: Color = Color("Blue")
  val white: Color = Color("White")

  val cats: Seq[Cat] = Seq(Cat(black, 3, friendly = true), Cat(blue, 9, friendly = false), Cat(white, 7, friendly = false))

  val catMap = cats.map( cat => println(cat))
  val catFilter = cats.filter( cat => cat.friendly)
  val catReduction = cats.reduce( (oldest, cat) => if(cat.age >= oldest.age) cat else oldest)

  val flour: Tortilla = Tortilla("flour")
  val corn: Tortilla = Tortilla("corn")
  val wheat: Tortilla = Tortilla("wheat")

  val chicken = Meat("chicken")
  val beef = Meat("beef")
  val pork = Meat("pork")

  val cheddar = Cheese("cheddar")
  val threeCheeses = Cheese("three cheeses")
  val mexican = Cheese("mexican")

  val mild = Sauce("mild")
  val medium = Sauce("medium")
  val spicey = Sauce("hot")

  val tacos: Seq[Taco] = Seq(
    Taco(flour, chicken, cheddar, mild),
    Taco(corn, beef, threeCheeses, medium),
    Taco(wheat, pork, mexican, spicey)
  )

  val tacoCats = tacos.zip(cats)
}
