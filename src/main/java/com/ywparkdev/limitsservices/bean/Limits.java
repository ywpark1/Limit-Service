package com.ywparkdev.limitsservices.bean;

public class Limits {

    private int minimum;
    private int maximium;

    public Limits(int minimum, int maximium) {
        this.minimum = minimum;
        this.maximium = maximium;
    }

    public Limits() {
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximium() {
        return maximium;
    }

    public void setMaximium(int maximium) {
        this.maximium = maximium;
    }
}
