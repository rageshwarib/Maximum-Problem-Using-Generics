package com.BridgeLabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAnalyserTests {
    MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
    @Test
    public void GivenThreeIntegers_findMaximumAtfirstPosition_shuldReturnSameNumber() {
        Integer maximumNumber = maximumAnalyser.findMaximum(67,22, 30);
        Assert.assertEquals((Integer) 67 , maximumNumber);
    }
    @Test
    public void GivenThreeIntegers_findMaximumAt_secondPosition_shuldReturnSameNumber() {
        Integer maximumNumber = maximumAnalyser.findMaximum(22 ,67, 30);
        Assert.assertEquals((Integer) 67 , maximumNumber);
    }
    @Test
    public void GivenThreeIntegers_findMaximumAt_thirdPosition_shuldReturnSameNumber() {
        Integer maximumNumber = maximumAnalyser.findMaximum(30 ,22, 67);
        Assert.assertEquals((Integer) 67 , maximumNumber);
    }

    @Test
    public void GivenThreeFloat_findMaximumAt_firstPosition_shuldReturnSameNumber() {
        Float maximumNumber = maximumAnalyser.findMaximum(67.25f,22.25f, 30.65f);
        Assert.assertEquals((Float) 67.25f , maximumNumber);
    }
    @Test
    public void GivenThreeFloatNumbers_findMaximumAt_secondPosition_shuldReturnSameNumber() {
        Float maximumNumber = maximumAnalyser.findMaximum(22.25f ,67.25f, 30.65f);
        Assert.assertEquals((Float) 67.25f , maximumNumber);
    }
    @Test
    public void GivenThreeFloatNumbers_findMaximumAt_thirdPosition_shuldReturnSameNumber() {
        Float maximumNumber = maximumAnalyser.findMaximum(30.65f ,22.25f, 67.25f);
        Assert.assertEquals((Float) 67.25f , maximumNumber);
    }
    @Test
    public void GivenThreeStrings_findMaximumAt_firstPosition_shuldReturnSameString() {
        String maximumNumber = maximumAnalyser.findMaximum("Peach" , "Apple" , "Banana");
        Assert.assertEquals((String) "Peach" , maximumNumber);
    }
    @Test
    public void GivenThreeStrings_findMaximumAt_secondPosition_shuldReturnSameString() {
        String maximumNumber = maximumAnalyser.findMaximum("Apple","Peach" ,"Banana");
        Assert.assertEquals((String) "Peach" , maximumNumber);
    }
    @Test
    public void GivenThreeStrings_findMaximumAt_thirdPosition_shuldReturnSameString() {
        String maximumNumber = maximumAnalyser.findMaximum("Banana" ,"Apple", "Peach");
        Assert.assertEquals((String) "Peach" , maximumNumber);
    }

}
