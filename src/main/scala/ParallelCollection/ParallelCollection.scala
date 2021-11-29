package ParallelCollection


// not parallel implementation
object NotParallelCollection extends App {
  def fib(n: Int): Int = if (n < 2) 1 else fib(n - 1) + fib(n - 2)

  def printFib() :Unit = {
    for (i <- 30 to 15 by -1) {
      println(fib(i))
    }
  }

  printFib()

}

// using parallel collection
object ParallelCollection extends App {
  def fib(n: Int): Int = if (n < 2) 1 else fib(n - 1) + fib(n - 2)

  def printFib() :Unit = {
    for (i <- (30 to 15 by -1).par) {
      println(fib(i))
    }
  }

  printFib()

}


