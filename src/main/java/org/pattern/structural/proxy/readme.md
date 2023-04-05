# Proxy Pattern

The Proxy pattern is a structural design pattern that provides a surrogate or placeholder object for another object to control access to it. This pattern is used to create a representative object that can be used in place of a real object.

## The Proxy Pattern should be used when: 
Pattern Pattern should be used when:
The Proxy pattern should be used when:

- You want to control access to an object.
- You want to add additional functionality to an object without modifying the original object.
- You want to reduce the network traffic and improve performance by caching results.


##  Proxy Pattern pros and cons:

### Pros
- Provides a level of indirection to access an object.
- Enhances the security of the original object by controlling access to it.
- Can be used to reduce network traffic and improve performance by caching results.
- Can be used to add additional functionality to an object without modifying the original object.

### Cons
- Adds another layer of complexity to the system, which can make it harder to maintain.
- Can increase the response time of the system due to the additional processing required.
- Can make the code more difficult to understand, especially if the proxy object has a lot of additional functionality.