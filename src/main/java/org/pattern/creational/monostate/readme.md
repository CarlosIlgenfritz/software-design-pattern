# Monostate

The Monostate pattern is a design pattern in object-oriented programming that aims to create a singleton-like behavior for a class. It ensures that all instances of the class share the same state, which is stored in a static member variable, regardless of how many objects are created.

## The Monostate pattern should be used when:
-   Managing configuration settings across an application.
- Sharing resources across multiple instances of a class, such as a database connection pool.
- Ensuring that all instances of a class have the same state, such as a logger class that logs to a common file.

## Singleton pattern pros and cons:

### Pros
-   The Monostate pattern provides a way to maintain a shared state across multiple instances of a class, which can simplify the design of an application.
- It can be easier to test code that uses the Monostate pattern, since the shared state can be set up once and reused across multiple test cases.
- The Monostate pattern can provide a way to ensure that all instances of a class have the same behavior, which can be useful in certain situations.

### Cons
-  The Monostate pattern can be confusing to developers who are not familiar with it, as it can be easy to accidentally create multiple instances of a class that share the same state.
- The shared state in the Monostate pattern can be mutable, which can lead to unexpected behavior and race conditions in a multi-threaded environment.
- The Monostate pattern can make it difficult to reason about the behavior of a system, as it can be hard to determine which instances of a class are using the shared state.