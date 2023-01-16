package learning;

import learning.BadDivisorExpection;
import learning.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CalculatorTest {
 public ExpectedException expectedException = ExpectedException.none();


    Calculator calculator;
@Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }


@Test
    public void multiplyTest() {

    long outcome = calculator.multiply(2, 2);
    Assert.assertEquals(4,outcome);
}
@Test
    public void testNegative(){

        long outcome = calculator.multiply(-1,2);
        Assert.assertEquals(2,outcome);

}
@Test
    public void testDivision(){

        int outcome = calculator.divide(2,1);
        Assert.assertEquals(2,outcome);

    }
    @Test(expected = BadDivisorExpection.class)
    public void testDivideBy0(){

        int outcome = calculator.divide(2,0);


    }
    @After
    public void tearDown() throws Exception {
        calculator = null;
    }

    @Test
    public void arrayMatch(){
    int[] arr1 = {1,4,5};
        int[] arr3 = {1,4,5};
        int[] arr2 = {5,1,4};

        assertArrayEquals("Arrays don't match", arr1,arr2);
    }

    @Test
    public void checkNull(){

    assertNotNull("Get Name is null", calculator.getName());
    }

    @Test
    public void assertTrueFalse(){
    assertFalse(2<1);
    }

    @Test
    public void testRule() {

        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("/ by zero");
        System.out.println(2/0);
        expectedException.expect(NumberFormatException.class);
        Integer.parseInt("23s");
    }
}
