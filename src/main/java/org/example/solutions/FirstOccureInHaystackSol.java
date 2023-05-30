package org.example.solutions;

public class FirstOccureInHaystackSol {

    public int strStr(String haystack, String needle) {
        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();

        char[] newChars = new char[0];

//        System.out.println(haystack.length());
//        System.out.println(needle.length());
//        System.out.println(newChars);

        for (int i = 0; i < haystack.length(); ) {
            if (haystackChars[i] == needleChars[i]) {
                newChars[i] = needleChars[i];
                i++;
            } else {
                return -1;
            }
            return i;
        }
        return 0;
    }

    public int strStr1(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        } else {
            return -1;
        }
    }
}
