package com;

public class ZigzagOrder {

    public static void main(String[] args) {
        int[] a = {10, 20, 38, 30, 40};
        int[] b = {20, 32, 40, 43};
        int[] arr = newArray(a, b);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static int[] newArray(int[] x, int[] y) {
        int[] c = new int[x.length + y.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < x.length && j < y.length) {
            if (x[i] < y[j]) {
                c[k] = x[i];
                i++;
            } else {
                c[k] = y[j];
                j++;
            }
            k++;
        }

        while (i < x.length) {
            c[k] = x[i];
            i++;
            k++;
        }

        while (j < y.length) {
            c[k] = y[j];
            j++;
            k++;
        }

        return c;
    }
}
