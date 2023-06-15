package org.example.solutions;

public class InterviewQuestionRebuildMessage {
    public String rebuildMessage(String[] parts) {
        StringBuilder builder = new StringBuilder();

        for (String part : parts) {
            char[] chars = part.toCharArray();
            if (chars[0] == 'A') {
                builder.append(part);
            }
        }
        char[] partFirstChars = builder.toString().toCharArray();

        for (int j = 0; j < parts.length; j++) {
            char[] next = parts[j].toCharArray();
            if (partFirstChars[partFirstChars.length - 1] == next[0]) {
                builder.deleteCharAt(builder.length() - 1);
                builder.append(next);
                partFirstChars = next;
                j=0;
            }
        }
        return builder.toString();
    }
}
