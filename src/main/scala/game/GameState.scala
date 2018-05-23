package game

case class GameState(ship:Ship, encounter:Encounter) {


  def evolveState(inputFunction:(Iterator[GameChoice])=>GameChoice, outputFunction:Iterator[String]=>Unit): GameState = {

    outputFunction(encounter.getNarrative(ship))
    outputFunction(encounter.getChoices(ship).keysIterator.zipWithIndex.map((gc: (GameChoice, Int)) => s"${gc._2} - (${gc._1.name}) - ${gc._1.description}"))

    val choice:GameChoice = inputFunction(encounter.getChoices(ship).keysIterator)

    val consequence:Consequence = encounter.getConsequence(choice, ship)

    outputFunction(consequence.narrative)

    consequence.gameState
  }

  var playing:Boolean = true


}
