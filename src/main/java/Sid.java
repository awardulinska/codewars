public class Sid {
    public static String howMuchILoveYou(int nb_petals) {

        String[] choice = {"I love you", "a little", "a lot", "passionately",
                "madly", "not at all"};

        if (nb_petals > 0) {
            if (nb_petals <= choice.length) {
                return choice[nb_petals - 1];
            }
            if (nb_petals % 6 == 0) {
                return choice[5];
            }
            if (nb_petals > choice.length) {
                return choice[(nb_petals % 6) - 1];
            }
        }
        return "";

    }
}

//  prosciej:
//    String[] choice = {"not at all", "I love you", "a little", "a lot", "passionately",
//            "madly"};
//        return choice[nb_petals % 6];