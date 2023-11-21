public class Dog implements Animal,Devilish{
    @Override
    public String makeSound() {
        System.out.println("Bark");
        return "Bark";
    }
    @Override
    public String move() {
        System.out.println("I am running.");
        return "I am running.";
    }
    @Override
    public String misbehave(String a) {
        return "I chewed up your " + a;
    }
}
