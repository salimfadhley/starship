package game

class LaunchEncounter extends Encounter {
  override def getConsequence(choice: GameChoice, ship: Ship): Consequence = {

    val newShip: Ship = getChoices(ship).get(choice).map(_(ship)).getOrElse(ship)
    val nextEncounter = RandomEncounters.randomEncounter

    val gs = GameState(newShip, nextEncounter)

    Consequence(gs, ("And on.... " :: Nil).toIterator)

  }

  override def getNarrative(ship: Ship): Iterator[String] = {
    ("""The mighty mothership towers abobove the city, dormant blah...""" :: Nil).toIterator
  }

  override def getChoices(ship: Ship): Map[GameChoice, Ship=>Ship] = {
    Map(GameChoice("Launch", "Blast off into the unknown") -> ShipTransitions.identity )
  }
}
