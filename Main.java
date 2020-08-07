import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Story story1 = new Story("Once upon a time, some rabbit did drugs. Suddenly, he locked eyes with you. What do you do?");
        System.out.println(story1.getStoryText());
        System.out.println();
        System.out.println("Choice 1: " + story1.getChoice1());
        System.out.println("Choice 2: " + story1.getChoice2());
        System.out.println();
        System.out.print("Choose (1/2): ");
        int answer = input.nextInt();
        // input 
        System.out.println();
        System.out.println("You answered with: " + answer);
        

    }
}