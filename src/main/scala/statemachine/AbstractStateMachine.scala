package statemachine

/**
  * Created by salim on 3/16/2017.
  */
trait AbstractStateMachine[S <: State] {
  def apply(s: S, t: Transition): Either[S, StateMachineError]
}
