package max

/**
  * Created by fnovoa10 on 05/17/17.
  */
object Max {


  def max(ints: List[Int]): Int = {

    def maxAccum(ints: List[Int], theMax: Int): Int = {
      if (ints.isEmpty) theMax
      else maxAccum(ints.tail, if (ints.head < theMax) theMax else ints.head)
    }
    maxAccum(ints, 0)
  }


}
