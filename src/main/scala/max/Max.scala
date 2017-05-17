package max

/**
  * Created by fnovoa10 on 05/17/17.
  */
object Max {

  def maxAccum(ints: List[Int], theMax: Int): Int = {
    if(ints.isEmpty) return theMax
    else if (ints.head > theMax) {
      if (ints.length == 1) return ints.head
      maxAccum(ints.slice(1, ints.size), ints.head)
    }
    else {
      if (ints.length == 1) return theMax
      maxAccum(ints.slice(1, ints.size), theMax)
    }
  }

}
