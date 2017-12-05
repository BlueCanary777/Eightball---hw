import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestEightballList {

    EightballListExample eightballListExample;

    @Before
    public void before() {
        eightballListExample = new EightballListExample();
    }

    @Test
    public void hasNumberOfEntries() {
        assertEquals(0, eightballListExample.numberOfEntries());
    }

    @Test
    public void canAddString() {
        eightballListExample.addOption("yes");
        assertEquals(1, eightballListExample.numberOfEntries());
    }

    @Test
    public void canRandomAnswer() {
        eightballListExample.addOption("yes");
        eightballListExample.addOption("no");
        eightballListExample.addOption("maybe");
        System.out.println(eightballListExample.randomAnswer());
        assertNotNull(eightballListExample.randomAnswer());

    }
}
