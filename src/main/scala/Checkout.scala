/**
  * Created by kostya on 11/10/2016.
  */
object Checkout extends PriceList {
  def price(basket: Basket): Int = basket.getItems.map(getPrice).sum
}
