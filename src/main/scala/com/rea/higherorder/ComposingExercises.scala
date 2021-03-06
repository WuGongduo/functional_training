package com.rea.higherorder

object ComposingExercises {


  def add(a: Int, b: Int) = a + b

  // We want to partially apply add
  def addTwo: Int => Int = add(_, 2)

  def subtract(a: Int, b: Int) = a - b

  // We want to partially apply subtract
  def minusThree: Int => Int = subtract(_, 3)

  // How do we create a new function from addTwo and minusThree?
  val addTwoMinusThree: Int => Int = addTwo.compose(minusThree(_))
  
  def prettyPrint(i:Int) = s"The number is $i"
  
  val addTwoMinusThreePrettyPrint: Int => String = "The number is "+addTwoMinusThree(_)
//   How do we convert (compose) f and g into a brand new function?
  def compose_[A, B, C](f: B => C, g: A => B): A => C = f.compose(g)

}


