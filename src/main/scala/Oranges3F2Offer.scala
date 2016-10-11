/**
  * Created by kostya on 11/10/2016.
  */
object Oranges3F2Offer extends Offer with PriceList {
  override def discount(basket: Basket): Int = {
      val applesCount = basket.getItems.count(i => i == "Orange")
      (applesCount / 3) * getPrice("Orange") * -1
    }
}
