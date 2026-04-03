package com.OOPs;
@FunctionalInterface
interface Alien{      // Functional Interface
    void disp();        // only Single Abstract Method
}
class planet implements Alien {
    public void disp(){
        System.out.println("Disp method");
    }
}
public class Lambda {
    public static void main(String[] args) {
      Alien alien1 = new Alien() {     //anonymous inner class // Direct implementation of interface
          @Override
          public void disp() {
              System.out.println("Anonymous inner class");
          }
      };
      alien1.disp();

        // ==========>>>>> Lambda Expression <<<<<<============
        Alien alien2  = () -> System.out.println("Hello from lambda 1");
        alien2.disp();

        Alien alien3 = () -> {
            System.out.println("Hello from lambda 2");
        };
        alien3.disp();

    }
}
