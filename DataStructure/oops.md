🏗️ Foundation

Classes and Objects → blueprint vs instance

Constructors → default, parameterized, overloading

Instance vs Static Members → object-level vs class-level

Object Lifecycle & Garbage Collection

📦 Encapsulation

Access Modifiers → private, public, protected, default

Getters and Setters → controlling access

Immutable Classes → final fields, defensive copies

🧬 Inheritance

Basic Inheritance → extends keyword

Method Overriding → runtime polymorphism

super keyword → calling parent constructors/methods

Object Class methods (toString, equals, hashCode)

🎭 Polymorphism

Method Overloading → compile-time polymorphism

Method Overriding → runtime polymorphism

Upcasting & Downcasting

Dynamic Dispatch

🔍 Abstraction

Abstract Classes → partial abstraction

Interfaces → full abstraction

Interface enhancements (default, static, private methods from Java 8+)

Sealed Classes (Java 17+)

🔗 Class Relationships

Association → "uses-a"

Aggregation → "has-a" (weak ownership)

Composition → "has-a" (strong ownership)

⚡ Advanced OOP

Inner Classes → static, non-static, anonymous

Packages and Modularization

Enums with methods

Records (Java 14+)

Generics with OOP

🏛️ Design & Patterns

SOLID Principles

Composition over Inheritance

Common Design Patterns → Singleton, Factory, Observer, Strategy, Builder, Dependency Injection

# Object-Oriented Programming: C++ vs Java Structure

## 🏗️ Foundation

### Classes and Objects

**C++**

```cpp
class Car { // blueprint
private:
    string brand;
public:
    void drive() { /*...*/ }
};

Car myCar; // instance
Car* carPtr = new Car();
```

**Java**

```java
class Car { // blueprint
    private String brand;
    public void drive() { /*...*/ }
}

Car myCar = new Car(); // instance
```

### Constructors

**C++**

```cpp
class Student {
    string name;
    int age;
public:
    Student() { name = ""; age = 0; } // default
    Student(string n, int a) : name(n), age(a) {} // parameterized
    Student(string n) : name(n), age(0) {} // overloading
};
```

**Java**

```java
class Student {
    private String name;
    private int age;

    public Student() { this("", 0); } // default
    public Student(String name, int age) { // parameterized
        this.name = name;
        this.age = age;
    }
    public Student(String name) { this(name, 0); } // overloading
}
```

### Instance vs Static Members

**C++**

```cpp
class Counter {
public:
    int instanceCount; // per object
    static int totalCount; // class-level

    Counter() {
        instanceCount++;
        totalCount++;
    }
};
int Counter::totalCount = 0; // static definition
```

**Java**

```java
class Counter {
    public int instanceCount; // per object
    public static int totalCount; // class-level

    public Counter() {
        instanceCount++;
        totalCount++;
    }
}
```

### Object Lifecycle & Garbage Collection

**C++**

-   Manual memory management
-   Destructors: `~ClassName()`
-   RAII pattern
-   Smart pointers: `unique_ptr`, `shared_ptr`

**Java**

-   Automatic garbage collection
-   `finalize()` method (deprecated)
-   No destructors
-   GC manages memory automatically

## 📦 Encapsulation

### Access Modifiers

**C++**

```cpp
class Example {
private:    // class-only access
    int secret;
protected:  // class + derived classes
    int familySecret;
public:     // everywhere
    int openData;
}; // No package-private
```

**Java**

```java
class Example {
    private int secret;      // class-only
    protected int familySecret; // package + subclasses
    public int openData;     // everywhere
    int packagePrivate;      // package-only (default)
}
```

### Getters and Setters

**C++**

```cpp
class Person {
private:
    string name;
    int age;
public:
    string getName() const { return name; }
    void setName(const string& n) {
        if(!n.empty()) name = n;
    }
    int getAge() const { return age; }
    void setAge(int a) {
        if(a >= 0) age = a;
    }
};
```

**Java**

```java
class Person {
    private String name;
    private int age;

    public String getName() { return name; }
    public void setName(String name) {
        if(name != null && !name.isEmpty())
            this.name = name;
    }
    public int getAge() { return age; }
    public void setAge(int age) {
        if(age >= 0) this.age = age;
    }
}
```

### Immutable Classes

**C++**

```cpp
class ImmutablePoint {
private:
    const double x, y; // final fields
public:
    ImmutablePoint(double x, double y) : x(x), y(y) {}
    double getX() const { return x; }
    double getY() const { return y; }
};
```

**Java**

```java
public final class ImmutablePoint {
    private final double x, y; // final fields

    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Defensive copies for mutable objects
    public List<String> getTags() {
        return new ArrayList<>(tags); // defensive copy
    }
}
```

## 🧬 Inheritance

### Basic Inheritance

**C++**

```cpp
class Animal { // base class
public:
    void eat() { cout << "Eating..."; }
};

class Dog : public Animal { // derived class
public:
    void bark() { cout << "Barking..."; }
};
```

**Java**

