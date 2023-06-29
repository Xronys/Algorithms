package com.github.xronys.algorithms.yandex.handbook.chapter.five.paragraph.one;

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
                {3, 2},
                {139, 1},
                {91239, 6}
        };
    }

    @Test
    @UseDataProvider("data")
    public void solveTest(int n, long result){
        Assert.assertEquals(result, SolutionB.solve(n));
    }
}
