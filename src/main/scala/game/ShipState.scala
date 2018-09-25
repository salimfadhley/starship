package game

sealed abstract class ShipState(val name: String)

case object Landed extends ShipState("Landed")