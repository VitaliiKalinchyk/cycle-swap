package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array!=null && array.length!=0) {
            int rightMostValue = array[array.length - 1];
            System.arraycopy(array, 0, array, 1, array.length - 1);
            array[0] = rightMostValue;
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if (array!=null && array.length!=0 && shift>0)
            for (int i = 0; i < shift; i++) {
                cycleSwap(array);
            }
    }
}
