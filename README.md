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

### Decorator
The Decorator Pattern lets you dynamically add or modify behavior to an object by wrapping it with decorator classes. Instead of extending functionality through inheritance (which can become cumbersome), decorators provide a flexible, modular way to achieve the same result.
- Add features like bold, italic, and underline dynamically to a text object.
- Add scroll bars, borders, or shadows to UI components dynamically.
- Add optional services like gift wrapping, faster delivery, or insurance dynamically to a product.

#### Real-World Example
Imagine you’re at a coffee shop ordering a coffee. You can customize your drink by adding extras like milk, sugar, whipped cream, etc. The base coffee remains the same, but the final result depends on the additional decorations (extras).

#### Advantages
- (Flexibility) Add functionality to objects dynamically without modifying the base class.
- (Modularity) Each decorator class adds a specific functionality, keeping the code manageable and reusable.
- Instead of creating multiple subclasses for every combination of features, decorators let you compose features dynamically.
- (Open/Close) You can extend the behavior of objects without changing their original code.

### Facade
This pattern provides a high-level interface (facade) that simplifies the interactions with a complex subsystem, hiding the details of its internal components. Think of it as a "front desk" that handles all the messy details behind the scenes.
- In microservices, API gateways act as facades, exposing a simplified interface to clients while managing calls to multiple services behind the scenes.
- A "Play" button in a media player hides the complexity of decoding, buffering, and rendering video/audio streams.
- A shopping cart interface hides the complexity of interacting with inventory, payment, and shipping subsystems.

#### Real-World Example
When you book a hotel, you interact with a single receptionist or booking portal. Behind the scenes, the system manages accommodation, catering, transportation, and other services. The receptionist (or the booking portal) acts as a facade, simplifying your interaction.

#### Advantages
- Makes complex subsystems easier to use by exposing a single, high-level interface.
- Decouples the client from the internal details of the subsystem, making the system more maintainable and scalable.
- (Readability) Hides implementation complexity, leading to cleaner and more understandable client code.
- The Facade acts as a mediator, enforcing consistent interaction with subsystems.

### Proxy
This pattern creates an intermediary between the client and the real object. This intermediary can control access, manage performance, or enhance functionality without changing the actual object.
- When an object is resource-intensive to create, and you want to delay its instantiation until necessary.
- When you want to add security or logging to existing functionality.
- When you need to control access to a sensitive or critical resource.

#### Real-World Example
When you interact with an ATM, it acts as a proxy for your bank account. The ATM does not give direct access to your account but ensures secure transactions, logging, and restricted access.

#### Advantages
- The proxy can validate and control access to the real object.
- Useful for lazy initialization, where resources are loaded only when required (e.g., large files or database connections).
- A proxy can add an additional security layer by restricting or validating user requests.
- Proxies can track interactions with the real object for auditing or monitoring purposes.
- You can modify or extend proxy functionality without altering the real object.

### Bridge
The Bridge Pattern is essentially about "bridging" the gap between an abstraction (interface) and its implementation. Instead of directly connecting them, you introduce an intermediary bridge to ensure that the abstraction and implementation can vary independently.
- Separating widgets (abstraction) from the platform-specific rendering (implementation).
- Managing various devices like printers, cameras, or smart appliances using a unified control interface.
- Abstracting the high-level database operations from the specific driver implementations.

#### Real-World Example
Imagine designing a universal remote control for home appliances like TVs and fans. The remote control defines the abstraction (e.g., turning on/off, changing settings), while the specific appliance (TV, fan) represents the implementation.
Using the Bridge Pattern, you can design the remote control to work with different appliances without changing the remote’s structure every time you add a new device.

#### Advantages
- Both abstraction and implementation can evolve independently, making the code flexible.
- Avoids having multiple abstractions tightly coupled with implementations.
- (Extensibility) New abstractions or implementations can be added without affecting existing code.
- Separates concerns, making the code easier to understand and maintain.

### Flyweight
It minimizes memory usage by sharing common parts of the state among multiple objects, instead of storing it for each object individually. It’s especially useful in scenarios where you need to create a large number of similar objects.
- Characters (glyphs) are shared, with unique styles like size and position stored separately.
- Objects like trees, soldiers, or bullets in a game can share common data such as texture or shape.
- Frequently used objects like database connections or thread pools can be shared among clients.

#### Real-World Example
Imagine you’re building a text editor that displays thousands of characters on the screen. Storing the font, color, and other styles for each character individually would consume a huge amount of memory.
The Flyweight Pattern allows the text editor to:
- Share common glyph shapes (e.g., the letter “A”) among all instances of “A” on the screen.
- Store only the unique state (like position, font size) for each character.

#### Advantages
- (Memory Efficiency) Reduces memory consumption by sharing objects instead of creating duplicate ones.
- Fewer objects mean reduced memory overhead and faster processing.
- (Flexibility) Separates intrinsic (shared) and extrinsic (unique) state, allowing finer control over memory usage.
- (Scalability) Perfect for systems that need to manage a large number of objects (e.g., UI elements, graphics).


## Behavioral Patterns
### Observer
### Strategy