package fr.poe.questionr;

import java.util.Scanner;

public class Question {
    String label;
    Proposition[] propositions;

    public Question(String label, Proposition[] propositions) {
        this.label = label;
        this.propositions = propositions;
    }

    /**
     * Vérifie si la réponse est bonne.
     *
     * @param answer
     * @return
     */
    public boolean check(Answer answer) {
        boolean isAnswerCorrect = true;
        int[] answers = Answer.parse(answer.userAnswer);
        if (answers.length == countCorrectProposition()) {
            for (int i = 0; i < answers.length && isAnswerCorrect; i++) {
                isAnswerCorrect = isAnswerCorrect && propositions[answers[i]].isCorrect;
            }
        }
        return isAnswerCorrect;
    }

    /**
     * Pose une question et récupère la réponse
     *
     * @return Answer la réponse de l'utilisateur
     */
    public Answer ask() {
        Scanner sc = new Scanner(System.in);
        System.out.println(label);
        String userResponse = sc.next();
        return new Answer(userResponse);
    }


    public int countCorrectProposition() {
        int count = 0;
        for (int i = 0; i < propositions.length; i++) {
            if (propositions[i].isCorrect) {
                count++;
            }
        }
        return count;
    }
}
