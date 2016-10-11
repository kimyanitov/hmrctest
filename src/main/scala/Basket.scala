
class Basket {

  private val items = scala.collection.mutable.MutableList[String]()

  def add(item: String) = items += item

  def getItems: Seq[String] = items.toList
}
