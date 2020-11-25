package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        Integer val = arrayList.stream().reduce(0, (sum, i) -> sum += i);

        Double avg = new Double(val) / new Double(arrayList.size());
        return avg;
    }

    public int getMaxValue() {
        Integer val = arrayList.stream().max(Integer::compareTo).get();
        return val;
    }

    public int getLastOdd() {
        Integer val = arrayList.stream().filter(i -> i % 2 != 0).reduce((first, second) -> second).orElse(null);
        return val;
    }
}
