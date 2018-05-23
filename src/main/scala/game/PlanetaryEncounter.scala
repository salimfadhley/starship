package game

class PlanetaryEncounter extends Encounter {
  override def getConsequence(choice: GameChoice, ship: Ship): Consequence = ???

  override def getNarrative(ship: Ship): Iterator[String] = {
    ("""
      |A planet looms before you
    """.stripMargin :: Nil).toIterator}

  override def getChoices(ship: Ship): Map[GameChoice, Ship => Ship] = Map(
    GameChoice("Orbit", "Make another orbit of the planet.") -> ShipTransitions.identity,
    GameChoice("Move On", "Resume your journey.") -> ShipTransitions.identity,
    GameChoice("Send a probe", "An automated probe to scan tghe planet")  -> ShipTransitions.identity,
    GameChoice("Landing Party", "Send human explorers") -> ShipTransitions.identity

  )
}
