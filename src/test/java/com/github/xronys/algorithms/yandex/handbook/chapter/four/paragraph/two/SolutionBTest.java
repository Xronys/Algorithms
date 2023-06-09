package com.github.xronys.algorithms.yandex.handbook.chapter.four.paragraph.two;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;

@RunWith(DataProviderRunner.class)
public class SolutionBTest {
    @DataProvider
    public static Object[][] data() {
        return new Object[][]{
                {3,"1 2 3 4",2, "1 0 0", Arrays.asList(1, 3, 3, 4)}
        };
    }

    @Test
    @UseDataProvider("data")
    public void solveTest(int polynomialASize, String[] polynomialA, int polynomialBSize, String[] polynomialB, ArrayList<Integer> result){
        Assert.assertEquals(result, SolutionB.solve(polynomialASize, polynomialA, polynomialBSize, polynomialB));
    }
}
