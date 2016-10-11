/**
  * Created by kostya on 11/10/2016.
  */
object Checkout extends PriceList {
  def total(basket: Basket, offers: List[Offer with PriceList]): Int = ???

  def discount(basket: Basket, offers: List[Offer]): Int = offers.map(_.discount(basket)).sum

  def price(basket: Basket): Int = basket.getItems.map(getPrice).sum
}
