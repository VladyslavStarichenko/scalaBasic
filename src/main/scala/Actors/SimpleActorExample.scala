package Actors


import akka.actor.{Actor, ActorSystem, Props}

object SimpleActorExample extends App {

  class SimpleActor extends Actor {
    override def receive(): Receive = {
      case s: String => println("String:" + s)
      case i: Int => println("Number:" + i)
    }

    def normalMethod(): Unit = println("NormalMethod")

  }
  val system = ActorSystem("SimpleSystem")
  val actor = system.actorOf(Props[SimpleActor], "SimpleActor")

  println("Before String")
  actor ! "Hi actor"
  println("After String")
  println("Before Int")
  actor ! 21
  println("After Int")

}
