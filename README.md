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

### Prototype
The Prototype Pattern creates new objects by copying an existing object, known as the prototype, instead of creating objects from scratch. It is particularly useful when the object creation process is expensive or complex, and cloning provides a more efficient way to create new instances.

#### Real-World Example
Imagine you’re creating a document editing application. You have predefined templates for resumes, letters, and reports. Instead of building a new document from scratch each time, you can copy an existing template and make modifications as needed.
Prototype pattern allows you to quickly create new documents by cloning predefined templates, saving time and effort

#### Advantages
- Cloning objects is often faster than creating new ones, especially for resource-heavy objects.
- Eliminates the need for complex constructors when creating similar objects.
- The cloned object can be modified without affecting the prototype.
- You don’t need to create multiple subclasses for similar configurations; you can clone and modify prototypes instead.

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
### Chain of Responsibility
It allows a request to pass through a series of handlers. Each handler decides:
- Whether to process the request.
- Whether to pass it along to the next handler in the chain.
This pattern helps decouple the sender of the request from its receivers, as the sender doesn’t know which handler will process the request.

#### Real-World Example
Imagine a customer support system with multiple levels of support:
- Level 1: Handles basic inquiries.
- Level 2: Handles more technical issues.
- Level 3: Escalates to expert-level technicians.
A customer’s query starts at Level 1, and if it cannot be resolved, it is passed to the next level. This is a real-world example of a chain of responsibility.

#### Advantages
- The sender doesn’t need to know which handler will process the request.
- Easily add or modify handlers without changing client code.
- Avoids hardcoding multiple if-else or switch-case statements for handling requests.
- You can add new handlers or reorder the chain without affecting the existing ones.

### Command
Encapsulates a request (or action) as an object, allowing you to:
- Parameterize methods with different requests.
- Queue or log requests for later execution.
- Support undo and redo operations.
This pattern decouples the sender (who requests an action) from the receiver (who performs the action) by introducing a command object.

#### Real-World Example
Imagine you have a smart home system with different devices like lights, fans, and air conditioners. Using the Command Pattern, you can:
- Turn devices On/Off
- Schedule or queue commands.
- Undo actions (e.g., turning a light back off).
Instead of hardcoding requests for each device, you create commands that encapsulate these requests, making the system more flexible and extensible.

#### Advantages
- The invoker (e.g., remote) and receiver (e.g., light, fan) are decoupled by the command objects.
- (Flexibility) You can add new commands without changing the existing code.
- Commands can encapsulate logic for undo operations.
- Commands can be stored and executed later, allowing delayed or batch processing.

### Observer
Establishes a one-to-many dependency between objects. When one object (the Subject) changes its state, all dependent objects (the Observers) are notified and updated automatically. It’s like a subscription service: when something updates, all subscribers are informed.

#### Real-World Example
Imagine you subscribe to a YouTube channel. The channel (Subject) publishes a new video, and all the subscribers (Observers) are notified instantly. This decouples the channel from knowing how many subscribers exist or how they handle notifications.

#### Advantages
- The subject doesn’t need to know the details of its observers, ensuring loose coupling.
- Observers are notified automatically whenever the subject changes its state.
- (Scalability) You can easily add/remove observers without modifying the subject’s code.
- (Reusability) Both subject and observers can be reused independently in different contexts.

### State
The State Pattern allows an object to change its behavior when its internal state changes. Instead of using lots of conditional statements (like if-else or switch), the pattern encapsulates state-specific behavior into separate classes and delegates behavior changes to these state classes.

#### Real-World Example
Consider a traffic light system. The light can be in one of three states: Red, Yellow, or Green. The behavior (e.g., stopping or allowing cars to move) changes based on the current state. Instead of managing the logic for all states in a single class, we can represent each state as a separate class and transition between them dynamically.

#### Advantages
- Removes complex if-else or switch statements by encapsulating state behavior in separate classes.
- State-specific behavior is localized, making the code easier to manage and extend.
- Allows objects to change behavior dynamically at runtime.
- (Open/Close) You can add new states without modifying existing code.

### Interpreter
It is used to define the grammar of a language and provide an interpreter to evaluate and execute expressions in that language. It works well for scenarios where you have a set of rules or grammar and need a system to parse and process commands based on those rules.
- Compilers: Parsing programming languages and executing code.
- Expression Evaluators: Used in calculators or spreadsheets for evaluating formulas.
- Configuration Parsers: Reading and interpreting configuration files or scripts.

#### Real-World Example
Math Expression Evaluator: Think of a calculator that evaluates mathematical expressions like "5 + 3 - 2." The grammar defines the syntax (addition, subtraction), and the interpreter evaluates the result step by step.

