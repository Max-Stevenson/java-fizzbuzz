
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @BeforeEach
    public void init() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void multipleOfFifteen(){
        assertEquals(fizzBuzz.processNumber(15), ("FizzBuzz"));
    }

    @Test
    public void processInput() {
        assertEquals(fizzBuzz.processNumber(1), ("1"));
        assertEquals(fizzBuzz.processNumber(2), ("2"));
    }

    @Test
    public void multipleOfThree() {
        assertEquals(fizzBuzz.processNumber(3), ("Fizz"));
        assertEquals(fizzBuzz.processNumber(6), ("Fizz"));
    }

    @Test
    public void mulitpleOfFive() {
        assertEquals(fizzBuzz.processNumber(5), ("Buzz"));
        assertEquals(fizzBuzz.processNumber(10), ("Buzz"));
    }
}