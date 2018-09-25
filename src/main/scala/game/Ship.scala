package game

trait Ship {
  def getStatusText: Iterator[String]
  val state:ShipState
  val name:String


}