```java
class Animal { // base class
    public void eat() { System.out.println("Eating..."); }
}

class Dog extends Animal { // derived class
    public void bark() { System.out.println("Barking..."); }
}
```

### Method Overriding

**C++**

```cpp
class Animal {
public:
    virtual void makeSound() { // virtual for polymorphism
        cout << "Animal sound";
    }
};

class Dog : public Animal {
public:
    void makeSound() override { // override keyword
        cout << "Woof!";
    }
};
```

**Java**

```java
class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
```

### super keyword

**C++**

```cpp
class Parent {
public:
    Parent(int x) { cout << "Parent: " << x; }
    void show() { cout << "Parent show"; }
};

class Child : public Parent {
public:
    Child(int x, int y) : Parent(x) { // calling parent constructor
        cout << "Child: " << y;
    }
    void show() {
        Parent::show(); // calling parent method
        cout << "Child show";
    }
};
```

**Java**

```java
class Parent {
    public Parent(int x) {
        System.out.println("Parent: " + x);
    }
    public void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    public Child(int x, int y) {
        super(x); // calling parent constructor
        System.out.println("Child: " + y);
    }

    public void show() {
        super.show(); // calling parent method
        System.out.println("Child show");
    }
}
```

### Object Class Methods

**C++** (No universal base class)

```cpp
class MyClass {
public:
    string toString() const { return "MyClass"; }
    bool operator==(const MyClass& other) const {
        return /* comparison logic */;
    }
};
```

**Java** (All classes inherit from Object)

```java
class MyClass {
    @Override
    public String toString() {
        return "MyClass";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyClass other = (MyClass) obj;
        return /* comparison logic */;
    }

    @Override
    public int hashCode() {
        return Objects.hash(/* fields */);
    }
}
```

## 🎭 Polymorphism

### Method Overloading

**C++**

```cpp
class Calculator {
public:
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; } // overloading
    int add(int a, int b, int c) { return a + b + c; }
};
```

**Java**

```java
class Calculator {
    public int add(int a, int b) { return a + b; }
    public double add(double a, double b) { return a + b; } // overloading
    public int add(int a, int b, int c) { return a + b + c; }
}
```

### Upcasting & Downcasting

**C++**

```cpp
Animal* animal = new Dog(); // upcasting (implicit)
Dog* dog = dynamic_cast<Dog*>(animal); // downcasting
if(dog) { // safe downcast
    dog->bark();
}
```

**Java**

```java
Animal animal = new Dog(); // upcasting (implicit)
if(animal instanceof Dog) { // safe check
    Dog dog = (Dog) animal; // downcasting
    dog.bark();
}
```

### Dynamic Dispatch

**C++**

```cpp
class Shape {
public:
    virtual void draw() { cout << "Drawing shape"; }
    virtual ~Shape() {} // virtual destructor for polymorphism
};

class Circle : public Shape {
public:
    void draw() override { cout << "Drawing circle"; }
};

Shape* shape = new Circle();
shape->draw(); // "Drawing circle" - dynamic dispatch
```

**Java**

```java
class Shape {
    public void draw() { System.out.println("Drawing shape"); }
}

class Circle extends Shape {
    @Override
    public void draw() { System.out.println("Drawing circle"); }
}

Shape shape = new Circle();
shape.draw(); // "Drawing circle" - dynamic dispatch
```

## 🔍 Abstraction

### Abstract Classes

**C++**

```cpp
class AbstractShape {
public:
    virtual void draw() = 0; // pure virtual function
    virtual ~AbstractShape() = default;
};

class Circle : public AbstractShape {
public:
    void draw() override { cout << "Drawing circle"; }
};
```

**Java**

```java
abstract class AbstractShape {
    public abstract void draw(); // abstract method

    public void commonMethod() { // concrete method
        System.out.println("Common functionality");
    }
}

class Circle extends AbstractShape {
    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
```

### Interfaces

**C++** (No native interfaces, use abstract classes)

```cpp
class Drawable { // interface-like abstract class
public:
    virtual void draw() = 0;
    virtual ~Drawable() = default;
};

class Clickable {
public:
    virtual void click() = 0;
    virtual ~Clickable() = default;
};

class Button : public Drawable, public Clickable { // multiple inheritance
public:
    void draw() override { /*...*/ }
    void click() override { /*...*/ }
};
```

**Java**

```java
interface Drawable {
    void draw(); // implicitly abstract
    default void defaultMethod() { // Java 8+
        System.out.println("Default implementation");
    }
    static void staticMethod() { // Java 8+
        System.out.println("Static method");
    }
}

interface Clickable {
    void click();
}

class Button implements Drawable, Clickable { // multiple interfaces
    @Override
    public void draw() { /*...*/ }
    @Override
    public void click() { /*...*/ }
}
```

### Sealed Classes

**C++** (No direct equivalent)

```cpp
// Can be simulated with final and friendship
```

**Java** (Java 17+)

