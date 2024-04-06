package org.example.question;

public class JavaQuestion extends AbstractQuestion{


    public JavaQuestion() {
        super("Сколько примитивных типов есть в Java?");
    }

    @Override
    public boolean checkAnswer(String answer) {
        return answer.equals("8");
    }
}
