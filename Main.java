import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StoryList storyList = new StoryList();
        boolean isFinished = false;
        Story currentStory = storyList.getStory(0);
        while (!isFinished) {
            currentStory.printStoryAndOptions();
            int answer = input.nextInt();
            if (currentStory.getStoryFinished() && answer == 2) {
                isFinished = true;
            }
            else if (answer == 1) {
                currentStory = currentStory.choice1Story != null ? currentStory.choice1Story : storyList.getStory(99);
            } else {
                currentStory = currentStory.choice2Story != null ? currentStory.choice2Story : storyList.getStory(99);
            }
        }
        
        input.close();
    }

    
}