import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicEightBallTest {

    MagicEightBall magicEightBall;

    @Before
    public void before() {
        magicEightBall = new MagicEightBall("Yes");
    }

    @Test
    public void hasAnswer() {
        assertEquals("Yes", magicEightBall.getAnswer());

    }

}