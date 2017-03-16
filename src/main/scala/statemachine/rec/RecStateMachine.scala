package statemachine.rec

import statemachine._

/**
  * Created by salim on 3/16/2017.
  */
object RecStateMachine extends AbstractStateMachine[State] {
  override def apply(s: State, t: Transition): Either[State, StateMachineError] = {
    s.name match {
      case "A" => {
        t.name match {
          case "b" => Left(State("A"))
          case x => Right(new InvalidTransition(x))
        }
      }
      case "B" => {
        t.name match {
          case "a" => Left(State("B"))
          case x => Right(new InvalidTransition(x))
        }
      }
      case x => Right(new InvalidState(x))
    }

  }
}
