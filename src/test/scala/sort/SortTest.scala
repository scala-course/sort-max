package sort

import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by fnovoa10 on 05/16/17.
  */
class SortTest extends FlatSpec with Matchers {

  val sort = Sort

  it should "should be true with ordered array" in {
    sort.isSorted(Array(1, 2, 3), sort.defaultSortFunction) should be(true)
  }

  it should "should be false with disordered array" in {
    sort.isSorted(Array(1, 2, 3, 4, 5, 6, 7, 1), sort.defaultSortFunction) should be(false)
    sort.isSorted(Array(1, 2, 3, 5, 4, 6, 7, 8), sort.defaultSortFunction) should be(false)
  }

  it should "should be true when array has only one element" in {
    sort.isSorted(Array(1), sort.defaultSortFunction) should be(true)
  }

  it should "should be true when array has no elements" in {
    sort.isSorted(Array(), sort.defaultSortFunction) should be(true)
  }

  it should "should be true when use another function" in {
    val descendingSortFunction = (x: Int, y: Int) => x > y
    sort.isSorted(Array(5, 4, 3, 2, 1), descendingSortFunction) should be(true)
  }

  it should "should be false when use default function and descending array" in {
    sort.isSorted(Array(5, 4, 3, 2, 1), sort.defaultSortFunction) should be(false)
  }
}
