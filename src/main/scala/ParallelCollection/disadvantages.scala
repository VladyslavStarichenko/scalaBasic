package ParallelCollection

object disadvantages extends App {

  var i = 0
  for(_ <- (1 to 100000).par) {
    //load i from memory
    //add 1 to registry
    //store i to memory
    i += 1
  }
  println(i)


}
