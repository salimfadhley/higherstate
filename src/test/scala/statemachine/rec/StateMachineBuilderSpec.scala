package statemachine.rec

import org.scalatest.{FlatSpec, Matchers}
import statemachine.{RecState, RecTransition, StateMachine}

/**
  * Created by salim on 3/20/2017.
  */
class StateMachineBuilderSpec extends FlatSpec with Matchers {

  "StateMachine" can "be built from an enumeration" in {

    //    Map(RecState.notStarted -> )

    StateMachine.build(RecState, RecTransition)

  }


}
