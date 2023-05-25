package org.example.solutions;

import java.util.HashMap;

public class RomanToIntSol {
    public int RomanToInt(String value) {
        char[] charVal = value.toCharArray();

        HashMap<Character, Integer> characterHasMap = new HashMap<>();
        characterHasMap.put('I', 1);
        characterHasMap.put('V', 5);
        characterHasMap.put('X', 10);
        characterHasMap.put('L', 50);
        characterHasMap.put('C', 100);
        characterHasMap.put('D', 500);
        characterHasMap.put('M', 1000);

        int response = 0;

        for (int i = 0; i < charVal.length; i++) {
            if (i + 1 < charVal.length && characterHasMap.get(charVal[i]) < characterHasMap.get(charVal[i + 1])) {
                response = response - characterHasMap.get(charVal[i]);

            } else {
                response += characterHasMap.get(charVal[i]);
            }
        }
        return response;
    }
}
