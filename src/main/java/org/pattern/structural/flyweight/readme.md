# Flyweight Pattern

The Flyweight pattern is a structural design pattern that is used to reduce the memory footprint of an application by sharing a common set of data between multiple objects. This pattern is especially useful when an application needs to create a large number of similar objects that have a lot of shared data.

## The Flyweight Pattern Pattern should be used when:
The Flyweight pattern should be used when an application needs to create a large number of objects that have a lot of shared data. By using this pattern, you can reduce the memory usage of the application and improve its performance. The Flyweight pattern is commonly used in Java to implement graphical user interfaces, where multiple objects can share the same graphical elements.

## Flyweight Pattern Pattern pros and cons:

### Pros
- Reduces the memory usage of an application by sharing a common set of data between multiple objects.
- Improves the performance of an application by reducing the time it takes to create and destroy objects.

### Cons
- Can make the code more complex, especially if there are many different types of objects that need to be shared.
- Can be difficult to implement if the objects have a lot of mutable state that needs to be tracked and managed.
- Requires careful planning and design to ensure that the shared data is accessed and modified safely.
  Markdown is a lightweight markup language based on the formatting conventions
  that people naturally use in email.