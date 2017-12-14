package fr.poe.input;

import java.util.Scanner;

public class UserInteraction {

    public static String ask(String question) {
        String userResponse;
        System.out.println(question);
        Scanner sc = new Scanner(System.in);
        userResponse = sc.next();
        return userResponse;
    }
}