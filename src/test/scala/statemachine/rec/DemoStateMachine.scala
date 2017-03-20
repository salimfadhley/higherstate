package statemachine.rec

import statemachine._

/**
  * Created by salim on 3/16/2017.
  */
object DemoStateMachine extends AbstractStateMachine[State, Transition] {

  val StateA = State("A")
  val StateB = State("B")
  val StateC = State("C")

  val TransitionB = Transition("b")
  val TransitionC = Transition("c")
  val TransitionAA = Transition("aa")

  override def apply(s: State, t: Transition): Either[State, StateMachineError] = {
    s match {
      case StateA =>
        t match {
          case TransitionB => Left(StateB)
          case TransitionC => Left(StateC)
          case x => Right(new InvalidTransition(x.toString))
        }
      case StateB =>
        t match {
          case TransitionAA => Left(StateA)
          case x => Right(new InvalidTransition(x.toString))
        }
      case StateC =>
        t match {
          case TransitionAA => Left(StateA)
          case x => Right(new InvalidTransition(x.toString))
        }
      case x => Right(new InvalidState(x.toString))
    }
  }

  override def newState: State = State("A")
}
