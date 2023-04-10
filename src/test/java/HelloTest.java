import org.junit.jupiter.api.Test;

class HelloTest {
    @Test
    public void test() {
        String greeting = "Hello World";
        String target = greeting.toUpperCase();

        assert(target.equals("HELLO WORLD"));
    }
}