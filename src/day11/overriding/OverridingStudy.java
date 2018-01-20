package day11.overriding;

public class OverridingStudy {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.shakeTail();

        Dog dog = new Dog("루시",2,4);
        dog.shakeTail();

        Animal animal = new Animal();
        animal.shakeTail();

    }
}
