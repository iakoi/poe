package fr.poe.questionr;

public class Application {

    public static void main(String[] args) {
        Proposition p = new Proposition("bob", true);
        Question question = new Question("Comment s'appelle Bob ?", new Proposition[]{p});


    }
}
