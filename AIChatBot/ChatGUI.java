import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ChatGUI extends JFrame {

    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;

    private ChatBot bot;

    public ChatGUI() {

        bot = new ChatBot();

        setTitle("AI ChatBot");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        chatArea = new JTextArea();
        chatArea.setEditable(false);

        JScrollPane scrollPane =
                new JScrollPane(chatArea);

        inputField = new JTextField();

        sendButton = new JButton("Send");

        JPanel panel = new JPanel(new BorderLayout());

        panel.add(inputField, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.EAST);

        add(scrollPane, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        sendButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String userText = inputField.getText();

                chatArea.append("You: " + userText + "\n");

                String response = bot.chat(userText);

                chatArea.append("Bot: " + response + "\n\n");

                inputField.setText("");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new ChatGUI();
    }
}