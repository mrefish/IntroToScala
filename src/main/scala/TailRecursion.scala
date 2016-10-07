package tailrecursion

import scala.annotation.tailrec
import scala.io.StdIn.readLine

// https://www.hackerrank.com/challenges/cut-the-sticks
object TailRecursion {
  def readLineInts(): Seq[Int] = { readLine().split(" ").map(_.toInt) }

  @tailrec
  def cutSticks(sticks: Seq[Int]): Seq[Int] = {
    sticks match {
      case Nil =>
        Seq.empty[Int]
      case xs =>
        println(xs.length)
        val min = xs.min
        cutSticks(xs.filter(_ > min).map(_ - min))
    }
  }

  def main(args: Array[String]) {
    val n: Int = readLineInts().head
    val sticks: Seq[Int] = readLineInts()
    cutSticks(sticks)
  }
}
