# design-patterns
Design patterns are reusable solutions to common problems in software design. They are categorized into three types:
- Creational Patterns: Focus on object creation (e.g., Singleton, Factory Method).
- Structural Patterns: Deal with object composition (e.g., Adapter, Composite).
- Behavioral Patterns: Address communication between objects (e.g., Observer, Strategy).

## Creational Patterns
These patterns are all about managing the instantiation of objects in a way that makes your code more flexible and reusable.

### Singleton
This pattern restricts the instantiation of a class to a single object and ensures global access to that instance. It’s useful in scenarios where you need exactly one instance of a class to control actions, like a configuration manager, logging service, or database connection pool.
- Ensures only one instance of the class exists.
- Provides a global point of access to that instance.
- Prevents instantiation through new objects.

#### Real-World Example
Imagine you are designing a printer spooler management system for a large office. A printer spooler is responsible for managing and queuing print jobs sent to a shared printer.

#### Advantages
- Provides a single point of access to shared resources, making it easy for different parts of the application to interact with the same instance.
- Prevents the overhead of creating multiple instances of a resource-heavy object like a database connection or thread pool.

### Factory Method
This pattern provides an interface or abstract class for creating objects, but it lets the subclasses decide which class to instantiate. It promotes loose coupling by decoupling the client code from the actual object creation process. 
- Defines an interface (or abstract class) for creating an object.
- Subclasses decide the specific type of objects that will be instantiated.
- Useful when the client code doesn’t need to know the details of object creation.

#### Real-World Example
Imagine you’re designing a system for a document editor that supports different types of documents like Word and Excel. Using the Factory Method, we can dynamically create objects for these document types without hard-coding their instantiation.

#### Advantages
- Promotes loose coupling between client code and object creation.
- Makes the code easier to maintain and extend, as you can add new types without changing the existing code.

### Builder
This pattern is particularly useful when you want to create complex objects step-by-step without mixing their construction and representation.
- Separates the construction of a complex object from its representation.
- Provides a clear and step-by-step approach to building an object.
- Allows the same construction process to create different representations of objects.

#### Real-World Example
Imagine building a custom pizza. Each pizza might have different crusts, sizes, and toppings, but the process for creating a pizza remains the same.

#### Advantages
- Makes the construction process clear and manageable, especially for complex objects.
- Improves code readability and reusability.
- Can create different representations of the same object (e.g., vegetarian pizza, meat lovers’ pizza).


## Structural Patterns
### Adapter
### Composite


## Behavioral Patterns
### Observer
### Strategy