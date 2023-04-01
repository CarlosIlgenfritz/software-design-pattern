# Null Object Pattern

The Null Object Pattern is a design pattern that provides a way to handle null references in a more elegant and robust way. It achieves this by creating a special "null" object that has the same interface as the real object, but with a defined behavior when the methods are called.

## The Null Object pattern should be used when:
The Null Object Pattern should be used when you have a group of related objects that share a common interface or abstract class, and you want to provide a consistent and flexible way to handle null objects.

## Null Object pattern pros and cons:

### Pros
-   Reduces code complexity by eliminating null reference checks and branching
- Improves code maintainability by providing a consistent way to handle null objects
- Enhances code flexibility by allowing easy substitution of real and null objects
- Provides a default behavior for null objects, which can be useful in many cases

### Cons
- Can increase memory usage if many null objects are created
- May add complexity to the code if not used properly or overused
- May lead to unexpected behavior if the null object's behavior is not properly defined or  understood.
