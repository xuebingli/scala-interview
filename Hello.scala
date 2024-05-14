//> using scala 3.3.3
//> using dep com.lihaoyi::os-lib:0.10.0

object Hello:
  def greeting(name: String): String =
    s"Hello, ${name}!"

  @main def main() = println(greeting("world"))
