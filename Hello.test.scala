//> using scala 3.3.3
//> using test.dep org.scalameta::munit::0.7.29

class HelloWorldTest extends munit.FunSuite {
  test("greeting") {
    assert(clue(Hello.greeting("world")) == "Hello, world!")
    // assertEquals(HelloWorld.greeting("world"), "Hello, world!")
  }
}
