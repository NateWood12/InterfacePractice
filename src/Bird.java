public class Bird implements Animal{
    @Override
    public String makeSound() {
        System.out.println("Chirp");
        return "Chirp";
    }
    @Override
    public String move() {
        System.out.println("I am flying.");
        return "I am flying.";
    }
}
