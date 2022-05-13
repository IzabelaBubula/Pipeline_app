import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void sumTest(){
        float a = 2;
        float b = 3;
        var sum = Main.sum(a,b);
        Assert.assertEquals(5, sum, 2);
    }
}
