package org.example.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LengthOfLastWordSol {
    public int lengthOfLastWord(String sentence) {
        List<String> wordList = new ArrayList<>();

        if (sentence.isEmpty()) {
            return 0;
        } else if (!sentence.contains(" ")) {
            return sentence.length();
        } else {
            for (int i = 0; i < sentence.length(); i++) {
                char s = sentence.charAt(i);
                if (s == 32) {
                    String substring = sentence.substring(0, i).trim();
                    wordList.add(substring);
                    sentence = sentence.substring(i);
                    i = 0;
                } else if (i == sentence.length() - 1) {
                    String substring = sentence.substring(0, i + 1).trim();
                    wordList.add(substring);
                }
            }

            for (int i = wordList.size() - 1; ; i--) {
                if (!wordList.get(i).equals("")) {
                    return wordList.get(i).length();
                }
            }
        }
    }

    public int lengthOfLongestWord(String sentence) {
        List<String> wordList = new ArrayList<>();

        if (sentence.isEmpty()) {
            return 0;
        } else if (!sentence.contains(" ")) {
            return sentence.length();
        } else {
            for (int i = 0; i < sentence.length(); i++) {
                char s = sentence.charAt(i);
                if (s == 32) {
                    String substring = sentence.substring(0, i).trim();
                    wordList.add(substring);
                    sentence = sentence.substring(i);
                    i = 0;
                } else if (i == sentence.length() - 1) {
                    String substring = sentence.substring(0, i + 1).trim();
                    wordList.add(substring);
                }
            }

            int maxLength = 0;

            for (String s : wordList) {
                int length = s.length();

                if (length > maxLength)
                    maxLength = length;
            }
            return maxLength;
        }
    }

    public int lengthOfLongestWord2(String sentence) {
        List<String> wordList = new ArrayList<>();

        if (sentence.isEmpty()) {
            return 0;
        } else if (!sentence.contains(" ")) {
            return sentence.length();
        } else {
            StringBuilder currWord = new StringBuilder();

            for (int i = 0; i < sentence.length(); i++) {
                char s = sentence.charAt(i);
                if (s == 32) {
                    wordList.add(currWord.toString());
                    currWord = new StringBuilder();
                } else {
                    currWord.append(s);
                }
            }
            if (currWord.length() > 0) wordList.add(currWord.toString());

            int maxLength = 0;

            for (String s : wordList) {
                int length = s.length();

                if (length > maxLength)
                    maxLength = length;
            }
            return maxLength;
        }
    }

    public int lengthOfLongestWord3(String sentence) {
        if (sentence.isEmpty()) {
            return 0;
        } else if (!sentence.contains(" ")) {
            return sentence.length();
        } else {
            return Stream.of(sentence.split("\\s+")).map(String::length).max(Integer::compareTo).get();
        }
    }
}
