package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void TestOne() {
        System.out.println("First test");
        Assert.assertTrue(true);
    }
}
