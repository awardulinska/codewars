import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ShortestWord {
    public static int findShort (String s) {

    List<String> words = Arrays.asList(s.split(" "));
    String shortestWord = words.stream().min(Comparator.comparing(word -> word.length())).get();

    return shortestWord.length();
    }

//    public static int findShort(String s) {
//        return Stream.of(s.split(" "))
//                .mapToInt(String::length)
//                .min()
//                .getAsInt();
//    }
}

