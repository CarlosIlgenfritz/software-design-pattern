# Command Pattern

The idea behind the command pattern is to get different operations and encapsulate it into into individual commands.

## The command pattern should be used when:
- You need a command to have a lifetime independent of the original request, or if you want to queue, specify, and execute requests at different times.
- You need undo/redo operations. Command execution can be stored to reverse its effects. It is important that the Command Class implements undo and redo methods.

## Command pattern pros and cons:

### Pros
- Respect the single responsibility principle. 
- Respect the open/closed principle. You can create new commands without breaking existing code.
- You can also define a rollback system with the Command pattern
- Have strict control over how and when commands are invoked.
- The code is easier to use, understand, and test because the commands simplify the code.

### Cons
- The code may become more complicated since you’re introducing a whole new layer between senders and receivers.
