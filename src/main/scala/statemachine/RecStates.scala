package statemachine

/**
  * Created by salim on 3/20/2017.
  */
object RecState extends Enumeration {
  type RecState = Value
  val notStarted, sideA, sideB, reconciling, reconciled = Value
}


object Foo {
  val x: _root_.statemachine.RecState.Value = RecState.notStarted


}