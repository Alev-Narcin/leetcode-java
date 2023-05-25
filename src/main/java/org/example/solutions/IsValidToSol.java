package org.example.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsValidToSol {
    public boolean isValidTo(String value) {
        char[] chars = value.toCharArray();

        List<Character> parenthesesInString = new ArrayList<>();
        List<Character> openingChars = List.of('{', '[', '(');

        Map<Character, Character> closingOpeningMaps = new HashMap<>() {{
            put('}', '{');
            put(']', '[');
            put(')', '(');
        }};

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (openingChars.contains(c)) {
                parenthesesInString.add(c);
            } else {
                char openingChar = closingOpeningMaps.get(c);

                if (parenthesesInString.isEmpty() || parenthesesInString.get(parenthesesInString.size() - 1) != openingChar)
                    return false;
                else {
                    parenthesesInString.remove(parenthesesInString.size() - 1);
                }
            }
        }

        if (parenthesesInString.size() > 0)
            return false;

        return true;
    }
}
