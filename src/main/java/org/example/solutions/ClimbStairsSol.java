package org.example.solutions;

public class ClimbStairsSol {

    public int climbStairs(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        if (x == 2) {
            return 2;
        }
        return climbStairs(x - 1) + climbStairs(x - 2);
    }
}
