package fr.poe.questionr;

public class Answer {
    final static String SEPARATOR = ",";
    String userAnswer;

    public Answer(String answerLabel) {
        userAnswer = answerLabel;
    }

    public static int[] parse(String answers) {

        String[] answersList = answers.split(",");
        int[] answersIndex = new int[answersList.length];

        for (int i = 0; i < answersList.length; i++) {
            answersList[i] = answersList[i].trim();
            // TODO utiliser une map
            switch (answersList[i]) {
                case "a":
                    answersIndex[i] = 0;
                    break;
                case "b":
                    answersIndex[i] = 1;
                    break;
                case "c":
                    answersIndex[i] = 2;
                    break;
                case "d":
                    answersIndex[i] = 3;
                    break;
                case "e":
                    answersIndex[i] = 4;
                    break;
                case "f":
                    answersIndex[i] = 4;
                    break;
            }
        }
        return answersIndex;

    }
}
