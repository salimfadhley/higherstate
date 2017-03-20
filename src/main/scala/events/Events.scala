package events

import statemachine.{TargetedTransition, Transition}

import scala.collection.mutable

/**
  * Created by salim on 3/17/2017.
  */
case class Events(events: mutable.MutableList[TargetedTransition]) {
  def filter(s: String): Stream[Transition] = {
    events.toStream.filter(_.target == s).map(_.transition)
  }

}
