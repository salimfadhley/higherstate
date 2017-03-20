package statemachine

/**
  * Created by salim on 3/20/2017.
  */

case class StateMachine() extends AbstractStateMachine[State, Transition] {
  override def newState: State = ???

  override def apply(s: State, t: Transition): Either[State, StateMachineError] = ???
}

object StateMachine {
  def build[S <: Enumeration, T <: Enumeration](states: S, transition: T): StateMachine = {
    StateMachine()
  }


}
