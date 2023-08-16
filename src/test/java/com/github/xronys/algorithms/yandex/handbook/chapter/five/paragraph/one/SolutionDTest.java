package com.github.xronys.algorithms.yandex.handbook.chapter.five.paragraph.one;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class SolutionDTest {
    @DataProvider
    public static Object[][] data() {
        return new Object[][]{
                {0, 0 },
                {1, 1},
                {2, 2},
                {3, 4},
                {4, 7},
                {5, 2},
                {6, 0},
                {7, 3},
                {8,  4},
                {9,  8},
                {10,  3},
                {11,  2},
                {12,  6},
                {13,  9},
                {14,  6},
                {15,  6},
                {16,  3},
                {17,  0},
                {18,  4},
                {19,  5},
                {20,  0},
                {21,  6},
                {22,  7},
                {23,  4},
                {24,  2},
                {25,  7},
                {26,  0},
                {27,  8},
                {28,  9},
                {29,  8},
                {30,  8},
                {31,  7},
                {32,  6},
                {33,  4},
                {100, 5 },
        };
    }

    @Test
    @UseDataProvider("data")
    public void solveTest(long n, long result){
        Assert.assertEquals(result, SolutionD.solve(n));
    }
}
