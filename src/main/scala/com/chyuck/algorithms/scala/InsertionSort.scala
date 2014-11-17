package com.chyuck.algorithms.scala

object InsertionSort {

  /**
   * Inserts i to sortedList and returns sorted list
   * Example: insert(7, List(3,3,4,5,8,11)) == List(3,3,4,5,7,8,11)
   */
  def insert(i: Int, sortedList: List[Int]) : List[Int] = {
    sortedList match {
      case Nil => List(i)
      case x :: xs if x >= i => i :: x :: xs
      case x :: xs  => x :: insert(i, xs)
    }
  }

  def sort(list: List[Int]) : List[Int] = {

    def sortSubList(sortedList: List[Int], unsortedList: List[Int]) : List[Int] = {
      require(sortedList.length + unsortedList.length == list.length)

      unsortedList match {
        case Nil => sortedList
        case x :: xs => sortSubList(insert(x, sortedList), xs)
      }
    }

    sortSubList(List(), list)
  }

}
