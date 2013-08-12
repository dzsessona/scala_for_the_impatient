package Chapter_14_CaseClasses.ex7

sealed abstract class BinaryTree
case class Leaf(value: Int) extends BinaryTree
case class Node(leafs: BinaryTree*) extends BinaryTree

object Main extends App{

  def sumBinaryTree(tree:BinaryTree): Int = tree match{
    case Leaf(v) => v
    case Node(lfs @ _*) => lfs.map(sumBinaryTree(_)).sum //(for(x <- lfs) yield sumBinaryTree(x)).sum
  }

  println(sumBinaryTree(Node (Node(Leaf(3),Leaf(4),Leaf(90)), Leaf(9))))

}


