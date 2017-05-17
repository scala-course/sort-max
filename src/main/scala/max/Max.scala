package max

/**
  * Created by fnovoa10 on 05/17/17.
  */
object Max {


  def max(ints: List[Int]): Int = {
    maxAccum(ints, 0)
  }

  def maxAccum(ints: List[Int], theMax: Int): Int = {
    if (ints.isEmpty) theMax
    else if (ints.head > theMax) {
      if (ints.length == 1) ints.head
      else maxAccum(ints.tail, ints.head)
    }
    else {
      if (ints.length == 1) theMax
      else maxAccum(ints.tail, theMax)
    }
  }

}
