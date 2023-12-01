package hello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inputWord = scanner.nextLine();
        int wordLength = inputWord.length();
        System.out.println("Length of the entered word: " + wordLength);
        scanner.close();
    }
}

