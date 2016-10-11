/**
  * Created by kostya on 11/10/2016.
  */
object Apples2F1Offer extends Offer with PriceList {
  override def discount(basket: Basket): Int = {
    val applesCount = basket.getItems.count(i => i == "Apple")
    (applesCount / 2) * getPrice("Apple") * -1
  }
}
