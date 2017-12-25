package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Reverse_String {



public static String reverseWords(String input) {
    Deque<String> words = new ArrayDeque<>();
    for (String word: input.split(" ")) {
        if (!word.isEmpty()) {
            words.addFirst(word);
        }
    }
    StringBuilder result = new StringBuilder();
    while (!words.isEmpty()) {
        result.append(words.removeFirst());
        if (!words.isEmpty()) {
            result.append(" ");
           
        }
    }
    return result.toString();
}
}
