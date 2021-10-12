package com.company;

import java.util.Objects;
import java.util.Scanner;

public class TorF extends Question {
    private String question;
    private boolean answer;
    private boolean answerInput;
    Scanner userInput;

    public TorF(String question, boolean answer) {
        this.question = question;
        this.answer = answer;
    }

    @Override
    public void askQuestion() {
        userInput = new Scanner(System.in);
        System.out.println("True or false: " + question);
        answerInput = userInput.nextBoolean();

    }

    @Override
    public void checkAnswer() {
        if (Objects.equals(answer, answerInput)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect.");
        }
        userInput.close();
    }

}
