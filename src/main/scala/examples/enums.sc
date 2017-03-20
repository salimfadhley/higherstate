def doStuff[E <: Enumeration](e: E): Int = {
  // Works fine
  println("Got an enum: " + e.toString())
  e.values.size
}

def funnyBusiness[E <: Enumeration](v: E#Value): Unit = {
  // This doesn't work!
  println(v)
}

object Xenu extends Enumeration {
  type Xenu = Value
  val foo, bar, baz = Value
}

object Yenu extends Enumeration {
  type Yenu = Value
  val blip, blop, blap, blep = Value
}

doStuff(Xenu) // Works
doStuff(Yenu) // Works

funnyBusiness(Xenu.bar) // Wrong
funnyBusiness(Yenu.blip) // Wrong