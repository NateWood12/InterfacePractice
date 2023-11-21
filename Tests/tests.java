import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class tests {
    @Test
    public void testMakeSound(){
        Dog d1 = new Dog();
        assertEquals("Bark", d1.makeSound());
        Bird b1 = new Bird();
        assertEquals("Chirp", b1.makeSound());
    }
    @Test
    public void testMove(){
        Dog d1 = new Dog();
        assertEquals("I am running.", d1.move());
        Bird b1 = new Bird();
        assertEquals("I am flying.", b1.move());
    }
    @Test
    public void testMisbehave(){
        Dog d1 = new Dog();
        assertEquals("I chewed up your homework", d1.misbehave("homework"));
    }

}
