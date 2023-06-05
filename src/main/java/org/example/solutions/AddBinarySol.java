package org.example.solutions;

public class AddBinarySol {
    public String addBinary(String a, String b) {

        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);

        int sum = intA + intB;

        return Integer.toBinaryString(sum);
    }

    public String addBinary2(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int i = s1.length() - 1, j = s2.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += s1.charAt(i--) - '0';
            if (j >= 0) sum += s2.charAt(j--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

    public String addBinary3(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        StringBuilder builder = new StringBuilder();

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            builder.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) builder.append(carry);
        return builder.reverse().toString();
    }
}
