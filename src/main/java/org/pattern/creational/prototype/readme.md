# Prototype Pattern

The Prototype pattern is a creational design pattern that enables the creation of new objects by copying/cloning existing objects, rather than creating new objects from scratch. The pattern provides a way to create objects more efficiently by avoiding the overhead of initializing objects from scratch, and instead, creating them from existing objects.

## The Prototype Pattern should be used when:
- When creating new objects is costly, and you want to create objects more efficiently by copying/cloning existing objects.
- When you want to avoid coupling between the client code and the objects it creates by providing a factory method to create new objects.


##  Prototype Pattern pros and cons:

### Pros
- Efficient object creation by avoiding the overhead of initializing objects from scratch.
- Reduced coupling between the client code and the objects it creates.
- Flexible object creation by allowing the creation of new objects with different property values.

### Cons
- Cloning objects can be complex if the object has many dependencies or contains circular references.
- Overuse of the Prototype pattern can lead to code bloat if the objects being cloned have many properties.