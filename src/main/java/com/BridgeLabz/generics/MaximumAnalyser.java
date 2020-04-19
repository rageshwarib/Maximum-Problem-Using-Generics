package com.BridgeLabz.generics;

import java.util.Arrays;

public class MaximumAnalyser<T extends Comparable<T>> {

    private T first;
    private T second;
    private T third;
    T[] arrayElements;
    private Object maximumResult;

    //default constructor
    public MaximumAnalyser() {
    }
    //Parameterized Constructor
    public MaximumAnalyser(T[] arrayElement){
        this.arrayElements = arrayElement;
    }

    //Generic Method for finding Maximum from three elements
    public T findMaximum(T...arrayElement)
    {
        Arrays.sort(arrayElement);
        return arrayElement[arrayElement.length-1];
    }
    public <T extends Comparable<T>> T findMaximum(){

        return (T) findMaximum(arrayElements);
    }


    public <T> void printMaximum(T maximumResult) {
        System.out.println("Maximum Result :" +maximumResult);
    }
}


