package day12.interface_study;

public class InterfaceStudy {

    static void runMethodsByPet(Pet pet) {
        pet.bark();
        pet.eat();
    }

    static void runMethods(Animal animal) {
        animal.printInfo();
        animal.shakeTail();
    }

    public static void main(String[] args) {

        Cat cat = new Cat();

        // 굳이 PolymorphismStudy1.runMethods 로 호출 하지 않아도
        // 같은 PolymorphismStudy1 클래스 안에 정의된 static 메소드는
        // 메소드 이름만으로 호출 가능합니다.
        runMethods(cat);
        runMethodsByPet(cat);

        System.out.println();

        Animal animal = cat;
        runMethods(animal);

        System.out.println();

        Dog dog = new Dog();
        runMethods(dog);
        runMethodsByPet(dog);

        System.out.println();

        animal = dog;
        runMethods(animal);

        // 둘 중에 서로 상속 받은 클래스가 없기 때문에 서로 대입이 안된다.
        //dog = cat;
        //cat = dog;
    }
}
