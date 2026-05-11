package com.Enums_Annotations;
/*
==> What is Annotation?
Annotation is basically:
special metadata / extra information
given to: class method variable constructor etc.
 */
class Animal{
    public void animalUsuallyhuntsAndEats(){
        System.out.println("Animal USually Hunt and Eats");
    }
}
class Tiger extends Animal{
    @Override
    public void animalUsuallyHuntsAndEats() {
        System.out.println("Tiger USually Hunt and Eats");
    }
}
public class LaunchAnnotation {
    public static void main(String[] args) {
        Animal animal = new Tiger();
        animal.animalUsuallyhuntsAndEats();

        /*
            Java checks:
            "Are you REALLY overriding?"
            If not:
            ✅ compile-time error.
            Very useful.
         */
    }
}
