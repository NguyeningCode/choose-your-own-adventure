import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int answer;
        StoryList storyList = new StoryList();
        boolean isFinished = false;
        Story currentStory = storyList.getStory(1);
        while (!isFinished) {
            currentStory.printStoryAndOptions();
            answer = readInput();
            
            if (currentStory.getStoryFinished() && answer == 2) {
                isFinished = true;
            }
            else if (currentStory.getStoryFinished() && answer == 1) {
                currentStory = storyList.getStory(1);
            }
            else if (answer == 1) {
                currentStory = storyList.getStory(currentStory.getChoice1Story());
            } else {
                currentStory = storyList.getStory(currentStory.getChoice2Story());
            }
        }
        
        input.close();
    }

    public static int readInput() {
        
        int answer = 0;
        do {
            try{
                String temp = input.nextLine();
                answer = Integer.parseInt(temp);
                if (answer != 1 && answer != 2) {
                    System.out.println();
                    System.out.print("That is not a valid input! Please choose between 1 and 2: ");    
                }
            } catch (Exception e) {
                System.out.println();
                System.out.print("That is not a valid input! Please choose between 1 and 2: ");
            }
            
        } while (answer != 1 && answer != 2);
        return answer;
    }

    
}