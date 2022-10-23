package _06_02.end;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println(name);
        System.out.print("Please enter you age: ");
        int age = scanner.nextInt();
        System.out.println(age);
        scanner.nextLine();
        System.out.print("Please enter your occupation: ");
        String occupation = scanner.nextLine();
        System.out.println(occupation);
    }

}
