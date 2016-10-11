import org.scalatest._

class BasketTest extends FlatSpec with Matchers{

  val basket =  new Basket()
  it should "accept new items" in {
       basket.add("Orange")
       basket.add("Apple")
       basket.add("Orange")
       basket.add("Apple")

       basket.getItems should have length 4
       basket.getItems should be (List("Orange","Apple","Orange","Apple"))
  }

}
