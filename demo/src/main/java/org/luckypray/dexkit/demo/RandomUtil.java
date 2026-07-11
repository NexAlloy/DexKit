package org.luckypray.dexkit.demo;

import android.util.Log;

import java.util.Random;

public abstract class RandomUtil {

    public static String TAG = "RandomUtil";

    public static int getRandomDice() {
        int randValue = new Random().nextInt(6) + 1;
        Log.d(TAG, "getRandomDice: " + randValue);
        return randValue;
    }

    public static int getLiteralBinop(int value) {
        int lit16 = value + 30000;
        return lit16 ^ -7;
    }

    public static int sumFive(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    public static int callSumFive(int a, int b, int c, int d, int e) {
        return sumFive(a, b, c, d, e);
    }

    public static int sumSix(int a, int b, int c, int d, int e, int f) {
        return a + b + c + d + e + f;
    }

    public static int callSumSix(int a, int b, int c, int d, int e, int f) {
        return sumSix(a, b, c, d, e, f);
    }
}
