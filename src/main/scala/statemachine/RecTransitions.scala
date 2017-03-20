package statemachine

/**
  * Created by salim on 3/20/2017.
  */
object RecTransition extends Enumeration {
  type RecTransition = Value
  val gotSideA, gotSideB, startedReconcile, finishedReconcile, stored = RecTransition


}
