package com.codegym;

public class Main {

    public static void main(String[] args) {
        stopwatch stopwatch = new stopwatch();
        stopwatch.setStarTime();
        int[] array = new int[100000];
        for (int i = 0; i < 100000 ; i++) {
           array[i] = (int) Math.round(Math.random() * 100000);
        }
        stopwatch.setEndTime();
        System.out.println(stopwatch.getElapsedTime());

    }
}
