package statemachine

/**
  * Created by salim on 3/16/2017.
  */
case class StateMachine(transitions:Map[State,Set[StateTransition]]) extends AbstractStateMachine {
  def getState(s: String) = ???

  var currentState: State = transitions.keysIterator.next()
  def getTransitions(s: State):Set[StateTransition] = {
    transitions.get(s) match {
      case Some(st) => st
      case None => Set()
    }
  }
  def stateNames:Set[String] = transitions.keySet.map(_.name)
//  def transition(s: String) = ???
  override def setState(s: State): Unit = {
    currentState = s
  }
}
