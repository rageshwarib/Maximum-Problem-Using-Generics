package com.BridgeLabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAnalyserTests {
    @Test
    public void GivenThreeIntegers_findMaximumAtfirstPosition_shuldReturnSameNumber() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Integer maximumNumber = maximumAnalyser.FindMaximum(67,22, 30);
        Assert.assertEquals((Integer) 67 , maximumNumber);
    }
    @Test
    public void GivenThreeIntegers_findMaximumAt_secondPosition_shuldReturnSameNumber() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Integer maximumNumber = maximumAnalyser.FindMaximum(22 ,67, 30);
        Assert.assertEquals((Integer) 67 , maximumNumber);
    }
    @Test
    public void GivenThreeIntegers_findMaximumAt_thirdPosition_shuldReturnSameNumber() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Integer maximumNumber = maximumAnalyser.FindMaximum(30 ,22, 67);
        Assert.assertEquals((Integer) 67 , maximumNumber);
    }

    @Test
    public void GivenThreeFloat_findMaximumAt_firstPosition_shuldReturnSameNumber() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Float maximumNumber = maximumAnalyser.FindMaximum(67.25f,22.25f, 30.65f);
        Assert.assertEquals((Float) 67.25f , maximumNumber);
    }
    @Test
    public void GivenThreeFloat_findMaximumAt_secondPosition_shuldReturnSameNumber() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Float maximumNumber = maximumAnalyser.FindMaximum(22.25f ,67.25f, 30.65f);
        Assert.assertEquals((Float) 67.25f , maximumNumber);
    }
    @Test
    public void GivenThreeFloat_findMaximumAt_thirdPosition_shuldReturnSameNumber() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Float maximumNumber = maximumAnalyser.FindMaximum(30.65f ,22.25f, 67.25f);
        Assert.assertEquals((Float) 67.25f , maximumNumber);
    }

}
