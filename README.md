# Java8-Version-Features
This project contains all Java 8 features implementation .

Java 8 was released on 18th March 2014, so it’s high time to look into Java 8 Features. In this tutorial, we will look into Java 8 features with examples. 

•	Java 8 Features 
1.	Lambda expressions: Shortcut way of writing methods, but they don’t need any method name and they can be implemented right in the body of a method.
2.	Method references: We can refer method by using class::methodName type syntax.
3.	Functional interfaces: Interface contains one abstract method. SAM
4.	Stream API:  A stream is sequences of objects that supports various methods which can be pipelined to produce the desired result. A stream does not store data and, in that sense, is not a data structure. It also never modifies the underlying data source.
5.	Default methods: Default method defined in Interface with key word “default”, enables define some common features to implemented class or Interfaces. This capability is added for backward compatibility so that old interfaces can be used to leverage the lambda expression capability of Java 8 . for e.g., forEach method in Collection and List 
6.	Static methods in interface: In addition to default methods, you can define static methods in interfaces. (A static method is a method that is associated with the class in which it is defined rather than with any object. Every instance of the class shares its static methods.) This makes it easier for you to organize helper methods in your libraries; you can keep static methods specific to an interface in the same interface rather than in a separate class 
7.	Optional class: Java introduced a new class Optional in Java 8. It is a public final class which is used to deal with NullPointerException in Java application. We must import java.util package to use this class. It provides methods to check the presence of value for particular variable.
8.	Collectors class: Collectors is a final class that extends Object class. It provides reduction operations, such as accumulating elements into collections, summarizing elements according to various criteria etc.
9.	ForEach() method: Java 8  provides a new method forEach() to iterate the elements. It is defined in Iterable and Stream interfaces.
10.	Parallel array sorting : Java 8 introduces new method parailelSort() in the java.util.Arrays , which support the parallel sorting of array elements. Ascending order.
11.	Type and Repeating Annotations: Introduce Repeating annotation using @Repeatable 
12.	Concurrency Enhancements: New enhancements towards Concurrent package .Two new Interfaces and 4 new classes introduces in this package.
13.	JDBC Enhancements etc.
14.	Base64 Encode Decode
15.	Nashorn JavaScript Engine
16.	IO Enhancements,


