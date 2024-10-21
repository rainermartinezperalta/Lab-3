Pizza Factory

Description

This project demonstrates a pizza factory using the Factory Design Pattern in Java. The pizza store can create and process different types of pizzas (Cheese, Greek, Peperoni, and Gluten-Free) by using a factory. Each pizza goes through steps like `prepare()`, `bake()`, `cut()`, and `box()`.

The system follows the **Liskov Substitution Principle (LSP)**, meaning any subclass of `Pizza` (like `CheesePizza` or `GreekPizza`) can be used in the same way without breaking the program.

Requirements

- Java 8 or higher
- Maven
- JUnit4

How to Build and Run

Clone the repository:

git clone https://github.com/rainermartinezperalta/Lab-3.git
cd Lab-3

Build the project:

mvn clean install

Run the main application:

mvn exec:java -Dexec.mainClass="Main"

Run unit tests:

mvn test

What’s Included

- Pizza.java: The abstract class defining the basic structure for all pizzas.
- CheesePizza.java, GreekPizza.java, PeperoniPizza.java, GlutenFreePizza.java: Specific pizza classes that extend `Pizza` and implement `prepare()`.
- PizzaFactory.java: Interface for creating pizzas.
- ConcretePizzaFactory.java: The actual factory that creates pizzas based on input.
- PizzaStore.java: Handles pizza orders and processes them using the factory.
- Main.java: Demonstrates how pizzas are ordered and processed.
- PizzaStoreTest.java: JUnit tests to ensure the factory and pizza processes work correctly.

Liskov Substitution Principle (LSP)

LSP is used here by allowing all pizza subclasses (like `CheesePizza` or `GreekPizza`) to be processed in the same way by the `PizzaStore`. The store doesn't need to know the specific pizza type, only that it's a `Pizza`.

Author

Rainer Martinez-Peralta
