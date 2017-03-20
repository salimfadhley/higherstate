package events

import org.scalatest.{FlatSpec, Matchers}
import statemachine.{TargetedTransition, Transition}

import scala.collection.mutable

/**
  * Created by salim on 3/17/2017.
  */
class EventsSpec extends FlatSpec with Matchers {

  "Events" should "be filterable" in {

    val e: Events = Events(
      mutable.MutableList(
        TargetedTransition("1", Transition("x")),
        TargetedTransition("1", Transition("y")),
        TargetedTransition("1", Transition("n")),
        TargetedTransition("2", Transition("x")),
        TargetedTransition("1", Transition("a")),
        TargetedTransition("2", Transition("b"))
      )
    )
    assert(e.filter("2").toList == List(Transition("x"), Transition("b")))
  }


  //  it should "be able to build a state from a series of transitions" in {
  //
  //    val e:Events = Events(
  //      mutable.MutableList(
  //        TargetedTransition("1", Transition("b")),
  //        TargetedTransition("1", Transition("a")),
  //        TargetedTransition("1", Transition("b")),
  //        TargetedTransition("2", Transition("x")),
  //        TargetedTransition("1", Transition("a")),
  //        TargetedTransition("2", Transition("b"))
  //      )
  //
  //      assert(RecStateMachine(e.filter("1"))
  //    )
  //  }

}
