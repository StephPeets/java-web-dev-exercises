package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        TorF tf1 = new TorF("In Java, strings are immutable.", true);
        tf1.askQuestion();
        tf1.checkAnswer();

        MultipleChoice mc1 = new MultipleChoice("Which of the following data types in not primitive in Java?\na. float\nb. char\nc. String","c");


    }
}
