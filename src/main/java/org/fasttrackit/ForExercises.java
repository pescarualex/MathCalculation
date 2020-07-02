package org.fasttrackit;

import java.util.Scanner;

public class ForExercises {


    public void firstExercise(int x) {
        for (int i = 0; x <= 100; x++) {
            System.out.println(x);
        }
    }

    public void secondExercise(int x) {
        for (int i = 0; x >= -100; x--) {
            System.out.println(x);
        }
    }

    public void thirdExercise(int x, int y) {
        for (int i = 0; x <= y; x++) {
            System.out.println(x);
        }
    }

    public void fourExercise(int x, int y) {
        if (x < y) {
            for (int i = 0; x < y; x++) {
                System.out.println(x);
            }
        } else if (y < x) {
            for (int i = 0; y < x; y++) {
                System.out.println(y);
            }
        }
    }

    public void fiveExercise() {
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    public void sixExercise() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    public void sevenExercise(int x) {
        int sum = 0;

        for (int i = x; i < 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void eightExercise(int x) {
        double med = 0;
        int sum = 0;

        for (int i = x; i <= 100; i++) {
            sum += i;
            med = sum / x;
        }
        System.out.println(med);
    }

    public void nineExercise() {
        String asterix = "*";
        int a = 7;
        for (int i = 1; i <= a; i++) {
            for (int j = a; j >= 1; j--) {
                if (j >= i) {
                    System.out.print(asterix);
                } else {
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }




}
