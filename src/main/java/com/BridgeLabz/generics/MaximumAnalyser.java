package com.BridgeLabz.generics;

public class MaximumAnalyser {

    public Integer FindMaximum(Integer first, Integer second, Integer third) {
        if (first.compareTo(second) > 0 && first.compareTo(third) > 0)
            return first;
        else if (second.compareTo(first) > 0 && second.compareTo(third) > 0)
            return second;
        else
            return third;
    }
    public Float FindMaximum(Float first, Float second, Float third) {
        if (first.compareTo(second) > 0 && first.compareTo(third) > 0)
            return first;
        else if (second.compareTo(first) > 0 && second.compareTo(third) > 0)
            return second;
        else
            return third;
    }
    public String FindMaximum(String firstString, String secondString, String thirdString) {
        if (firstString.compareTo(secondString) > 0 && firstString.compareTo(thirdString) > 0)
            return firstString;
        else if (secondString.compareTo(firstString) > 0 && secondString.compareTo(thirdString) > 0)
            return secondString;
        else
            return thirdString;
    }
}


