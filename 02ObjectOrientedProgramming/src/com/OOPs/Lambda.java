package com.OOPs;
@FunctionalInterface
interface  Alien1{      // Functional Interface
    void disp();        // only Single Abstract Method
}
class planet implements Alien1{
    public void disp(){
        System.out.println("Disp method");
    }
}
public class Lambda {
    public static void main(String[] args) {
//      Alien1 alien = new Alien1() {     //anonymous inner class // Direct implementation of interface
//          @Override
//          public void disp() {
//              System.out.println("Anonymous inner class");
//          }
//      };
//      alien.disp();

        // ==========>>>>> La,bda Expression
    }
}
