package Chapter_10_Traits.ex7

import java.io.FileInputStream
import java.io.InputStream
import java.io.File

trait Bufferable {
  this: FileInputStream =>

  var buffer = new Array[Byte](16)
  var pos = 0
  var copied = 0

  override def read : Int = {
    if ((pos == 0) || (available >= 16 && pos >= 16)) {
      copied = 16
      pos = 0
      read(buffer, 0, copied)
    }
    else if (available > 0 && available < 16) {
      copied = available
      pos = 0
      read(buffer, 0, copied)
    }

    var ret = -1
    if (pos < copied) {
      ret = buffer(pos)
      pos += 1
    }
    ret
  }
}



