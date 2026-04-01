package com.OOPs;
//class A{
//    void disp(){
//        System.out.println("Stranger things");
//    }
//}
//class B{
//   A a = new A();    ===> tightly coupled
//   void show(){
//       a.disp();
//   }
//}

//class A{
//    void disp(){
//        System.out.println("Stranger things");
//    }
//}
//class B extends A{    // tightly coupled
//    @Override
//    void disp() {
//        super.disp();
//    }
//}
public class LooseCoupling {
    public static void main(String[] args) {
//        SystemDesign sd = new SystemDesign();

        Courses courses = new Courses(new SystemDesign());
        courses.buyTheCourse();
    }
}
