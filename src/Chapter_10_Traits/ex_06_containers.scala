package Chapter_10_Traits.ex6

import scala.io.Source

object Main extends App {
  println("Java would not allow JContainer to inherit from the classes JComponet and Container simultaneously - in other words, Java does not allow multiple inheritance of classes, only interfaces. You could achieve the proposed design by making Component and Container traits, meaning that JComponent could extend Component, whilst JContainer could extend Component and Container.")
}
