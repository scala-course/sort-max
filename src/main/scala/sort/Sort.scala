package sort

/**
  * Created by fnovoa10 on 05/16/17.
  */
object Sort {

  def defaultSortFunction = (x: Int, y: Int) => x < y

  def isSorted(as: Array[Int], ordered: (Int, Int) => Boolean): Boolean = {
    if (as.length <= 1) {
      false
    }
    else if (ordered(as(0), as(1))) {
      if (as.length == 2) {
        return true
      }
      isSorted(as.slice(1, as.size), ordered)
    }
    else {
      false
    }
  }

}
