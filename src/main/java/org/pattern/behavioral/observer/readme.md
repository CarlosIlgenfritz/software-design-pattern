# Observer Pattern

The Observer pattern is a behavioral design pattern that allows an object, called the subject, to notify a list of observers when its state changes. This pattern is used when there is a one-to-many relationship between objects, and the state change of one object requires other objects to be notified and updated automatically.

## The Observer should be used when:
- When there is a one-to-many relationship between objects, and changes to one object should be automatically propagated to other objects.
- When you want to decouple an object from the other objects that depend on it, allowing for greater flexibility in the system's design.

## Observer pros and cons:

### Pros
- The Observer pattern provides a way for objects to communicate without being tightly coupled to each other.
- It allows for greater flexibility and extensibility in the system's design.
- It promotes a more modular and maintainable codebase.

### Cons
- The Observer pattern can result in a large number of update notifications being sent, which can impact performance.
- It can be difficult to debug and maintain the code when there are many observers and subjects involved.
- There is a risk of memory leaks if observers are not properly deregistered from the subject when they are no longer needed.
