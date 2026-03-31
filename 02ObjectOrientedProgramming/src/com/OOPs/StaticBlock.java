package com.OOPs;
class Games{
    static String message = "Transformers gaming";
    static int a,b;
    static {
        a = 10;
        b = 20;
        System.out.println("Welcome to game arena");
        System.out.println(message);
    }
    String GameName;
    int size;

    Games(String Game,double size){
//        System.out.println(message);
        System.out.println(Game + " & its size is " + size + " GB");
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        Games game = new Games("call of duty",2.5);
        Games game1 = new Games("Bgmi",3.5);
        Games game2 = new Games("Minecraft",2.8);
        Games game3 = new Games("mini militia",0.5);
        Games game4 = new Games("Shadow fight 2",1.5);
        /*
            Welcome to game arena
            Transformers gaming
            call of duty & its size is 2.5 GB
            Bgmi & its size is 3.5 GB
            Minecraft & its size is 2.8 GB
            mini militia & its size is 0.5 GB
            Shadow fight 2 & its size is 1.5 GB
         */
        //👉 Static block runs only once per class loading, not per object creation.
    }
}
/*
Inside JVM
===========
standard loader
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
🔹 standard Loader

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

