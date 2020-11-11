package com.company;

public class Calkulator<T extends Number> implements Calculate<T> {
    @Override
    public double plus(T t, T p) {
        return t.doubleValue() + p.doubleValue();
    }
}
