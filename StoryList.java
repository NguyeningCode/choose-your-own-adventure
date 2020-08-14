import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StoryList {
    private static final Pattern COMMA_DELIMITER = Pattern.compile(",");
    Story[] stories;

    public StoryList(Story[] stories) {
        this.stories = stories;
    }

    public StoryList() {
        initStories();
    }

    public Story getStory(int num) {
        return stories[num];
    }

    public void initStories() {
        // set aside some space
        stories = new Story[100];

        // List<List<String>> records = new ArrayList<>();
        // try (Scanner scanner = new Scanner(new File("story.csv"));) {
        //     // do this to skip over the first line
        //     scanner.nextLine();
        //     while (scanner.hasNextLine()) {
        //         // records.add(getRecordFromLine(scanner.nextLine()));
        //         List<String> storyValues = getRecordFromLine(scanner.nextLine());
        //         int storyIndex = Integer.parseInt(storyValues.get(0));
        //         stories[storyIndex] = parseStory(storyIndex, storyValues);
        //     }
        // } catch (Exception e) {
        //     System.out.println("Error while reading file: " + e.getMessage());
        //     System.exit(1);
        // }
    // }
        
        // create our stories
        Story story1 = new Story(1, "Once upon a time, some rabbit did drugs. Suddenly, he locked eyes with you. What do you do?", "Hit him", "Chill and do drugs with him");
        Story story2 = new Story(2, "You both hit a bong, it was great. Now as you're starting to pass out, the rabbit runs away with your wallet. What do?", "Chase after him", "Go to sleep");
        Story end = new Story(0, "You died.");
        
        // create the relationships here
        story1.setChoice2Story(2);

        stories[1] = story1;
        stories[2] = story2;
        stories[0] = end;
        }

    private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            while (rowScanner.hasNext()) {
                values = Arrays.asList(rowScanner.next().split(","));
            }
        }
        return values;
    }

    private Story parseStory(int storyIndex, List<String> storyValues) {
        Story story = null;
        if (storyIndex >= 0 && storyIndex <= 99) {
            if (storyValues.get(2) == null && storyValues.get(3) == null) {
                story = new Story(storyIndex, storyValues.get(1));
            } else if (storyValues.get(3) == null) {
                story = new Story(storyIndex, storyValues.get(1), storyValues.get(2));
                if (storyValues.get(4) != null) {
                    int choice1 = Integer.parseInt(storyValues.get(4));
                    story.setChoice1Story(choice1);
                }
            } else {
                story = new Story(storyIndex, storyValues.get(1), storyValues.get(2), storyValues.get(3));
                if (storyValues.get(4) != null) {
                    int choice1 = Integer.parseInt(storyValues.get(4));
                    story.setChoice1Story(choice1);
                }
                if (storyValues.get(5) != null) {
                    int choice2 = Integer.parseInt(storyValues.get(5));
                    story.setChoice1Story(choice2);
                }
            }    
        }
        return story;
    }
}