class ChatBot {

    private FAQTrainer trainer;

    public ChatBot() {
        trainer = new FAQTrainer();
    }

    public String chat(String userMessage) {

        if (userMessage.equalsIgnoreCase("bye")) {
            return "Goodbye!";
        }

        return trainer.getResponse(userMessage);
    }
}