//> using scala 3.3.3
//> using test.dep org.scalameta::munit::1.0.0

class HelloWorldTest extends munit.FunSuite {
  test("greeting") {
    assert(clue(Hello.greeting("world")) == "Hello, world!")
    // assertEquals(HelloWorld.greeting("world"), "Hello, world!")
  }
}
