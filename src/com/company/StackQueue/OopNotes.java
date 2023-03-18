package com.company.StackQueue;

public class OopNotes {

    //When you compile your program the reference variable of the base class gets memory and compiler checks all the methods in that class. So it checks all the base class methods but not the child class methods. Now at runtime when the object is created, only checked methods can run. In case a method is overridden in the child class that function runs. Child class other functions aren't run because the compiler hasn't recognized them at the compile time.


    // THE PARENT CLASS IS USED TO KNOW THE TYPE OF THE METHODS AND THE OBJECT FOR ITS IMPLEMENTATION
    CustomStack stack1 = new DynamicStack();

    //If you assign parent type to a subclass it means that you agree with to use the common features of the parent class.
    //
    //It gives you the freedom to abstract from different subclass implementations. As a result limits you with the parent features.


    //Compile-time refers to the phase of software development when source code is translated into executable code. In this phase, the code is checked for syntax errors and other issues that prevent it from running properly. If there are no errors, the code is transformed into an executable format that can be run on a computer.
    //
    //Runtime refers to the phase of software execution when the program is actually running and executing the instructions contained in the compiled code. During runtime, memory is dynamically allocated and deallocated as needed, objects are created and destroyed, and program logic is executed.
    //
    //In other words, compile-time is the time when the code is being prepared to run, while runtime is the time when the code is actually running and performing its intended tasks.
    //
    //
    //
    //
    //Dump Mails
    //  * how does method overloading happen at runtime
    //Method overloading in Java occurs at compile-time, not at runtime. Method overloading allows a class to have multiple methods with the same name, but with different parameters. The Java compiler selects the correct method to call based on the number and type of arguments passed to the method at compile-time.
    //
    //When a method is called in Java, the compiler looks at the number and type of arguments passed to the method and matches them to the method signature of the overloaded methods with the same name. If a match is found, the corresponding method is called. If there are multiple methods with the same name but different parameters, the compiler selects the method with the best match.
    //
    //So, method overloading in Java happens at compile-time because the selection of the correct method to call is made by the compiler based on the number and type of arguments, before the code is executed at runtime.
    //
    //
    //
    //
    //Dump Mails
    // * what all information is available at the compile time ?
    //At compile-time, the Java compiler has access to the following information:
    //
    //Source code: The Java compiler compiles the source code written in .java files into executable .class files.
    //
    //Class and interface declarations: The compiler has access to all class and interface declarations, including their methods, variables, and constructors.
    //
    //Method signatures: The compiler has access to the signatures of all methods defined in the source code, including their return type, name, and parameters.
    //
    //Type information: The compiler has access to the type information of variables, including their type and the type of objects they reference.
    //
    //Annotation information: The compiler has access to the annotations applied to classes, methods, and variables, if any.
    //
    //Import statements: The compiler has access to all import statements and uses them to resolve any type references that are not fully qualified in the source code.
    //
    //Using this information, the compiler performs several tasks, such as checking the syntax of the source code, validating type references, and generating bytecode. By having access to this information, the compiler can detect errors in the source code and generate an error message, or produce the executable .class files if the code is error-free.

}
