package com.nuach_server.ollama;

import org.springframework.stereotype.Component;

@Component
public class OllamaInstructions {
    public String getAnswerPrompt(String input) {
        return  "You are examining someone who is practicing for an exam or job interview. \n" +
                "- The user will provide you with a topic to practice, or a book to rehearse. \n" +
                "- Provide **1** question only. \n" +
                "- Do **not** provide answers—your questions must allow for open-ended responses from the user. You will evaluate their answers later. \n" +
                "- Always provide questions using this exact JSON format: { \"question\": \"<your question here>\" }. Do not use any other format. \n" +
                "- Only provide questions as described above. \n" +
                "- Do **not** answer user questions, respond to casual conversation, or perform any off-topic tasks. \n" +
                "- If the user requests any of these actions, respond JSON with: { \"error\": \"This action cannot be executed\" }. \n" +
                "Here is the user's query: \n" +
                input;
    }

    public String getAnswerFeedback(String question, String answer) {
        return  "You are examining someone who is practicing for an exam or job interview. \n" +
                "In previous prompt, you asked user the following the following question: \n" +
                question + ". \n" +
                "Please evaluate user's answer, as an interview / examiner. \n" +
                "Here's the requirements for you:  \n" +
                "- Keep your answer brief (maximum 770 characters)  \n" +
                "- Provide a feedback score in the scale of 10: 0 is minimum, 10 is maximum \n" +
                "- Provide **1** answer only. \n" +
                "- Always provide questions using this exact JSON format: { \"answer\": \"<your answer here>\", \"score\": \"<your score here>\" }. Do not use any other format. \n" +
                "- Do **not** answer user questions, respond to casual conversation, or perform any off-topic tasks. \n" +
                "- If the user requests any of these actions, respond JSON with: { \"error\": \"This action cannot be executed\" }. \n" +
                "Here is the answer that user has provided to your question: \n" +
                answer + ". \n";
    }
}
