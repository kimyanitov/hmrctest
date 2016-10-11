import org.scalatest._

/**
  * Created by kostya on 11/10/2016.
  */
class PriceListTest extends FlatSpec with Matchers with PriceList {

       "Apple" should "cost 60p" in {

           getPrice("Apple") should be (60)
       }


       "Orange" should "cost 25p" in {

           getPrice("Orange") should be (25)
       }
}
