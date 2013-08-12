package Chapter_14_CaseClasses.ex8

sealed abstract class BinaryTree
case class Leaf(value: Int) extends BinaryTree
case class Node(operator:Char, leafs: BinaryTree*) extends BinaryTree

object Main extends App{

  def evalBinaryTree(tree:BinaryTree): Int = tree match{
    case Leaf(v) => v
    case Node(opr,lfs @ _*) => opr match{
      case '+' => lfs.map(evalBinaryTree(_)).sum
      case '-' => lfs.map(evalBinaryTree(_)).sum
      case '*' => lfs.map(evalBinaryTree(_)).product
    }
  }

  println(evalBinaryTree(Node ('+',Node('*', Leaf(3),Leaf(4),Leaf(90)), Leaf(9))))

}
