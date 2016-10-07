package expressions

import caseclasses.CaseClasses.{Color, Cat}

object Expressions {
  val age: Int = 9

  val black: Color = Color("black")

  val cat: Cat = if(age < 4) Cat(black, age, friendly = true) else Cat(black, age, friendly = false)
}
