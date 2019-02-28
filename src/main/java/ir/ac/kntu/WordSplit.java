 package ir.ac.kntu;

import java.util.Scanner;

public class WordSplit{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
       input=input.trim();
        String[] splited = input.split("\\s+");




        System.out.println(String.join(",",splited));

        scanner.close();
    }

}