```java
public sealed class Shape
    permits Circle, Rectangle, Triangle { // sealed class

    public abstract double area();
}

public final class Circle extends Shape { // must be final/sealed/non-sealed
    @Override
    public double area() { return Math.PI * radius * radius; }
}

public non-sealed class Rectangle extends Shape {
    @Override
    public double area() { return width * height; }
}
```

## 🔗 Class Relationships

### Association

**C++ & Java**

```java
class Professor { } // independent existence
class Course {
    private Professor professor; // uses-a relationship
}
```

### Aggregation

**C++ & Java**

```java
class Department {
    private List<Professor> professors; // weak ownership
    // professors can exist without department
}
```

### Composition

**C++ & Java**

```java
class House {
    private Room[] rooms; // strong ownership
    public House() {
        rooms = new Room[4]; // rooms created with house
        // rooms cannot exist without house
    }
}
```

## ⚡ Advanced OOP

### Inner Classes

**C++**

```cpp
class Outer {
private:
    int outerData;
public:
    class Inner { // static inner class
    public:
        void accessOuter(Outer& o) {
            cout << o.outerData; // needs Outer instance
        }
    };
};
```

**Java**

```java
class Outer {
    private int outerData;

    class Inner { // non-static inner class
        void accessOuter() {
            System.out.println(outerData); // direct access
        }
    }

    static class StaticInner { // static inner class
        void cannotAccessOuter() {
            // Cannot access outerData directly
        }
    }
}
```

### Packages and Modularization

**C++**

```cpp
// Namespaces instead of packages
namespace com::company::project {
    class MyClass { /*...*/ };
}

using namespace com::company::project;
```

**Java**

```java
package com.company.project; // package declaration

import java.util.List; // import other packages
```

### Enums with Methods

**C++**

```cpp
enum class Color { // scoped enum
    RED, GREEN, BLUE
};

// Can't add methods directly to enum in C++
```

**Java**

```java
enum Color {
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");

    private String hexCode;

    Color(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }
}
```

### Records

**C++** (No direct equivalent, use structs)

```cpp
struct Point { // similar to record
    double x, y;
    // auto-generated constructor, == operator, etc.
};
```

**Java** (Java 14+)

```java
public record Point(double x, double y) {
    // Auto-generated: constructor, getters, equals, hashCode, toString

    public double distance() { // custom method
        return Math.sqrt(x * x + y * y);
    }
}
```

### Generics with OOP

**C++** (Templates)

```cpp
template<typename T>
class Box {
private:
    T content;
public:
    Box(T content) : content(content) {}
    T getContent() { return content; }
};

Box<int> intBox(42);
Box<string> stringBox("Hello");
```

**Java**

```java
class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

Box<Integer> intBox = new Box<>(42);
Box<String> stringBox = new Box<>("Hello");
```

## 🏛️ Design & Patterns

### SOLID Principles

**Both Languages:**

-   **S**ingle Responsibility: One class, one reason to change
-   **O**pen/Closed: Open for extension, closed for modification
-   **L**iskov Substitution: Subtypes must be substitutable
-   **I**nterface Segregation: Many specific interfaces
-   **D**ependency Inversion: Depend on abstractions

### Composition over Inheritance

**C++ & Java**

```java
// Instead of inheritance:
// class Duck extends FlyingAbility, QuackingAbility

// Use composition:
class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }
}
```

### Common Design Patterns

**Singleton Pattern**
**C++**

```cpp
class Singleton {
private:
    static Singleton* instance;
    Singleton() {} // private constructor
public:
    static Singleton* getInstance() {
        if(!instance) instance = new Singleton();
        return instance;
    }
    // Delete copy constructor and assignment operator
    Singleton(const Singleton&) = delete;
    Singleton& operator=(const Singleton&) = delete;
};
```

**Java**

```java
class Singleton {
    private static Singleton instance;

    private Singleton() {} // private constructor

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

**Factory Pattern**
**C++**

```cpp
class ShapeFactory {
public:
    static Shape* createShape(const string& type) {
        if(type == "circle") return new Circle();
        if(type == "rectangle") return new Rectangle();
        return nullptr;
    }
};
```

**Java**

```java
class ShapeFactory {
    public static Shape createShape(String type) {
        switch(type) {
            case "circle": return new Circle();
            case "rectangle": return new Rectangle();
            default: throw new IllegalArgumentException();
        }
    }
}
```

**Observer Pattern**
**C++**

```cpp
class Observer {
public:
    virtual void update(const string& message) = 0;
};

class Subject {
private:
    vector<Observer*> observers;
public:
    void attach(Observer* obs) { observers.push_back(obs); }
    void notify(const string& message) {
        for(auto obs : observers) obs->update(message);
    }
};
```

**Java**

```java
interface Observer {
    void update(String message);
}

class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer obs) { observers.add(obs); }
    public void notifyObservers(String message) {
        for(Observer obs : observers) obs.update(message);
    }
}
```

This structure shows how OOP concepts are implemented in both C++ and Java, highlighting their similarities and differences in approach and syntax.
