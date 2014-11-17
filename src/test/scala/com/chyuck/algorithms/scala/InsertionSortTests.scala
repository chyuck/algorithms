package com.chyuck.algorithms.scala

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class InsertionSortTests extends FunSuite {

  test("insert 15 into (3,3,4,5,8,11)"){
    assert(InsertionSort.insert(15, List(3,3,4,5,8,11)) === List(3,3,4,5,8,11,15))
  }

  test("insert 5 into (3,3,4,5,8,11)"){
    assert(InsertionSort.insert(5, List(3,3,4,5,8,11)) === List(3,3,4,5,5,8,11))
  }

  test("insert 3 into (3,3,4,5,8,11)"){
    assert(InsertionSort.insert(3, List(3,3,4,5,8,11)) === List(3,3,3,4,5,8,11))
  }

  test("insert 7 into (3,3,4,5,8,11)"){
    assert(InsertionSort.insert(7, List(3,3,4,5,8,11)) === List(3,3,4,5,7,8,11))
  }

  test("insert into empty list"){
    assert(InsertionSort.insert(15, List()) === List(15))
  }

  test("sort: (5,3,8,4,11)"){
    assert(InsertionSort.sort(List(5,3,8,4,3,11)) === List(3,3,4,5,8,11))
  }

  test("sort: (1000 to 1)"){
    assert(InsertionSort.sort(1000.to(1, -1).toList) === (1 to 1000).toList)
  }

  test("sort: empty list"){
    assert(InsertionSort.sort(List()) === List())
  }
}
