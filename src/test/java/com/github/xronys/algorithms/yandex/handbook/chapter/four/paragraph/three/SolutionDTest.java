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
public class SolutionDTest {
    @DataProvider
    public static Object[][] data() {
        return new Object[][]{
                {Arrays.asList(1, 2, 3, 4),24 },
                {Arrays.asList(-1, -2, 3, 4),24 },
                {Arrays.asList(-1, -3, -2, -4, -5),120 },
                {Arrays.asList(0, -1, 0, -3, -2, 100),0 },
                {Arrays.asList(1, 2, 3, 4, 5),120 },


        };
    }

    @Test
    @UseDataProvider("data")
    public void solveTest( List<Integer> numbersList, long result){
        Assert.assertEquals(result, SolutionD.solve(numbersList));
    }
}
