package com.github.xronys.algorithms.yandex.handbook.chapter.three.paragraph.one;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class SolutionBTest {
    @DataProvider
    public static Object[][] data() {
        return new Object[][]{
                {1, 1, 1},
                {2, 1, 2},
                {3, 1, 3},
                {4, 1, 4},
                {5, 1, 5},
                {6, 1, 6},
                {7, 1, 7},
                {2, 2, 1},
                {3, 2, 3},
                {4, 2, 6},
                {5, 2, 10},
                {6, 2, 15},
                {7, 2, 21},
                {3, 3, 1},
                {4, 3, 4},
                {5, 3, 10},
                {6, 3, 20},
                {7, 3, 35},
                {4, 4, 1},
                {5, 4, 5},
                {6, 4, 15},
                {7, 4, 35},
                {5, 5, 1},
                {6, 5, 6},
                {7, 5, 21},
                {6, 6, 1},
                {7, 6, 7},
                {7, 7, 1}
        };
    }

    @Test
    @UseDataProvider("data")
    public void solveTest(int n, int k, long result){
        Assert.assertEquals(result, SolutionB.solve(n, k));
    }
}
