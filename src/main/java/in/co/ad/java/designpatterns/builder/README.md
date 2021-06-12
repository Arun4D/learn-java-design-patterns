## Builder

### Introduction
When the complexity of creating object increases, the Builder pattern can separate out the instantiation process by using another object (a builder) to construct the object.

### Details
When we need lot of parameters needed to build object we can use Builder design pattern.
 
The main idea is to separate required fields from an optional and to move the construction logic out of the object class to a separate static inner class referred to as a builder class.
 
That Builder class has a constructor only for mandatory parameters and setter methods for all the optional parameters.
 
In addition, there is a build() method which glues everything together and returns immutable complete object. 
 
All the builder setter methods return the builder itself, so the invocations can be chained.

### When to Use
1. When the process involved in creating an object is extremely complex, with lots of mandatory and optional parameters
2. When an increase in the number of constructor parameters leads to a large list of constructors
3. When client expects different representations for the object that's constructed