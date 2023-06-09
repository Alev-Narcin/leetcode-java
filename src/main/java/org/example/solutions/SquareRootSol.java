package org.example.solutions;

public class SquareRootSol {
    public int squareRoot(int x) {
        if (x == 0) return 0;
        long k = x;

        while (k * k > x) {
            k = (k + x / k) / 2;
        }
        return (int) k;
    }

    public int squareRoot2(int x) {
        return (int) Math.sqrt(x);
    }
}
