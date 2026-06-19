# codealpha_
Java AI ChatBot with GUI
A simple, desktop-based FAQ ChatBot built using Java Swing. The application reads a customizable training dataset from a text file, normalizes user inputs using a basic NLP (Natural Language Processing) processor, and matches keywords to provide instant answers.

🚀 Features
Graphical User Interface (GUI): A clean, straightforward chat interface built with Java Swing (JFrame, JTextArea, JTextField).

Simple NLP Engine: Normalizes inputs by trimming spaces, converting to lowercase, and stripping punctuation (like ? and !) for better keyword matching.

External Knowledge Base: Responses are loaded dynamically from an external responses.txt file.

Keyword Detection: Features intelligent response matching—if your message contains a known keyword, the bot catches it and answers accordingly.

🛠️ Project Structure
The project consists of the following key Java files:

ChatGUI.java: The main entry point that renders the window, handles button clicks, and captures user input.

ChatBot.java: Acts as the orchestrator handling global commands (like greeting shutdowns or "bye").

FAQTrainer.java: Reads the text-based data file and manages the core key-value response lookups.

NLPProcessor.java: A helper class that pre-processes text strings for cleaner data comparison.

📄 Setup Data File (responses.txt)
To give your chatbot a voice, create a file named responses.txt in the root directory of your project. Format each line with a key and a value separated by an = sign:

Plaintext
hello=Hi there!
how are you=I am doing great!
what is java=Java is a programming language.
who are you=I am an AI chatbot.
bye=Goodbye!
what is python=Python is an easy programming language.
what is ai=AI means Artificial Intelligence.
what is machine learning=Machine learning allows computers to learn from data.
🏃 How to Run the Project
Prerequisites
Java Development Kit (JDK 8 or higher) installed on your machine.

Execution Steps
Clone the repository (or download the source files into a folder).

Ensure your responses.txt is placed in the exact same directory where you run your compiled application.

Compile the Java source files:

Bash
javac ChatGUI.java ChatBot.java FAQTrainer.java NLPProcessor.java
4. **Run the application:**
   ```bash
   java ChatGUI
🧠 How It Works Under the Hood
User Types a Prompt: When you enter text into the bottom input bar and hit "Send", ChatGUI appends your text to the conversation log.

Text Clean Up: The NLPProcessor instantly turns the message to lowercase and drops any trailing question marks or exclamation marks.

Keyword Check: The FAQTrainer iterates through its loaded dictionary. If your cleaned message contains a valid mapped keyword, it extracts and returns the matching phrase. Otherwise, it defaults to: "Sorry, I don't understand that."
