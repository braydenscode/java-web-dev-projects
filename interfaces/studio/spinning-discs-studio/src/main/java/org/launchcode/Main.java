package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}

//Studio Answers
    //Part Three: More Debugger Debugging
//1. Use a watch expression to keep track of a specific piece of data in your code.
//2. I don't think so because a conditional breakpoint only adds a breakout if a condition is met, when here we want to add the breakpoint regardless.
//3. It shows you where you are at in your code in the process of debugging (method:line, file (package))
//4. dvd.aName is only used as an argument in the dvd constructor, therefore it doesn't actually exist and the output (No such instance field: 'aName') makes sense.