package com.ExceptionHandling;

public class EH2 {
    public static void main(String[] args) {
        System.out.println("Hello 1");
        try {
        Thread.sleep(5000);   //Thread.sleep() ek checked exception throw karta ha
        }
        catch (InterruptedException exception){
            System.out.println("Something happened");
        }
        System.out.println("Hello 2");
        /*
            ⚠️ Checked Exception kya hota hai?

            👉 Java bolta hai:

            “Isko handle karna compulsory hai warna compile hi nahi hone dunga”

            So agar tum try-catch na lagao:

            ❌ Compile-time error aa jayega

            👉 Exceptions 2 types ke hote hain:
            ✅ Checked Exception

            👉 Compiler force karta hai handle karne ke liye

            ✅ Unchecked Exception

            👉 Compiler ignore karta hai (optional handling)

            ===========================================================

            ⚔️ Difference (Most Important Table)
            Feature	                 Checked Exception	        Unchecked Exception
            Check kab hota hai	     Compile time	            Runtime
            Handle karna mandatory?	 ✅ Yes                	    ❌ No
            Parent class	          Exception	                RuntimeException
            Example	              IOException, SQLException	    ArithmeticException, NullPointerException
            Code compile hoga?	  ❌ Without handling nahi	    ✅ Ho jayega
         */
    }
}