#### Advantages
- (Extensibility) New grammar rules can be added without modifying existing code.
- Parsing and interpreting logic are separated, making the code cleaner.
- (Readability) The structure of the code mirrors the grammar of the language, improving readability.

### Iterator
The Iterator Pattern provides a way to access elements of a collection sequentially, without having to understand how the collection is implemented. This pattern decouples the iteration logic from the collection itself, making it easier to work with different types of collections in a uniform way.

#### Real-World Example
Think of a playlist of songs in a music player. You need to traverse through the playlist to play songs one by one, rewind, or skip. The Iterator Pattern enables this functionality without exposing how the playlist is stored internally (e.g., in an array, list, or database).

#### Advantages
- You can traverse different types of collections in the same way.
- (Encapsulation) Hides the internal details of the collection from the client.
- Allows different types of traversal methods (e.g., forward, backward, or custom).
- Removes the need to manually manage the traversal logic.

### Mediator
The Mediator Pattern introduces a mediator object to handle communication between a group of objects, so that objects don’t directly refer to each other. Instead, they interact with the mediator. This decouples objects and simplifies relationships, especially when there are many-to-many interactions.

#### Real-World Example
Imagine planes landing and taking off from an airport. Instead of communicating directly with each other to avoid collisions, planes communicate with the Air Traffic Control (ATC), which coordinates all their actions. The ATC acts as the mediator.

#### Advantages
- Objects no longer depend on each other directly, simplifying maintenance.
- The mediator provides a single point of control for managing interactions.
- (Modularity) Adding or removing colleagues becomes straightforward since they only interact with the mediator.
- Minimizes many-to-many relationships, reducing the potential for errors.

### Memento
The Memento Pattern saves the internal state of an object without violating encapsulation, allowing you to restore it later. This is especially useful when:
- You need to undo/redo operations.
- You want to preserve an object’s history.

#### Real-World Example
Consider a text editor. As you type or delete, it saves snapshots of your text. If you make a mistake, you can undo to a previous state.

#### Advantages
- (Encapsulation) The state is saved and restored without exposing the object's internals.
- Simplifies the implementation of undo/redo functionality.
- (Reusability) Useful across different applications like text editors, games, or workflows.

### Strategy
It allows you to define different algorithms or behaviors and choose one at runtime. It’s all about decoupling the logic (algorithm) from the object that uses it, making the code easier to extend and maintain.

#### Real-World Example
Imagine you’re implementing a payment system. Customers can choose to pay via Credit Card, PayPal, or UPI. Instead of hard coding all payment methods into a single class, you can define a strategy for each method and let customers pick the one they need dynamically.

#### Advantages
- You can easily switch algorithms or behaviors at runtime.
- (Open/Close) New strategies can be added without modifying the existing code.
- Separates the logic for different algorithms from the code that uses them.
- (Extensibility) The system remains flexible and easy to maintain.

### Template Method
This Pattern defines the structure of an algorithm but lets subclasses override specific steps without changing the overall algorithm’s structure.
It’s particularly useful when you want to enforce consistency across multiple subclasses but still need them to implement their own specific behaviors.

#### Real-World Example
Think about making a beverage (e.g., tea or coffee). The process (algorithm) typically involves:
- Boiling water.
- Brewing tea or coffee.
- Pouring it into a cup.
- Adding condiments (sugar, milk, etc.).
The steps of boiling water, pouring into a cup, and adding condiments are common, but the brewing step (e.g., steeping tea leaves vs. brewing coffee) differs. The Template Method Pattern captures this idea.

#### Advantages
- (Reusability) Common steps are implemented in the abstract class, reducing duplication.
- (Consistency) The overall structure of the algorithm is enforced, ensuring consistent behavior across all subclasses.
- (Extensibility) New subclasses can be added without modifying the abstract class.
- (Encapsulation) The template method encapsulates the algorithm, while subclasses focus only on specific steps.

### Visitor
The Visitor Pattern lets you define new operations on objects without changing the objects themselves. It does this by using a visitor object that encapsulates the operation, and each object in the structure "accepts" this visitor.
It’s especially useful when working with a complex object structure (like a collection of different types of objects) where you need to perform operations that vary based on the object type.

#### Real-World Example
Imagine an online shopping cart. Different items (like electronics and books) may have different discount rules or tax calculations. Using the Visitor Pattern, you can implement these operations without modifying the classes of the items themselves.

#### Advantages
- (Single Responsibility) Separates the algorithm from the objects it operates on, making both easier to manage.
- (Open/Close) You can add new operations (visitors) without modifying existing classes.
- (Flexibility) The same objects can be used with different visitors to perform various operations.