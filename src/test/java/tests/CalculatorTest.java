package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CalculatorPage;
import utils.Constants;

public class CalculatorTest extends BaseTest {

    @BeforeMethod
    public void start() {
        setup();
    }

    @Test
    public void testAddition() {
        CalculatorPage page = new CalculatorPage(driver);
        page.addNumbers();
        String actual = page.getResult();
        Assert.assertEquals(actual, Constants.EXPECTED_RESULT, "Addition result mismatch");
        System.out.println("Test case passed: 9 + 6 = " + actual);
    }

    @AfterMethod
    public void end() {
        tearDown();
    }
}
