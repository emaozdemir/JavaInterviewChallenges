package lecture_notes.lecture6;

public class L01_Inheritance {
/*
# L6.1 - Inheritance
We Have talked a little bit about <i>inheritance</i> and <i>subclasses</i> so far, but not explained very much what they or how they work. In Java, a class can (instead of being created out of thin air) be derived from another class, it will then gain all of the variables and methods from that class. This is called <i>inheritance</i>, i.e. that one class inherits the traits of another.

Inheritance is one of the ways in which Java implements polymorphism, i.e. that one variable can belong to different data types. Polymorphism can be very useful in handling objects of different types. Inheritance lets the developer impose a certain element of flexibility to how the program handles variable types.

## Subclasses and superclasses
A class that inherits from another class is called a <i>subclass</i>. Conversely, the class that was inherited from is called a <i>superclass</i> or <i>parent class</i>. Suppose we have a class `Bird`, that defines a set of variables and methods that belong to `Bird`-type objects. We can now create a new class, called `Parrot`, and let it inherit from `Bird`. `Parrot` will then be a subclass to `Bird`, and `Bird` will be the superclass to `Parrot`.

Let's say `Bird` has two variables, `weight` and `colour`. It also has two methods; `MakeSound()` and `Fly()`. We don't need to bother about what these variables and methods do right now. When we create `Parrot` as a subclass to `Bird`, the `Parrot` class will inherit both the `weight` and `colour` variables, and the `MakeSound()` and `Fly()` methods. We don't need to type them out! Conveniently, it will also inherit the type. Any `Parrot` objects we create will be of type `Parrot`, but also of type `Bird`.

The only thing which is <b>not</b> inherited by a subclass is the superclass' constructor(s). Luckily, there's a keyword for accessing the superclass: `super`. More on that soon.

## Creating a subclass
Creating a subclass is very simple. As you define your new class, simply add on a statement `extends <Parent Class>` in the class declaration:
```
public class Parrot extends Bird {
    <code specific for the Parrot class>
}
```
Now, `Parrot` <i>extends</i> `Bird`, meaning that it inherits its traits from the superclass `Bird`. Suppose we wanted to add some special functionality to the `Parrot` class, then we can just add it as normal in its code block:
```
public class Parrot extends Bird {
    public void Talk() { };
}
```
In this case, all `Parrot` objects will have the method `Talk()`, and all of the methods from the `Bird` parent class (`MakeSound()` and `Fly()`). However, normal `Bird` objects will not have the `Talk()` method (only Parrots can talk, right?).

## Rules of inheritance
* A class can inherit one and only one parent class.
* The inherited fields can be used directly, just like any other fields.
* You can declare a field in the subclass with the same name as the one in the superclass, thus hiding it (not recommended).
* You can declare new fields in the subclass that are not in the superclass.
* The inherited methods can be used directly as they are.
* You can write a new instance method in the subclass that has the same signature as the one in the superclass, thus overriding it.
* You can write a new static method in the subclass that has the same signature as the one in the superclass, thus hiding it.
* You can declare new methods in the subclass that are not in the superclass.
* You can write a subclass constructor that invokes the constructor of the superclass, either implicitly or by using the keyword super.

 */

}
