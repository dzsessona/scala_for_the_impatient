package Chapter_11_Operators.ex8

import scala.collection.JavaConversions._

object Matrix {
  def random(m: Int, n: Int) = {
    new Matrix(Array.fill(m, n) { util.Random.nextInt(9) })
  }

  def apply(m: Int, n: Int) = {
    new Matrix(Array.ofDim[Double](m, n))
  }
}

class Matrix(val _matrix: Array[Array[Double]]) {
  def apply(i: Int, j: Int) = {
    _matrix(i)(j)
  }

  def +(rhs: Matrix): Matrix = {
    val newMatrix = Matrix(_matrix.size, _matrix(0).size)
    for (i <- 0 until _matrix.size) {
      for (j <- 0 until _matrix(0).size) {
        newMatrix._matrix(i)(j) = _matrix(i)(j) + rhs._matrix(i)(j)
      }
    }
    new Matrix(newMatrix._matrix)
  }

  def *(rhs: Matrix) = {
    if (_matrix(0).size != rhs._matrix.size)
      None
    else {
      val newMatrix = Matrix(_matrix.size, _matrix(0).size)
      for (i <- 0 until _matrix.size) {
        for (j <- 0 until rhs._matrix(0).size) {
          for (k <- 0 until _matrix(0).size) {
            newMatrix._matrix(i)(j) = _matrix(i)(k) + rhs._matrix(k)(j)
          }
        }
      }
      new Matrix(newMatrix._matrix)
    }
  }

  def *(scalar: Double): Matrix = {
    new Matrix(_matrix.map(_.map(_ * 5)))
  }

  override def toString = {
    val rowStrings = for (row <- _matrix)
    yield row.mkString("[", ", ", "]")
    rowStrings.mkString("", "\n", "\n")
  }
}

object Main extends App {
  val mat1 = Matrix.random(3, 3)
  val mat2 = Matrix.random(3, 3)

  println(mat1)
  println(mat2)
  println(mat1 + mat2)
  println(mat1 * mat2)
  println(mat1 * 5)
  println(mat1(2, 1))
}
