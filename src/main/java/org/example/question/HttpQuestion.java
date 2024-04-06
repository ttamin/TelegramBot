package org.example.question;

public class HttpQuestion extends AbstractQuestion{

    private String[] methods = {"get", "post", "put", "patch", "delete"};

    public HttpQuestion() {
        super("Какие есть методы http запросов?");
    }

    @Override
    public boolean checkAnswer(String answer) {
        answer = answer.toLowerCase();
        for (String method : methods) {
            if(! answer.contains(method)){
                return false;
            }
        }
        return true;
    }
}
