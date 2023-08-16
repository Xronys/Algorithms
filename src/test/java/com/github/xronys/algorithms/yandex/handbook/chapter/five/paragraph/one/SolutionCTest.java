package com.github.xronys.algorithms.yandex.handbook.chapter.five.paragraph.one;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class SolutionCTest {
    @DataProvider
    public static Object[][] data() {
        return new Object[][]{
                {1, 239, 1},
                {115, 1000, 885},
                {2816213588L, 239, 151}
        };
    }

    @Test
    @UseDataProvider("data")
    public void solveTest(long n, int m, long result){
        Assert.assertEquals(result, SolutionC.solve(n,m));
    }
}
