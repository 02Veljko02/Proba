public class MetodOverride {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.sound();
//        Cat cat = new Cat();
//        cat.sound();

        Animal dog1 = new Dog();
        Animal macka = new Cat();
        ((Dog)dog1).eat();
        dog1.sound();
        ((Cat)macka).eat();
        feed(dog1);
        feed(macka);
    }
    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Narani kuce");
        } else if (animal instanceof Cat) {
            System.out.println("Narani macku");
        }
    }
}
