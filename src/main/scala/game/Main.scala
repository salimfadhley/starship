package game

object Main extends App {

  def outputFunction(text:Iterator[String]) = {
    text.foreach(println(_))
  }

  def inputFunction(choices:Iterator[GameChoice]): GameChoice = {
    choices.zipWithIndex.map(_.swap).toMap.get(scala.io.StdIn.readInt()) match {
      case Some(foo) => foo
      case None => throw new RuntimeException("Invalid Choice")
    }
  }


  val gl = new GameLoop(inputFunction, outputFunction)
  gl.zipWithIndex.foreach((turn: (GameState, Int)) => println(turn._2))

}
