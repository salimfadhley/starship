package game

import scala.util.Random

case class SeedShip(state:ShipState, name:String) extends Ship {
  override def getStatusText: Iterator[String] = (s"${name} is st"  :: Nil).toIterator
}

object SeedShip {
  def factory:SeedShip = {

    SeedShip(Landed, "Ark".concat(Random.nextInt(45).toString))

  }
}