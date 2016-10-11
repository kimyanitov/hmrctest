/**
  * Created by kostya on 11/10/2016.
  */
trait PriceList {

  val prices: Map[String, Int] = Map("Apple" -> 60, "Orange" -> 25)

  def getPrice(item: String): Int = prices(item)

}
