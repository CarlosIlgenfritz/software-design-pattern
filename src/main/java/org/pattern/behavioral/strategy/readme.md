# Strategy

Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

## The strategy pattern should be used when:
-  Have a class that do a lot of different things, extract all of these algorithms into separate classes called strategies.
-  Use the pattern when your class has a massive conditional statement that switches between different variants of the same algorithm.

## Strategy pattern pros and cons:

### Pros
- You can change algorithms used inside an object at runtime.
- Open/Closed Principle. You can introduce new strategies without having to change the context.

### Cons
-  If you only have a couple of algorithms and they rarely change, there’s no real reason to overcomplicate the program with new classes and interfaces that come along with the pattern.