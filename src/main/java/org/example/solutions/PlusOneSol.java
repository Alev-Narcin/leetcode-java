package org.example.solutions;

public class PlusOneSol {
    public int[] plusOne(int[] digits) {
        StringBuilder builder = new StringBuilder();

        for (int digit : digits) {
            builder.append(digit);
        }
        String string = builder.toString();

        int number = Integer.parseInt(string);

        number += 1;

        char[] chars = Integer.toString(number).toCharArray();

        int[] list = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
//            list[i] = Integer.parseInt(String.valueOf(chars[i])); //buda olur
            list[i] = Character.getNumericValue(chars[i]); //buda
        }
        return list;
    }

    public int[] plusOne2(int[] digits) {
        int lastDigit = digits[digits.length - 1];

        if (lastDigit != 9 && digits.length > 1) {

            lastDigit += 1;
            digits[digits.length - 1] = lastDigit;

        } else if (lastDigit == 9 && digits.length > 1) {

            for (int i = digits.length - 1; i >= 0; i--) {
                digits[i] += 1;

                if (digits[i] != 10) {
                    break;
                } else if (i == 0) {
                    int[] newDigits = new int[digits.length + 1];
                    newDigits[0] = 1;
                    newDigits[1] = 0;
                    System.arraycopy(digits, 2, newDigits, 2, digits.length - 2);
                    return newDigits;
                } else {
                    digits[i] -= 10;
                }
            }
        } else if (lastDigit == 9) {  // && digits.length == 1
            lastDigit = 0;

            int[] list = new int[digits.length + 1];

            list[digits.length] = lastDigit;
            list[digits.length - 1] = 1;

            return list;
        } else { //  lastDigit != 9 && digits.length == 1
            lastDigit += 1;
            int[] list = new int[digits.length];
            list[digits.length - 1] = lastDigit;
            return list;
        }
        return digits;
    }
}