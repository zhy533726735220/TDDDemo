package com.zhy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PrimeUtil {
    public static int[] getPrimes(int max) {
        if (max <= 2) {
            return new int[]{};
        } else {
            int[] newArray = new int[max];
            int size = 0, j = 0;
            for (int i = 0; i < max; i++) {
                for (j = 2; j < i/2+1; j++) {
                    if (i % j == 0) {
                        break;
                    }
                }
                if (j == i/2+1) {
                    newArray[size++] = i;
                }
            }
            newArray = Arrays.copyOf(newArray, size);
            return newArray;
        }
    }
}
