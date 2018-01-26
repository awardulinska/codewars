import org.junit.Test;
import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class NumberExpandedFormTest {
    @Test
    public void testSomething() {
        assertEquals("70000 + 300 + 4", NumberExpandedForm.expandedForm(70304));
        assertEquals("10 + 2", NumberExpandedForm.expandedForm(12));
        assertEquals("40 + 2", NumberExpandedForm.expandedForm(42));
        assertEquals("10000 + 5000 + 200 + 30 + 6", NumberExpandedForm.expandedForm(15236));
        assertEquals("700 + 30", NumberExpandedForm.expandedForm(730));
        assertEquals("80000", NumberExpandedForm.expandedForm(80000));

    }
}