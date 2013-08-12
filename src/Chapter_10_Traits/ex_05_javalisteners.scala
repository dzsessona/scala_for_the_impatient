package Chapter_10_Traits.ex5

import scala.collection.mutable.Map
import java.beans.PropertyChangeListener
import java.beans.PropertyChangeEvent

trait PropertyChangeSupport {
  val listeners = Map[String, PropertyChangeListener]()

  def addPropertyChangeListener(propertyName: String, listener: PropertyChangeListener) {
    listeners += propertyName -> listener
  }

  def firePropertyChange(propertyName: String, oldValue: Any, newValue: Any) {
    if (listeners.contains(propertyName)) {
      val listener = listeners(propertyName)
      listener.propertyChange(new PropertyChangeEvent(
        this, propertyName, oldValue, newValue))
    }
  }
}

class Listener extends PropertyChangeListener {
  def propertyChange(evt: PropertyChangeEvent) {
    println(evt)
  }
}

object Main extends App {
  val point = new java.awt.Point(10, 20) with PropertyChangeSupport {
    override def setLocation(x: Double, y: Double) {
      firePropertyChange("setLocation", (getX(), getY()),
        (x, y))
      super.setLocation(x, y)
    }
  }

  val listener = new Listener
  point.addPropertyChangeListener("setLocation", listener)
  point.setLocation(20.0, 30.0)
}

