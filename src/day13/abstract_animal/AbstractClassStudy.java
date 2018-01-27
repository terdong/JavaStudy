package day13.abstract_animal;

import day13.abstract_animal.*;

public class AbstractClassStudy {

    public static void main(String [] args){

        Cat cat = new Cat();
        cat.cry();

        Dog dog = new Dog();
        dog.cry();
        dog.shakeTail();
        dog.getFur();
        dog.getMeat();

        Animal animal = dog;
        animal.cry();
        animal.eat();;

        Pet pet = dog;
        pet.shakeTail();

        Fur fur = dog;
        fur.getFur();

        Meat meat = dog;
        meat.getMeat();

        //Animal animal = new Animal();
    }
}
