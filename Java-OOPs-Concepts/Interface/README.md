What is an Interface?

An interface in Java is a completely abstract class that contains only abstract methods (until Java 8).

From Java 8 onwards, interfaces can also have:

default methods

static methods

Key Points:

All methods in an interface are abstract by default.

A class uses the implements keyword to use an interface.

A class can implement multiple interfaces, supporting multiple inheritance.

Variables in an interface are public static final by default.

In Our Code:

Animal and Pet → two interfaces.

Dog → class that implements both interfaces.

sound(), eat(), play() → overridden methods.