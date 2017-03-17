package statemachine

/**
  * Created by salim on 3/16/2017.
  */
trait AbstractStateMachine[S <: State, T <: Transition] {
  def newState: S

  def apply(s: S, t: T): Either[S, StateMachineError]
}
