package com.github.xronys.algorithms.yandex.training.v2.exercise4;

import com.github.xronys.algorithms.yandex.training.v2.exercise4.SolutionA;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.nio.charset.StandardCharsets;

@RunWith(DataProviderRunner.class)
public class solutionATest {
    SolutionA solutionA = new SolutionA();


    @DataProvider
    public static Object[][] data() {
            return new Object[][] {
                    {3, "Fizz"},
                    {5, "Buzz"},
                    {15, "FizzBuzz"},
            };
    }

  /*  @Test
    @UseDataProvider("data")
    public void fizzBuzzTestTest(int value, String result) {
        System.out.println(value);
        String str = new String(solutionA.fizzBuzzTest(value),StandardCharsets.UTF_8);
        Assert.assertEquals(result,str);
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void zero() {
        solutionA.fizzBuzzTest(0);
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void notMultiplyThreeAndFife() {
        solutionA.fizzBuzzTest(11);
    }
*/
}
