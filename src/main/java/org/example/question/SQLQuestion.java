package org.example.question;

public class SQLQuestion extends AbstractQuestion{
    public SQLQuestion() {
        super("Сколько существует типов связей между таблицами SQL?");
    }

    @Override
    public boolean checkAnswer(String answer) {
        return answer.equals("3");
    }
}
