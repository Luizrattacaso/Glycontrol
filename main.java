import entities.PersonalInfo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime timeNow = LocalDateTime.now();
        PersonalInfo person = new PersonalInfo();

        System.out.println("Welcome! I am your personal assistant to control your Glucose.");
        System.out.println("First I need to know your name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.printf("Nice to meet you %s. How old are you? ",name);
        int age = scanner.nextInt();

        System.out.println(timeNow.format(fmt1));
    }
}