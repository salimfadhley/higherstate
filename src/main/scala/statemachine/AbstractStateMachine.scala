package statemachine

/**
  * Created by salim on 3/16/2017.
  */
trait AbstractStateMachine[S <: State, T <: Transition] {
  def newState: S
  def apply(s: S, t: T): Either[S, StateMachineError]

  def apply(state: S, ts: Stream[T]): Either[S, StateMachineError] = {
    ts match {
      case s if s.isEmpty => Left(state)
      case tts =>
        apply(state, tts.head) match {
          case Left(ss) => apply(ss, tts.tail)
          case Right(e) => Right(e)
        }
    }
  }
}
