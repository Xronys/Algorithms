package com.github.xronys.algorithms.yandex.handbook.chapter.four.paragraph.three;

import com.github.xronys.algorithms.yandex.handbook.chapter.four.paragraph.two.SolutionB;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RunWith(DataProviderRunner.class)
public class SolutionATest {
    @DataProvider
    public static Object[][] data() {
        return new Object[][]{
                {Arrays.asList(1, 2, 3),6 },
                {Arrays.asList(0, 1),0 }
        };
    }

    @Test
    @UseDataProvider("data")
    public void solveTest( List<Integer> numbersList, long result){
        Assert.assertEquals(result, SolutionA.solve(numbersList));
    }
}
