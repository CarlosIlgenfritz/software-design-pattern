# Singleton

Singleton is a creational design pattern that lets you ensure that a class has only one instance

## The Singleton pattern should be used when:
-   Use the Singleton pattern when a class in your program should have just a single instance available to all clients
-   You need strict controll over global variables

## Singleton pattern pros and cons:

### Pros
-   You can be sure that a class has only a single instance.
-   You gain a global access point to that instance.

### Cons
-  The pattern requires special treatment in a multithreaded environment so that multiple threads won’t create a singleton object several times.
