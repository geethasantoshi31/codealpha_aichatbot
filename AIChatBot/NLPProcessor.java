public class NLPProcessor {
    

    public static String processInput(String input) {

        input = input.toLowerCase().trim();

        input = input.replace("?", "");
        input = input.replace("!", "");

        return input;
    }
}

