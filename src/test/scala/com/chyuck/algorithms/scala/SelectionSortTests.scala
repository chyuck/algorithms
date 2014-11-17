package com.chyuck.algorithms.scala

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SelectionSortTests  extends FunSuite {

  test("findMinValue: (4,1,6,7)"){
    assert(SelectionSort.findMinValue(List(4,1,6,7)) === 1)
  }

  test("findMinValue: (7)"){
    assert(SelectionSort.findMinValue(List(7)) === 7)
  }

  test("removeValue: 1 from (4,1,6,7)"){
    assert(SelectionSort.removeValue(List(4,1,6,7), 1) === List(4,6,7))
  }

  test("removeValue: 7 from (7)"){
    assert(SelectionSort.removeValue(List(7), 7) === List())
  }

  test("min: (4,1,6,7)"){
    assert(SelectionSort.min(List(4,1,6,7)) === (1, List(4,6,7)))
  }

  test("min: (2,8,6,7)"){
    assert(SelectionSort.min(List(2,8,6,7)) === (2, List(8,6,7)))
  }

  test("min: (2,8,6,1)"){
    assert(SelectionSort.min(List(2,8,6,1)) === (1, List(2,8,6)))
  }

  test("min: (2)"){
    assert(SelectionSort.min(List(2)) === (2, List()))
  }

  test("sort: (5,3,8,4,11)"){
    assert(SelectionSort.sort(List(5,3,8,4,3,11)) === List(3,3,4,5,8,11))
  }

  test("sort: (1000 to 1)"){
    assert(SelectionSort.sort(1000.to(1, -1).toList) === (1 to 1000).toList)
  }

  test("sort: empty list"){
    assert(SelectionSort.sort(List()) === List())
  }

}
