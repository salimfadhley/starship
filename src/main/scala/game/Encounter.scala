package game

trait Encounter {
  def getConsequence(choice: GameChoice, ship: Ship): Consequence
  def getNarrative(ship: Ship): Iterator[String]
  def getChoices(ship: Ship): Map[GameChoice, (Ship)=>Ship]
}
