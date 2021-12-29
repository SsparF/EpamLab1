package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {
    @Test
    public void TestTwo() {
        System.out.println("First test");
        Assert.assertTrue(true);
    }
}
