package statemachine

/**
  * Created by salim on 3/16/2017.
  */
trait AbstractStateMachine {
  def stateNames:Set[String]
  def getTransitions(s: State):Set[StateTransition]
  def currentState:State
  def setState(s:State): Unit
  def getState(s: String):Option[State]


  def transition(name:String):Unit = {


  }



  def availableTransitions = getTransitions(currentState)

}
