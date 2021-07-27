import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    @RetryCountIfFailed(10)
    public void test2() {
        Assert.assertEquals(false, true);
    }
}
