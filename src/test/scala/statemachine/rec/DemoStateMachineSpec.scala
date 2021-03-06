package statemachine.rec

import org.scalatest.{FlatSpec, Matchers}
import statemachine.{State, Transition}

/**
  * Created by salim on 3/16/2017.
  */
class DemoStateMachineSpec extends FlatSpec with Matchers {

  "RecStateMachine" should "Do Stuff" in {
    val foo = State("A")
    DemoStateMachine(foo, Transition("b")) match {
      case Left(s) => assert(s.name == "B")
      case Right(_) => fail()
    }
  }

  it should "be able to get an initial state" in {
    val foo: State = DemoStateMachine.newState
    DemoStateMachine(foo, Transition("b")) match {
      case Right(_) => fail()
      case Left(s) => assert(s.name == "B")
    }
  }

  it should "be able to react to a stream of states" in {
    val foo: State = DemoStateMachine.newState
    val events: Stream[Transition] = List(Transition("b"), Transition("a"), Transition("b")).toStream
    val s = DemoStateMachine(foo, events)
  }

  it should "have a default state" in {

  }



}
