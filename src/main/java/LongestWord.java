import java.util.ArrayList;

public class LongestWord {

    public String run(String text) {

        System.out.println(text);

        String[] split = text.split(" ");

        ArrayList<String> words = new ArrayList<String>();
        for (String s : split) words.add(s);

        String longestWord = words
                .stream()
                .reduce((longest, current) -> {
                    return current.length() > longest.length() ? current : longest;
                }).orElseGet(() -> "");

        String maxWord = "";
        for (String w : words) {
            if (w.length() > maxWord.length()) maxWord = w;
        }
        System.out.println(maxWord);

        return longestWord;

    }
}
