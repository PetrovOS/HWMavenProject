package school.redrover;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void testSum() {
        Assert.assertEquals(Main.getSum(1,1), 2);
        Assert.assertEquals(Main.getSum(0,0), 0);
        Assert.assertEquals(Main.getSum(-10,-5), -15);
        Assert.assertEquals(Main.getSum(-10,5), -5);
    }

    @Test
    public void testString() {
        Assert.assertEquals(Main.getString("Hello"),"HELLO");
        Assert.assertEquals(Main.getString("Good Bye"), "GOOD BYE");
        Assert.assertEquals(Main.getString("bye"), "BYE");
        Assert.assertEquals(Main.getString("How was your day"), "HOW WAS YOUR DAY");
    }

}
