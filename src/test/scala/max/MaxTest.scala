package max

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by fnovoa10 on 05/17/17.
  */
class MaxTest extends FlatSpec with Matchers {

  val max = Max

  it should "should be 5 with 1, 2, 3 List" in {
    max.maxAccum(List(1, 2, 3), 0) should be (3)
  }

  it should "should be 100 with 100, 90, 50 List" in {
    max.maxAccum(List(100, 90, 50), 0) should be (100)
  }

  it should "should be 0 with empty list" in {
    max.maxAccum(List(), 0) should be (0)
  }

  it should "should be the only element value with one element list" in {
    max.maxAccum(List(6000), 0) should be (6000)
  }
}
