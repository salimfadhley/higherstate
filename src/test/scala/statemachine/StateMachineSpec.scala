package statemachine

import org.scalatest.{FlatSpec, Matchers}

import scala.collection.immutable.HashMap

/**
  * Created by salim on 3/16/2017.
  */
class StateMachineSpec extends FlatSpec with Matchers {

  "StateMachine" can "be created wth simple states" in {
    val sm = StateMachine(
      Map(
        State("A") -> Set(StateTransition("b", "B")),
        State("B") -> Set(StateTransition("a", "A"))
      )
    )

    assert(sm.stateNames == Set("A", "B"))
    assert(sm.getTransitions(State("A"))==Set(StateTransition("b", "B")))
    assert(sm.currentState==State("A"))
    assert(sm.availableTransitions==Set(StateTransition("b", "B")))
  }

  it can "get a state by name" in {
    val sm = StateMachine(
      Map(
        State("A") -> Set(StateTransition("b", "B")),
        State("B") -> Set(StateTransition("a", "A"))
      )
    )

    assert(sm.getState("A")==sm.transitions.keysIterator.next())
  }

  it can "be transitioned" in {
    val sm = StateMachine(
      Map(
        State("A") -> Set(StateTransition("b", "B")),
        State("B") -> Set(StateTransition("a", "A"))
      )
    )

//    sm.transition("b")
//    assert(sm.currentState==State("B"))
  }

}
