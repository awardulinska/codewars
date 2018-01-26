import java.util.Arrays;

public class SmashWords {

    public static String smash(String... words) {

        StringBuilder sentence = new StringBuilder();
        for (String word :words){
            sentence.append(word +" ");
        }
        return sentence.toString().trim();
    }
}

// SHORTER:
// return String.join(" ", words);
// return words != null ? String.join(" ", words) : null;
