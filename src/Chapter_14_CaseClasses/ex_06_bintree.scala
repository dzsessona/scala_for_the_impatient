package Chapter_14_CaseClasses.ex6

sealed abstract class BinaryTree
case class Leaf(value:Int) extends BinaryTree
case class Node(left:BinaryTree, right:BinaryTree) extends BinaryTree

object Main extends App{

  def sumBinaryTree(tree:BinaryTree): Int = tree match{
    case Leaf(v) => v
    case Node(lf, rg) => sumBinaryTree(lf) + sumBinaryTree(rg)
  }

  println(sumBinaryTree(Node (Node(Leaf(3),Leaf(4)), Leaf(9))))
  println("btw, sealed make sure that the match maches all subtypes of the abstract class")

}