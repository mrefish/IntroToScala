package caseclasses

object CaseClasses {

  case class Color(name: String)

  case class Tortilla(ingredient: String)

  case class Meat(animal: String)

  case class Cheese(name: String)

  case class Sauce(heat: String)

  case class Taco(tortilla: Tortilla, meat: Meat, cheese: Cheese, sauce: Sauce)

  case class Cat(coat: Color, age: Int, friendly: Boolean)
}
