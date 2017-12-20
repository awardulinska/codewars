import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ShortestWord {
    public static int findShort1 (String s) {

    List<String> words = Arrays.asList(s.split(" "));
    String shortestWord = words.stream().min(Comparator.comparing(word -> word.length())).get();

    return shortestWord.length();
    }

}
