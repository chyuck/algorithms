package com.chyuck.algorithms.scala

object InsertionSort {

  def sort(array: Array[Int]) : Array[Int] = {

    for (i <- 1 until array.length) {

      val currentElement = array(i)
      var j = i - 1

      while (j >= 0 && array(j) > currentElement) {
        array(j + 1) = array(j)
        j = j - 1
      }
      array(j + 1) = currentElement
    }

    array
  }
}
