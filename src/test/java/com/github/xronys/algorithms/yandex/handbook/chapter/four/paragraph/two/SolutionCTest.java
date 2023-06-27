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
public class SolutionCTest {
    @DataProvider
    public static Object[][] data() {
        return new Object[][]{
                {"abc", "def", "adbecf"},
                {"abaca", "bdaef", "abbdaaceaf"},
                {"y", "z", "yz"},
        };
    }

    @Test
    @UseDataProvider("data")
    public void solveTest(String str1, String str2, String result){
        Assert.assertEquals(result, SolutionC.solve(str1,str2));
    }
}
