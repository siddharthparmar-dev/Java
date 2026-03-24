package com.OOPs;
interface Sos
{
    default void disp()
    {
        System.out.println("interface");
    }
}
class abcd implements Sos{

}

public class DefaultMethodInterface {
    public static void main(String[] args) {
        Sos a = new abcd();
        a.disp();
    }
}
/*
// Java 8: Default Method in Interface

interface Telusko5 {

    // default method → body allowed inside interface
    // override karna optional hota hai
    default void course() {
        System.out.println("telusko learning");
    }
}

class AI implements Telusko5 {
    // agar override nahi karenge
    // to interface ka default method chalega

    // agar override karna ho to:
    // public void course() {
    //     System.out.println("AI course");
    // }
}

public class LaunchInterface2 {

    public static void main(String[] args) {

        // reference type = interface
        // object = implementing class
        Telusko5 t = new AI();

        // since AI ne override nahi kiya,
        // interface ka default method execute hoga
        t.course();
    }
}
*/
/*
Important Points:

1. Interface methods by default:
   - abstract (no body)
   - public

2. Java 8 ke baad:
   - default → body allowed
   - static  → body allowed

3. Default method:
   - override optional
   - runtime me class override kare to wahi chalega
*/



