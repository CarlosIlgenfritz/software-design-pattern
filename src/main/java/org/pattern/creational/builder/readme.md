# Builder Pattern

The Builder pattern is a creational design pattern that separates the construction of an object from its representation. It allows the same construction process to create different representations of an object.

The pattern involves creating a separate class, known as the Builder, that is responsible for the construction of an object. The Builder class contains methods for setting each attribute of the object to be created. The Builder class is also responsible for returning the object that it creates.

## The Prototype Pattern should be used when:
The Builder pattern should be used when:

- The object that is being created has many optional attributes that can be set in any order
- The object that is being created is immutable or should be immutable once it is created
- The construction of the object requires several steps


##  Prototype Pattern pros and cons:

### Pros
- The Builder pattern makes it easy to create complex objects with many optional attributes
- The pattern allows for a clear separation between the construction of an object and its representation
- The pattern makes it easy to create different representations of an object using the same construction process

### Cons
- The Builder pattern can lead to the creation of many small classes, which can complicate the codebase
- The pattern can also add complexity to the codebase if the object being created is simple and does not require many optional attributes