package org.example.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IsValidToSol2 {
    public boolean isValidTo2(String value) {
        char[] chars = value.toCharArray();
        HashMap<Character, Character> map = new HashMap<>() {{
            put('}', '{');
            put(']', '[');
            put(')', '(');
        }};

        List<Character> list = new ArrayList<>();

        List<Character> openingParentheses = List.of('{', '(', '[');

        for (char ch : chars) {
            if (openingParentheses.contains(ch)) {
                list.add(ch);
            } else {
                if (list.isEmpty() || map.get(ch) != list.get(list.size() - 1))
                    return false;
                else list.remove(list.size() - 1);
            }
        }
        if (list.size() > 0)
            return false;

        return true;
    }
}
