# Factory Method

The Factory Method pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. The pattern encapsulates the object creation process and decouples the client code from the actual implementation details.

## The Factory Method pattern should be used when:
- You have a superclass that provides a generic interface for creating objects, but you want to allow subclasses to decide which class to instantiate.
- You want to decouple the client code from the actual implementation details of the objects that are being created.
- You need to add new types of objects without modifying existing code.


##  Factory Method pros and cons:

### Pros
- The Factory Method pattern provides a flexible and extensible way of creating objects, because it allows you to decouple the client code from the actual implementation details of the objects that are being created.
- The pattern makes it easy to add new types of objects without modifying existing code, because you can simply create a new subclass that implements the factory method.
- The pattern helps to improve the maintainability of your code, because it separates the object creation process from the client code, which makes it easier to modify and test the code.

### Cons
- The pattern can lead to an increase in the number of classes in your codebase, which can make the code more complex and harder to understand.
- The pattern can also lead to an increase in the amount of boilerplate code that you need to write, because you have to define a new subclass for each new type of object that you want to create.