package lesson1602;

import org.junit.jupiter.api.Test;

import static java.time.Duration.*;
import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    Helper helper = new Helper();
    lesson1602.Test test = new lesson1602.Test();

    @Test
    public void arithmetic(){
        Exception exception = assertThrows(ArithmeticException.class, () ->
                test.m1("5", 0));
        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    void timeoutNotExceeded() {
        assertTimeout(ofSeconds(1), () -> {
            test.m1("5", 1);
        });
    }

//    void isString(){
//        test.m1("sdf",5);
//        assertEquals(true,a instanceof String);
//    }
    @Test
    void m1() {

    }
}