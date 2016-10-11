import org.scalatest.FlatSpec

/**
  * Created by kostya on 11/10/2016.
  */
class Apples2F1OfferTest extends FlatSpec {

  it should "produce discount of 1 apples cost for every two apples" in {
    val basket = new Basket()
    basket.add("Apple")
    basket.add("Apple")
    basket.add("Apple")
    basket.add("Apple")
    basket.add("Apple")

    Apples2F1Offer.discount(basket) should be (-120)
  }

}
