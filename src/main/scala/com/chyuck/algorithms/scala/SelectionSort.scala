package com.chyuck.algorithms.scala

object SelectionSort {

  def findMinValue(list: List[Int]) : Int = {
    list match {
      case x :: Nil => x
      case x :: xs => Math.min(x, findMinValue(xs))
    }
  }

  def removeValue(list: List[Int], value: Int) : List[Int] = {
    require(list.nonEmpty)

    list match {
      case x :: Nil =>
        if (x == value) List()
        else throw new IllegalArgumentException("list does not contain value")
      case x :: xs =>
        if (x == value) xs
        else x :: removeValue(xs, value)
    }
  }

  /**
   * Finds min element and returns pair of this element and list without this element
   * Example: min(List(4,1,6,7)) = (1, List(4,6,7))
   */
  def min(list: List[Int]) : (Int, List[Int]) = {
    require(list.nonEmpty)

    val minValue = findMinValue(list)
    (minValue, removeValue(list, minValue))
  }

  def sort(list: List[Int]): List[Int] = {

    def sortSubList(sortedList: List[Int], unsortedList: List[Int]) : List[Int] = {
      require(sortedList.length + unsortedList.length == list.length)

      unsortedList match {
        case Nil => sortedList
        case xs =>
          val (e, l) = min(xs)
          sortSubList(sortedList ::: List(e), l)
      }
    }

    sortSubList(List(), list)
  }

}
