public class Story {
    int id;
    String storyText;
    String choice1;
    String choice2;
    int choice1Story;
    int choice2Story;
    boolean oneChoiceAvailable;
    boolean storyFinished;

    public Story(int id, String storyText, String choice1, String choice2) {
        this.id = id;
        this.storyText = storyText;
        this.choice1 = choice1;
        this.choice2 = choice2;
    }

    public Story(int id, String storyText, String choice1) {
        this.id = id;
        this.storyText = storyText;
        this.choice1 = choice1;
        this.oneChoiceAvailable = true;
    }

    public Story(int id, String storyText) {
        this.id = id;
        this.storyText = storyText;
        this.storyFinished = true;
        this.choice1 = "Start Over";
        this.choice2 = "Quit";
    }

    public String getStoryText() {
        return this.storyText;
    }

    public String getChoice1() {
        return this.choice1;
    }
    
    public String getChoice2() {
        return this.choice2;
    }

    public boolean getOneChoiceAvailable() {
        return this.oneChoiceAvailable;
    }

    public boolean getStoryFinished() {
        return this.storyFinished;
    }

    public int getChoice1Story() {
        return this.choice1Story;
    }
    
    public int getChoice2Story() {
        return this.choice2Story;
    }

    public void setChoice1Story(int storyId) {
        this.choice1Story = storyId;
    }

    public void setChoice2Story(int storyId) {
        this.choice2Story = storyId;
    }

    public void printStoryAndOptions() {
        System.out.println(storyText);
        System.out.println();
        System.out.println("Choice 1: " + choice1);
        System.out.println("Choice 2: " + choice2);
        System.out.println();
        System.out.print("Choose (1/2): ");
    }

}