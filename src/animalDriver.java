public class animalDriver {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Bird();
        a1.move();
        a1.makeSound();
        a2.move();
        a2.makeSound();
        String homework = "homework";
        ((Devilish)a1).misbehave(homework);
        System.out.println(homework);
    }
}
