package com.BridgeLabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAnalyserTests {
    @Test
    public void GivenThreeIntegers_findMaximumAt_firstPosition() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Integer maximumNumber = maximumAnalyser.FindMaximum(67 ,22, 30);
        Assert.assertEquals((Integer) 67 , maximumNumber);
    }
    @Test
    public void GivenThreeIntegers_findMaximumAt_secondPosition() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Integer maximumNumber = maximumAnalyser.FindMaximum(22 ,67, 30);
        Assert.assertEquals((Integer) 67 , maximumNumber);
    }
    @Test
    public void GivenThreeIntegers_findMaximumAt_thirdPosition() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Integer maximumNumber = maximumAnalyser.FindMaximum(30 ,22, 67);
        Assert.assertEquals((Integer) 67 , maximumNumber);
    }

}
