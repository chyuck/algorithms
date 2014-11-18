package com.chyuck.algorithms.scala

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class InsertionSortTests extends FunSuite {

  test("sort: (5,3,8,4,3,11)"){
    assert(InsertionSort.sort(Array(5,3,8,4,3,11)) === Array(3,3,4,5,8,11))
  }

  test("sort: empty array"){
    assert(InsertionSort.sort(Array()) === Array())
  }

  test("sort: (5)"){
    assert(InsertionSort.sort(Array(5)) === Array(5))
  }
}
