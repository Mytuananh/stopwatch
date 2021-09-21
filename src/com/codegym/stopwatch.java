package com.codegym;

public class stopwatch {
    private long startTime;
    private long endTime;

    public stopwatch() {
    }

    public void setStarTime() {
        this.startTime = System.currentTimeMillis();
    }

    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        long elapsed;
        elapsed = (endTime - startTime);
        return elapsed;
    }
}