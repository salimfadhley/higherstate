package statemachine

/**
  * Created by salim on 3/16/2017.
  */
object RecStates extends Enumeration {
  type RecStatus = Value
  val SideAReady, SideBReady, BothReady, Reconciling, Reconciled = Value
}
