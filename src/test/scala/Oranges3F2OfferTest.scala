import org.scalatest.FlatSpec

/**
  * Created by kostya on 11/10/2016.
  */
class Oranges3F2OfferTest extends FlatSpec {

  it should "produce discount of 1 orange cost for every 3 oranges" in {
    val basket = new Basket()
    basket.add("Orange")
    basket.add("Orange")
    basket.add("Orange")
    basket.add("Orange")
    basket.add("Orange")
    basket.add("Orange")
    basket.add("Orange")

    Oranges3F2Offer.discount(basket) should be (-50)
  }

}
