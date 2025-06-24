import entities.Parameters;
import entities.PersonalInfo;
import entities.Parameters;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime timeNow = LocalDateTime.now();
        PersonalInfo person;
        Parameters parameters;

        System.out.println("Welcome! I am Glu, your personal assistant to help you control your Glucose.");
        System.out.println("First I need to know your name: ");
        String name = scanner.nextLine();

        System.out.printf("Nice to meet you %s. How old are you? ",name);
        int age = scanner.nextInt();

        System.out.println("Do you have any idea how much 1 insulin unit affect your glucose in g/dL? ");
        int insulinUnit = scanner.nextInt();

        person = new PersonalInfo(name, age, insulinUnit);

        System.out.print("Enter a parameter to define the minimum that your glucose level can be: ");
        int minimum = scanner.nextInt();

        System.out.print("Enter a parameter to define the maximum that your glucose level can be: ");
        int maximum = scanner.nextInt();

        parameters = new Parameters(maximum,minimum);

        System.out.print("Now that i get the required parameters. Tell me your currency glucose: ");
        int currencyGlucose = scanner.nextInt();
        Parameters.setCurrencyGlucose(currencyGlucose);

        System.out.println(timeNow.format(fmt1));
        System.out.println(person);
    }
}