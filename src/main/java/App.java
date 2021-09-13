/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 zain yousaffuentes
 */

import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("What is the quote? ");
        String inputQuote = s.nextLine();

        System.out.println("Who said it? ");
        String inputName = s.nextLine();

        System.out.println(inputName + " says, \"" + inputQuote + "\"");
    };
}

