package Chapter_05_Classes.ex8

class Car(val manufacturer: String,          //read only
          val modelName: String,             //read only
          val modelYear: Int = -1,           //read only
          var plate: String = "")            //read - write
