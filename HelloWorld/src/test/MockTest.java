import org.junit.Assert;
import org.junit.Test;

public class MockTest {
    @Test
    public void name() throws Exception {
        Assert.assertTrue(true);
    }
    @Test
    public void name1() throws Exception {
        org.junit.Assert.assertTrue(true);
    }
}
