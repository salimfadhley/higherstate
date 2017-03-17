package statemachine.rec

import statemachine._

/**
  * Created by salim on 3/16/2017.
  */
object RecStateMachine extends AbstractStateMachine[State, Transition] {
  override def apply(s: State, t: Transition): Either[State, StateMachineError] = {
    s match {
      case State("A") =>
        t match {
          case Transition("b") => Left(State("B"))
          case x => Right(new InvalidTransition(x.toString))
        }
      case State("B") =>
        t match {
          case Transition("a") => Left(State("A"))
          case x => Right(new InvalidTransition(x.toString))
        }
      case x => Right(new InvalidState(x.toString))
    }
  }

  override def newState: State = State("A")
}
