package com.github.xronys.algorithms.yandex.handbook.chapter.eight.paragraph.two;


import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class SolutionATest {
    public static int [] moneyArray;
    @DataProvider
    public static Object[][] data() {
        return new Object[][]{
                {1, 1},
                {2, 2},
                {3, 1},
                {4, 1},
                {5 ,2},
                {6 ,2},
                {7 ,2},
                {8 ,2},
                {9 ,3},
                {10 ,3},
                {11,3},
                {12 ,3},
                {13 ,4},
                {14 ,4},
                {15 ,4},
                {16 ,4},
                {17 ,5},
                {18 ,5},
                {20 ,5},
                {34 ,9},
        };
    }

    @Test
    @UseDataProvider("data")
    public void solve(int n, long result){
        moneyArray = new int[n];
        Assert.assertEquals(result, SolutionA.solve(n));
    }
}
