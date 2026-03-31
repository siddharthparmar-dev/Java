package com.OOPs;
abstract class Aeroplane{
    public abstract void takeOff();
    public abstract void fly();
}
class CargoPlane extends Aeroplane{
    public void takeOff(){
        System.out.println("CargoPlane is taking off");
    }
    public void fly(){
        System.out.println("Cargoplane is flying");
    }
}
class FighterPlane extends Aeroplane{
    public void takeOff(){
        System.out.println("FighterPlane is taking off");
    }
    public void fly(){
        System.out.println("FighterPlane is flying");
    }
}
class CommercialPlane extends Aeroplane{
    public void takeOff(){
        System.out.println("CommercialPlane is taking off");
    }
    public void fly(){
        System.out.println("CommercialPlane is flying");
    }
}
class Airpot{
    public void permit(Aeroplane ap){
        ap.takeOff();
        ap.fly();
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        FighterPlane fp = new FighterPlane();
        CommercialPlane cmp = new CommercialPlane();
        Airpot a = new Airpot();
        a.permit(cp);

//        Aeroplane aero;
//        aero = cp;
//        aero.takeOff();;
//        aero.fly();
//
//        System.out.println("*******************************");
//
//        aero = fp;
//        aero.takeOff();;
//        aero.fly();

    }
}
