## Abstract Factory and Factory Method

### Introduction
Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

### Details

This pattern delegates the responsibility of initializing a class from the client to a particular factory class by creating a type of virtual constructor.

<b>Factory Method :</b> 
Define an interface for creating an object, but let subclasses decide which class to instantiate. factory method lets a class defer instantiation to subclasses.

<b>Abstract Factory : </b> 

provide an interface for creating families of related or dependent objects without specifying their concrete classes


<img width="964" alt="Abstract Factory" src="https://github.com/arun4d/learn-java-design-patterns/blob/main/images/updated_abstract_factory.jpg">



### When to Use Abstact Factory
1. The client is independent of how we create and compose the objects in the system
2. The system consists of multiple families of objects, and these families are designed to be used together
3. We need a run-time value to construct a particular dependency
