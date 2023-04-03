package org.example;

import encriptiontools.Decoder;
import encriptiontools.Encoder;
import util.Constants;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String choice = getChoiceFromScreen();

        while (!choice.equals(Constants.EXIT)){
            String content = getContentFromScreen();
            if (choice.equals(Constants.ENCODE)){
                Encoder encoder = new Encoder();
                String encodedContent = encoder.encode(content);
                System.out.println(encodedContent);
            }
            else if(choice.equals(Constants.DECODE)){
                Decoder decoder = new Decoder();
                String decodedContent = decoder.decode(content);
                System.out.println(decodedContent);
            }
            choice = getChoiceFromScreen();

        }
    }

    private static String getChoiceFromScreen() {
        System.out.println("Enter Choice: (1 : ENCODE , 2:DECODE , 0:EXIT) ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String getContentFromScreen() {
        System.out.println("Enter Content: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}


