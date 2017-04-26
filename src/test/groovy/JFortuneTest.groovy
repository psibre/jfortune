import org.junit.*

class JFortuneTest {

    @Test
    void testLoadFortunes() {
        JFortune jfortune = new JFortune()
        try {
            jfortune.loadFortunes("/testFortunes.json")
        } catch (all) {
            e.printStackTrace()
        }
    }

    @Test
    void testGetFortune() {
        JFortune jfortune = new JFortune()
        try {
            jfortune.loadFortunes("/testFortunes.json")
        } catch (all) {
            e.printStackTrace()
        }
        def expected = "42"
        def actual = jfortune.fortune
        assert expected == actual
    }
}
