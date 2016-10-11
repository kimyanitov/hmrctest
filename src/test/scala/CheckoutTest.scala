import org.scalatest._

/**
  * Created by kostya on 11/10/2016.
  */
class CheckoutTest extends FlatSpec with Matchers {

  it should "add up cost of all items in the Basket" in {
    val basket = new Basket()
    basket.add("Apple")
    basket.add("Apple")
    basket.add("Orange")
    basket.add("Apple")

    Checkout.price(basket) should be (205)

  }

  it should "apply offers" in {
    val basket = new Basket()
    basket.add("Apple")
    basket.add("Apple")
    basket.add("Orange")
    basket.add("Orange")
    basket.add("Orange")

    Checkout.discount(basket, Apples2F1Offer :: Oranges3F2Offer :: Nil) should be (-85)
  }


}
