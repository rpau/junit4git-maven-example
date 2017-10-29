import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import rpau.smartesting.junit4.SmartTestRunner;

@RunWith(SmartTestRunner.class)
public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.sum(1, 1));
    }
}
