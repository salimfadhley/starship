package game

class GameLoop(inputFunction:(Iterator[GameChoice])=>GameChoice, outputFunction:Iterator[String]=>Unit, _gameState: GameState = new GameState(SeedShip.factory, new LaunchEncounter)) extends Iterator[GameState] {
  var gameState = _gameState

  override def hasNext: Boolean = gameState.playing
  override def next(): GameState = {
    gameState = gameState.evolveState(inputFunction, outputFunction)
    gameState
  }
}
