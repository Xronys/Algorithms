package com.github.xronys.algorithms.yandex2_0.exercise1;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(DataProviderRunner.class)
public class SolutionETest {
    SolutionE solutionE = new SolutionE(5);

@DataProvider
public static Object[][] data() {
    return new Object[][]{
            {0,5,0},
            {5,0,0},
            {1,1,0},
            {2,2,0},
            {2,3,0},
            {1,4,0},
            {-1,0,1},
            {-1,3,3},
            {3,-1,2},
            {4,3,2}
        };
    }

    @Test
    @UseDataProvider("data")
    public void solveTest(int xX,int yX, int result){
        Assert.assertEquals(result, solutionE.solve(xX,yX));
    }

}
