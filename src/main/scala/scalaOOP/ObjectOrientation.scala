package scalaOOP

object ObjectOrientation extends App {
  //class and instance -> instantiation with "new"
  class Animal {
    //define fields
    val age: Int = 0

    //define methods
    def eat(something: String) = println(s"I'm eating $something")
  }

  val anAnimal: Animal = new Animal

  //inheritance
  class Dog(val name: String) extends Animal //constructor definition inside

  val aDog = new Dog("Lessie")
  // a constructor arguments are NOT fields: need to put a "val" before the constructor argument

  val aDeclaredAnimal = new Dog("Lesenok")
  //  aDeclaredAnimal.eat(aDeclaredAnimal.name)

  //abstract class
  abstract class WalkingAnimal {
    val hasLegs = true //all fields are public by default -> restrict adding private/protected

    def walk(): Unit

  }

  //"interface" =  ultimate abstract type
  trait Carnivore {

    //also we can provide realization
    def eat(animal: Dog): Unit
  }
  //Single class inheritance and multi trait inheritance

  trait Philosopher {
    def ?!(thought: String): Unit
  }

  class Crocodile extends Animal with Carnivore with Philosopher {
    override def eat(animal: Dog): Unit = {
      println(s"I'm eating you, ${animal.name}")
    }

    override def ?!(thought: String): Unit = {
      println(thought)
    }
  }

  val crocodile = new Crocodile;
  crocodile.eat(aDeclaredAnimal)
  crocodile ?! "What if I still be with Lesenok"

  //Anonymous Classes
  val dinosaur = new Carnivore {
    override def eat(animal: Dog): Unit = println("I'm a dinosaur, so i can eat pretty much anything")
  }

  //Singleton object
  object MySingleton { //is the only instance of the MySingleton type
    val mySpecialValue = 12345

    def mySpecialMethod(): Int = 5327

    def apply(x: Int): Int = x + 1
  }

  MySingleton.mySpecialMethod()
  MySingleton.apply(20)
  MySingleton(20) //equivalent to MySingleton.apply(20)

  //companion Object to class Animal; this can also be applied to traits
  object Animal {
    //companions can access each other's private fields/methods
    //but singleton Animal and instance of Animal class are different things

    def canLiveIndefinitely = false
  }
  //"static" fields or methods
  val animalsCanLiveForever = Animal.canLiveIndefinitely

  /*case-classes = lightweight data structures with some boilerplate
  - sensible equals and hash code
  - serialization
  - companion with apply
  */
  case class Person (name: String, age: Int)
  val lesya = new Person("Lesya",18)

}
