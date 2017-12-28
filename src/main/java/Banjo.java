public class Banjo {
    public static String areYouPlayingBanjo(String name) {

        char firstLetter = name.charAt(0);

        return (firstLetter == 'R' || firstLetter == 'r') ? name + " plays banjo" : name + " does not play banjo";

        // lub :
        // name.toUpperCase().startsWith("R");
        // name.substring(0,1).toUpperCase().equals("R");
    }

}


