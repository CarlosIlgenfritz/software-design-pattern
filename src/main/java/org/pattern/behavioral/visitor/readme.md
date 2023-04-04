# Visitor Pattern

The Visitor pattern is a behavioral design pattern that allows you to define new operations without changing the classes of the objects on which they operate. It separates the algorithm from the objects on which it operates.

## The Visitor Pattern should be used when:
- You have a class hierarchy with many different types of objects and you want to perform operations on those objects without changing their class hierarchy.
- You want to add new operations to an existing class hierarchy without modifying the classes themselves.

## Visitor Pattern pros and cons:

### Pros
- Open/Closed Principle. You can introduce a new behavior that can work with objects of different classes without changing these classes.
- Single Responsibility Principle. You can move multiple versions of the same behavior into the same class.

### Cons
- You need to update all visitors each time a class gets added to or removed from the element hierarchy.
- Can be complex to implement, especially in large class hierarchies.