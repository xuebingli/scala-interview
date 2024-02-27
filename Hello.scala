//> using scala 3.3.0
//> using dep com.lihaoyi::os-lib:0.9.3

object Hello:
  def greeting(name: String): String =
    s"Hello, ${name}!"

  @main def main() = println(greeting("world"))
