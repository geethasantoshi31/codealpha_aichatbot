import java.io.*;
import java.util.HashMap;

class FAQTrainer {

    private HashMap<String, String> responses = new HashMap<>();

    public FAQTrainer() {
        loadResponses();
    }

    private void loadResponses() {

        try {

            BufferedReader br =
                    new BufferedReader(new FileReader("responses.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                String[] parts = line.split("=");

                if (parts.length == 2) {
                    responses.put(parts[0].toLowerCase(), parts[1]);
                }
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Training data not found.");
        }
    }

    public String getResponse(String input) {

        input = NLPProcessor.processInput(input);

        for (String key : responses.keySet()) {

            if (input.contains(key)) {
                return responses.get(key);
            }
        }

        return "Sorry, I don't understand that.";
    }
}
