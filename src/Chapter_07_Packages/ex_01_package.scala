package Chapter_07_Packages.ex1

class Inner

package horstmann {

import Chapter_07_Packages.ex1.horstmann
package impatient {

import Chapter_07_Packages.ex1.horstmann.impatient

// This works, we can see members of com
class Person(inner: Inner)
}
}

package Chapter_07_Packages.ex1.horstmann.impatient {
// This doesn't work - we can't see members of com
class PersonTwo(inner: Inner)
}
