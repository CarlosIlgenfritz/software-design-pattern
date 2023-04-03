# Memento

The Memento pattern is a behavioral design pattern that allows an object to capture its internal state and save it externally so that the object can be restored to that state later on without violating encapsulation. This pattern is useful when an object needs to be able to save and restore its state.

## The memento should be used when:
- When you need to provide undo/redo functionality.
- When you need to be able to save and restore the state of an object for other reasons.
- When the object's state is complex, and directly exposing the state would be impractical or violate encapsulation.

## Memento pros and cons:

### Pros
- It allows an object to restore its internal state without revealing its implementation details.
- It separates the responsibility of state management from the object itself.
- It provides a simple way to implement undo/redo functionality.

### Cons
- The Memento pattern can increase memory usage since it requires the storage of previous states of the object.
- It can also increase processing time as restoring the state of the object can be an expensive operation.