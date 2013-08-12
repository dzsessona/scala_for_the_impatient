package Chapter_15_Annotations.ex1

import org.junit.Test
import org.junit.Assert._

class Testit{

  @Test
  def first(): Unit ={assertTrue(true)}

  @Test(timeout = 100)
  def second(): Unit = {assertTrue(true)}

  @Test(expected = classOf[IndexOutOfBoundsException])
  def third(): Unit ={throw new IndexOutOfBoundsException}

  @Test(timeout = 100,expected = classOf[IndexOutOfBoundsException])
  def fourth(): Unit = {throw new IndexOutOfBoundsException}

}
