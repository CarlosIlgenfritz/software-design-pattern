# Mediator

Mediator lets you reduce chaotic dependencies between objects. The pattern restricts direct communications between the
objects and forces them to collaborate only via a mediator object.

## The mediator pattern should be used when:

- Use the Mediator pattern when it’s hard to change some classes because they are tightly coupled to a bunch of other
  classes.
- Use the pattern when you can’t reuse a component in a different program because it’s too dependent on other
  components.

## Mediator pattern pros and cons:

### Pros

- Single Responsibility Principle. You can extract the communications between various components into a single place,
  making it easier to comprehend and maintain.
- Open/Closed Principle. You can introduce new mediators without having to change the actual components.
- You can reduce coupling between various components of a program.

### Cons

- Over time a mediator can evolve into a God Object.