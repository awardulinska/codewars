import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void factorialCountIsTrue() throws Exception {

        int expectedResult = 720;
        assertEquals(expectedResult, Factorial.factorialCount(6));
    }

}