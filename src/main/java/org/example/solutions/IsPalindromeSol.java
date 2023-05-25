package org.example.solutions;

public class IsPalindromeSol {
    public boolean isPalindromeInt(int val) {
        if (val < 0 || (val % 10 == 0 && val != 0)) return false;

        int reverse = 0;

        while (val > reverse) {
            reverse = val % 10 + reverse * 10;
            val = val / 10;
        }
        return reverse == val || val == reverse / 10;
    }

    public boolean isPalindromeString(int val) {
        String stringVal = String.valueOf(val);

        StringBuilder sb = new StringBuilder(stringVal);

        return sb.reverse().toString().equals(stringVal);

    }
}
