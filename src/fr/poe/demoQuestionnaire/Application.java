package fr.poe.demoQuestionnaire;

public class Application {
    public static void main(String[] args) {

        Question question = new Question();
        question.label = "Qui est Bob ?";

        Question question1 = new Question();
        question1.label = "Où est Bob ?";

        Question[] tableauQuestions = {question, question1}; // questionnaire

        // Le questionnaire est prêt, on pose les questions à l'élève
        for (int i = 0; i < tableauQuestions.length; i++) {
            System.out.println(tableauQuestions[i].label);
        }

    }
}
