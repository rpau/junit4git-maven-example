import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.sum(1, 1));
    }
}
