package com.OOPs;
class Cars{
    private String Name;
    private int Model;

    void setName(String Name){
        this.Name = Name;        //this keyword contains the address of current object
    }

    String getName(){            //this ek reference variable hai jo current object ko point karta hai
        return Name;
    }

    void setModel(int Model){
        this.Model = Model;
    }

    int getModel(){
        return Model;
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Cars car = new Cars();
        car.setName("Mercedes");
        car.setModel(2006);

    }
}
