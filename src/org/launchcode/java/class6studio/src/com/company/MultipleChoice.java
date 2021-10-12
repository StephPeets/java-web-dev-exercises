package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question{

    private String question;
//    private ArrayList<String> choices;
    private String answer;
    private String answerInput;
    private String setUp = "Please choose an integer.";
    Scanner userInput;

    public MultipleChoice(String question, String answer) {
        userInput = new Scanner(System.in);
        System.out.println(setUp);
        this.question = question;
        this.answer = answer;
        askQuestion();
        checkAnswer();
    }

    @Override
    public void askQuestion() {
        System.out.println(question);
        answerInput = userInput.nextLine();
    }

    @Override
    public void checkAnswer() {
        if (answer.equalsIgnoreCase(answerInput)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect.");
        }
//        userInput.close();
    }


}
