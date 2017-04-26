import org.junit.*;

public class JFortuneTest {

    @Test
    public void testGetFortune() {
        JFortune jfortune = new JFortune();
        String expected = "42";
        String actual = jfortune.getFortune();
        Assert.assertEquals(expected, actual);
    }
}