package statemachine.rec

import org.scalatest.{FlatSpec, Matchers}
import statemachine.{State, Transition}

/**
  * Created by salim on 3/16/2017.
  */
class RecStateMachineSpec extends FlatSpec with Matchers {

  "RecStateMachine" should "Do Stuff" in {
    val foo = State("A")
    RecStateMachine(foo, Transition("b")) match {
      case Left(s) => assert(s.name == "B")
      case Right(x) => fail()
    }
  }

  it should "be able to get an initial state" in {
    val foo: State = RecStateMachine.newState

    RecStateMachine(foo, Transition("b")) match {
      case Left(s) => assert(s.name == "B")
      case Right(x) => fail()
    }

  }

}
