# Adapter

The Adapter Pattern is a structural design pattern that allows objects with incompatible interfaces to collaborate. It acts as a bridge between two incompatible interfaces, translating requests from one interface to the other.

## The Adapter Pattern should be used when:
The Adapter Pattern should be used when there are two existing interfaces that are incompatible with each other, but need to work together. It can also be used when a new system needs to be integrated with an existing system that uses a different interface.

## Adapter Pattern pros and cons:

### Pros
- Allows the reuse of existing code
- Allows for the integration of different systems with different interfaces
- Helps to separate concerns and increase modularity
- Open/Closed Principle. You can introduce new types of adapters into the program without breaking the existing client code, as long as they work with the adapters through the client interface.
-  Single Responsibility Principle. You can separate the interface or data conversion code from the primary business logic of the program.

### Cons
-  The overall complexity of the code increases because you need to introduce a set of new interfaces and classes. Sometimes it’s simpler just to change the service class so that it matches the rest of your code.