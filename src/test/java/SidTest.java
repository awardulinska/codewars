import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Random;

public class SidTest {
    @Test
    public void lessThanSixPetals() {
        assertEquals(Sid.howMuchILoveYou(1), "I love you");
        assertEquals(Sid.howMuchILoveYou(2), "a little");
        assertEquals(Sid.howMuchILoveYou(6), "not at all");
    }
    @Test
    public void moreThanSixPetals() {
        assertEquals(Sid.howMuchILoveYou(7), "I love you");
        assertEquals(Sid.howMuchILoveYou(8), "a little");
        assertEquals(Sid.howMuchILoveYou(12), "not at all");
        assertEquals(Sid.howMuchILoveYou(13), "I love you");
        assertEquals(Sid.howMuchILoveYou(17), "madly");
    }
}