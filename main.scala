object main {
  def main(args: Array[String])={
    println(Typeclasses.testReversableString("mardvsh"))
    println(Typeclasses.testSmashInt(1,3))
    println(Typeclasses.testSmashDouble(5.1,2.2))
    println(Typeclasses.testSmashString("mar","dvsh"))
  }
}
