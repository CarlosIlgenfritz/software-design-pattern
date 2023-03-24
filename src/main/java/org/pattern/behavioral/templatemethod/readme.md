# Template Method

Template method is a behavioral command pattern in with the idea is to define a skeleton of algorithm in the superclass and let the subclasses override specific steps.

## The tempalate pattern should be used when:
-  You want to let clients extend only particular steps of an algorithm, but not the whole algorithm.
-  Use the pattern when you have several classes that contain almost identical algorithms with some minor differences.

## Thetemplate method pattern pros and cons:

### Pros
- You can put duplicated code inside the superclass
- You can let clients override only certain parts of a large algorithm, making them less affected by changes that happen to other parts of the algorithm.

### Cons
- Clients may be limited by the skeleton provided of the algorithm.
- You might violate the Liskov Substitution Principle by suppressing a default step implementation via a subclass.
- Inheritance is a very strong relationship