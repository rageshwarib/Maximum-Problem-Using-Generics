package com.BridgeLabz.generics;

public class MaximumAnalyser<T extends Comparable<T>> {

    private T first;
    private T second;
    private T third;

    public MaximumAnalyser() {
    }
    //Parameterized Constructor
    public MaximumAnalyser(T first, T second, T third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    //Generic Method for finding Maximum from three elements
    public T findMaximum(T first, T second, T third)
    {
        if (first.compareTo(second) > 0 && first.compareTo(third) > 0)
            return first;
        else if (second.compareTo(first) > 0 && second.compareTo(third) > 0)
            return second;
        else
            return third;
    }
    public <T extends Comparable<T>> T findMaximum(){
        return (T) findMaximum(first, second, third);
    }
}


