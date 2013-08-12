package Chapter_15_Annotations.ex2

import scala.deprecated

@deprecated class allAnnotated  (@deprecated val s:String){

  @deprecated def fun():Unit ={
    @deprecated var bla:  String = ""
  }

}