package part_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProgrammingHobbyCollection {
    private int count;
    private List<ProgrammingHobby> hobbies;

    public ProgrammingHobbyCollection() {
        count = 0;
        hobbies = new ArrayList<>();
    }

    public void add(ProgrammingHobby newHobby) {
        hobbies.add(newHobby);
        count++;
    }

    public void printOne(int i) {
        if (i >= 0 && i < count) {
            ProgrammingHobby hobby = hobbies.get(i);
            System.out.println("Hobby Name: " + hobby.getProgrammingLanguage());
            System.out.println("Years of Experience: " + hobby.getYearsOfExperience());
            System.out.println("Expertise Level: " + hobby.calculateExpertiseLevel());
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            printOne(i);
            System.out.println();
        }
    }

    public void find(String language) {
        for (ProgrammingHobby hobby : hobbies) {
            if (hobby.getProgrammingLanguage().equalsIgnoreCase(language)) {
                System.out.println("Found hobby:");
                printOne(hobbies.indexOf(hobby));
                return;
            }
        }
        System.out.println("Hobby not found.");
    }

    public void sort() {
        Collections.sort(hobbies, Comparator.comparingInt(ProgrammingHobby::getYearsOfExperience));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProgrammingHobbyCollection collection = new ProgrammingHobbyCollection();

        while (true) {
            System.out.println("Welcome to the programming hobby collection!");
            System.out.println("Choose an option to proceed:");
            System.out.println("1 - Add a hobby to the collection");
            System.out.println("2 - Print all hobbies");
            System.out.println("3 - Sort hobbies by years of experience");
            System.out.println("4 - Search hobbies by programming language");
            System.out.println("0 - Exit the program");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter programming language: ");
                    String language = scanner.nextLine();
                    System.out.print("Enter years of experience: ");
                    int experience = scanner.nextInt();
                    scanner.nextLine();
                    ProgrammingHobby hobby = new ProgrammingHobby(language, experience);
                    collection.add(hobby);
                    break;
                case 2:
                    collection.print();
                    break;
                case 3:
                    collection.sort();
                    System.out.println("Hobbies sorted by years of experience.");
                    break;
                case 4:
                    System.out.print("Enter programming language to search: ");
                    String searchLanguage = scanner.nextLine();
                    collection.find(searchLanguage);
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
