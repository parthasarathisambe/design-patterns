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
Structural Design Patterns focus on how objects and classes are composed to form larger structures. They simplify relationships between objects, making them easier to manage and extend.

### Adapter
This pattern acts as a bridge between two incompatible interfaces, allowing them to work together. It’s particularly useful when you have existing code you cannot or do not want to modify but need it to interact with new code.
- Integrating with legacy systems.
- Developing applications to work across multiple APIs or libraries.
- Enabling communication between devices or systems with different protocols.

#### Real-World Example
You’re developing a media player that can play different formats (e.g., MP3, MP4, VLC). Existing code only supports MP3. Use an adapter to allow the media player to interact with external code that plays other formats.
You travel internationally and need to connect your device’s charger to a socket that has a different shape or voltage. A power adapter converts the incompatible socket interface to your plug’s interface, allowing your device to work seamlessly.

#### Advantages
- Bridges gaps between incompatible interfaces, making integration seamless.
- Enables the use of pre-existing classes without modification, saving development time and effort.
- Makes systems adaptable to changing requirements by allowing you to plug in new interfaces easily.
- Decouples code from specific implementations, ensuring better maintainability and scalability.

### Composite
This pattern is particularly useful for representing part-whole hierarchies, where individual objects and groups of objects are treated in the same way. It simplifies the interaction with complex structures, such as trees or organizational hierarchies.
- Components like buttons, panels, and windows are treated uniformly in graphical user interfaces.
- Employees and departments in an organization, where departments can contain other employees or departments.
- In a restaurant menu, items and sub-menus can be displayed uniformly.

#### Key concepts
- Component - An interface or abstract class representing objects in the composition
- Leaf - Represents individual object (e.g., files) that have no children
- Composite - Represents objects (e.g., directories) that can contain other objects, both Leaf and Composite.

#### Real-World Example
Imagine a file system where directories can contain files or other directories, forming a tree structure. You want to be able to treat both individual files and entire directories uniformly when displaying their contents or performing operations. Using the Composite Pattern, we can create a common interface for both files and directories, making it easier to traverse and manipulate the file system.

#### Advantages
- The client can treat individual objects (files) and groups of objects (directories) uniformly, reducing complexity.
- Makes it easier to handle tree-like structures such as file systems, graphical user interfaces, or organizational charts.
- (Scalability) New types of components (e.g., symbolic links in a file system) can be added without altering existing code.
- (Flexibility) Components can be composed dynamically, creating complex structures on the fly.

## Behavioral Patterns
### Observer
### Strategy