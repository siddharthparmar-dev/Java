package com.ExceptionHandling;
class printIt
{
    public void course(){
        course();
    }
}
public class EH1 {
    public static void main(String[] args) {
        printIt prt = new printIt();
        // Compile time
        // Run time
        // Exception
        prt.course();
    }
}

/*
=========================================
   COMPILE-TIME vs RUN-TIME EXCEPTION
=========================================

1) Compile-Time Exception (Checked Exception)
---------------------------------------------
- Compilation ke time detect hoti hai
- Handle karna compulsory hota hai
- try-catch ya throws lagana padta hai
*/

//import java.io.FileReader;
//import java.io.FileNotFoundException;
//
//public class CompileTimeExample {
//
//    public static void main(String[] args) {
//
//        try {
//            // FileReader may throw FileNotFoundException
//            FileReader file = new FileReader("abc.txt");
//
//        } catch (FileNotFoundException e) {
//            // Compiler force karta hai handle karne ke liye
//            System.out.println("File not found (Checked Exception handled)");
//        }
//    }
//}


/*
Common Checked Exceptions:
- IOException
- FileNotFoundException
- SQLException
- ClassNotFoundException
*/


/*
2) Run-Time Exception (Unchecked Exception)
-------------------------------------------
- Execution ke time detect hoti hai
- Handle karna compulsory nahi hota
- Mostly logical mistakes ki wajah se hoti hai
- RuntimeException class ke andar aati hai
*/

//public class RuntimeExample {
//
//    public static void main(String[] args) {
//
//        // Example 1: ArithmeticException
//        int a = 10;
//        int b = 0;
//
//        // This will throw ArithmeticException at runtime
//        int result = a / b;
//
//        System.out.println(result);
//
//
//        // Example 2: ArrayIndexOutOfBoundsException
//        int[] arr = {1, 2, 3};
//
//        // Runtime error (invalid index)
//        System.out.println(arr[5]);
//    }
//}


/*
Common Unchecked Exceptions:
- ArithmeticException
- NullPointerException
- ArrayIndexOutOfBoundsException
- InputMismatchException
*/


/*
Exception Hierarchy (Important for Exams)

Throwable
   |
   --> Exception
           |
           --> RuntimeException  (Unchecked)
           |
           --> Other Exceptions  (Checked)

Rule:
- RuntimeException and its subclasses = Unchecked
- Baaki Exception classes = Checked
*/
/*
Step 1: Naam dekho
💥 Logical mistake wali exceptions usually Unchecked hoti hain:

ArithmeticException

NullPointerException

ArrayIndexOutOfBoundsException

Ye sab tumhari coding mistake se hoti hain
Isliye compiler bolta hai:

"Tu khud dekh le, main nahi rokunga"

➡️ Unchecked

🌍 External resource wali exceptions usually Checked hoti hain:

IOException

FileNotFoundException

SQLException

Ye uncertain cheezein hain (file mile ya na mile)
Isliye compiler bolta hai:

"Handle karo pehle!"

➡️ Checked
 */