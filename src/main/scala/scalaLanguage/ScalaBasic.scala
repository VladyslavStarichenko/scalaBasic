package scalaLanguage

//there are 2 options to run the Scala app:

//with object extended from scala.App
object ScalaBasic extends App {

  println("I love scala")

  //const (mens that it can't be reassigned)
  val age: Int = 42
  //there is no need to specify the type, `cause compiler can figure it out
  val really = true;
  //also there is no need to finish code's blocks with semicolon
  //Types: Int, Boolean, Double, Float, String

  val aString = "I love Scala"
  val aComposedString = "I" + " Love" + " Scala"
  //Interpolated string with s-quote

  val anInterpolatedString = s"The meaning of life is $age"

  //expressions = structures that can be reduced to a value
  val anExpression = 2 + 3

  val ifExpression = if (age > 43) "Cool" else "Not cool" // like ternary operation in other languages
  val chainedIfExpression = {
    if (age == 43) 50
    else if (age == 20) 100
    else if (age == 18) 1000
    else 0

    //code blocks

    val aCodeBlock = {
      //definition
      val aLocalValue = 67

      //value of block is value of the last expression
      aLocalValue + 3
    }

    //define a function
    def myFunction(x: Int, y: String): String = {
      y + " " + x
    }
    //recursive functions
    //In Scala we don't use loops or iteration, we use RECURSION
    def factorial(n: Int): Int = {
      if(n <= 1) 1
      else n * factorial(n-1)
    }
    println(factorial(5))

    //the Unit type = non meaningful value == "void" in other languages
    //type of side effects (operation under the values but return nothing)
    def myUnitReturningFunction():Unit = {
      println("I don't like to return Unit")
    }

    val theUnit = {}

  }


  val anExpression1 = 2.+(3)
}

//with main method

object ScalaBasic1 {
  def main(args: Array[String]): Unit = {

    println("I love scala")
  }
}
