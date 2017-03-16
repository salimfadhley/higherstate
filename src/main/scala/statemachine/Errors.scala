package statemachine

/**
  * Created by salim on 3/16/2017.
  */
class StateMachineError(message: String) extends RuntimeException(message) {}

class InvalidTransition(message: String) extends StateMachineError(message) {}

class InvalidState(message: String) extends StateMachineError(message) {}

