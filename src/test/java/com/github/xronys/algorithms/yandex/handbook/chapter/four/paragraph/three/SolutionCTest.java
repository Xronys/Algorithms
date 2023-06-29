package com.github.xronys.algorithms.yandex.handbook.chapter.four.paragraph.three;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

@RunWith(DataProviderRunner.class)
public class SolutionCTest {
    @DataProvider
    public static Object[][] data() {
        return new Object[][]{
                {Arrays.asList(1, 2, 3),6 },
                {Arrays.asList(1, 2, 3, 5),30 },
                {Arrays.asList(-5, -4, 2, 3),60 },
                {Arrays.asList(-1, -2, -2),-4 },
                {Arrays.asList(-1, -3, -2, -4),-6 },
                {Arrays.asList(-1, 0, -3, -2, 0),0 },
                {Arrays.asList(-100_000, -100_000, -100_000),-1_000_000_000_000_000L },
                {Arrays.asList(-500, -200, -2, -4,0,1,50,100), 10000000 },

        };
    }

    @Test
    @UseDataProvider("data")
    public void solveTest( List<Integer> numbersList, long result){
        Assert.assertEquals(result, SolutionC.solve(numbersList));
    }
}
