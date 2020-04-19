package com.BridgeLabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAnalyserTests {

    MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
    @Test
    public void GivenThreeIntegers_findMaximumAtfirstPosition_shuldReturnSameNumber() {
        Integer maximumNumber = (Integer) maximumAnalyser.findMaximum(67,22, 30);
        Assert.assertEquals((Integer) 67 , maximumNumber);
    }
    @Test
    public void GivenThreeIntegers_findMaximumAt_secondPosition_shuldReturnSameNumber() {
        Integer maximumNumber = (Integer) maximumAnalyser.findMaximum(22 ,67, 30);
        Assert.assertEquals((Integer) 67 , maximumNumber);
    }
    @Test
    public void GivenThreeIntegers_findMaximumAt_thirdPosition_shuldReturnSameNumber() {
        Integer maximumNumber = (Integer) maximumAnalyser.findMaximum(30 ,22, 67);
        Assert.assertEquals((Integer) 67 , maximumNumber);
    }

    @Test
    public void GivenThreeFloat_findMaximumAt_firstPosition_shuldReturnSameNumber() {
        Float maximumNumber = (Float) maximumAnalyser.findMaximum(67.25f, 22.25f, 30.65f, 67.64f);
        Assert.assertEquals((Float) 67.64f , maximumNumber);
    }
    @Test
    public void GivenThreeFloatNumbers_findMaximumAt_secondPosition_shuldReturnSameNumber() {
        Float maximumNumber = (Float) maximumAnalyser.findMaximum(22.25f ,67.25f, 30.65f, 87.5f);
        Assert.assertEquals((Float) 87.5f , maximumNumber);
    }
    @Test
    public void GivenThreeFloatNumbers_findMaximumAt_thirdPosition_shuldReturnSameNumber() {
        Float maximumNumber = (Float) maximumAnalyser.findMaximum(30.65f ,22.25f, 67.25f, 99.5f);
        Assert.assertEquals((Float) 99.5f , maximumNumber);
    }
    @Test
    public void GivenThreeStrings_findMaximumAt_firstPosition_shuldReturnSameString() {
        String maximumNumber = (String) maximumAnalyser.findMaximum("Peach" , "Apple" , "Banana", "Mango","Orange","Strawberry");
        Assert.assertEquals((String) "Strawberry" , maximumNumber);
    }
    @Test
    public void GivenThreeStrings_findMaximumAt_secondPosition_shuldReturnSameString() {
        String maximumNumber = (String) maximumAnalyser.findMaximum("Apple","Orange","Strawberry","Peach" ,"Banana");
        Assert.assertEquals((String) "Strawberry" , maximumNumber);
    }
    @Test
    public void GivenThreeStrings_findMaximumAt_thirdPosition_shuldReturnSameString() {
        String maximumNumber = (String) maximumAnalyser.findMaximum("Orange","Strawberry","Banana" ,"Apple", "Peach");
        Assert.assertEquals((String) "Strawberry" , maximumNumber);
    }

}
