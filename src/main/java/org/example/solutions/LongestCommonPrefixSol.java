package org.example.solutions;

public class LongestCommonPrefixSol {
    public String longestCommonPrefix(String[] val) {
        String prefix = val[0];

        for (int i = 1; i < val.length; i++) {
            while (!val[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
