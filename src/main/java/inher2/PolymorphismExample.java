package inher2;

public class PolymorphismExample {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
        animal = new Cat();
        animal.makeSound();
        //Cat cat = (Cat) new Animal();// java.lang.ClassCastException
        //cat.makeSound();
    }
}
