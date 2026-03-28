package com.OOPs;
class Games{
    static {
        System.out.println("Welcome to game arena");
    }
    static String message = "hello";
    String GameName;
    int size;

    Games(String Game,double size){
        System.out.println(Game + " & its size is " + size + " GB");
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        Games game = new Games("call of duty",2.5);
    }
}
/*
Inside JVM
===========
Class loader
Runtime data areas
Execution engine

=====> CLASS LOADER
loading || linking || intialization

======> Runtime data areas
method area || Stack area || heap area || pc register || native method stack

======> execution engine
Interpreter || JIT || Garbage collector

//////////////////////////// In Detail ////////////////////////////////////

🧠 Inside JVM (One-liners)
🔹 Class Loader

👉 Loads .class files into memory.

🔹 Loading

👉 Brings class bytecode into JVM memory.

🔹 Linking

👉 Verifies, prepares, and resolves class dependencies.

🔹 Initialization

👉 Executes static variables & static blocks.

🧩 Runtime Data Areas
🔹 Method Area

👉 Stores class-level data (static variables, methods, metadata).

🔹 Stack Area

👉 Stores method calls and local variables (per thread).

🔹 Heap Area

👉 Stores objects and instance variables.

🔹 PC Register

👉 Keeps track of current executing instruction.

🔹 Native Method Stack

👉 Handles native (non-Java) method execution.

⚙️ Execution Engine
🔹 Interpreter

👉 Executes bytecode line by line (slow but immediate).

🔹 JIT (Just-In-Time Compiler)

👉 Converts bytecode to machine code for faster execution.

🔹 Garbage Collector

👉 Automatically deletes unused objects from heap memory.
 */

