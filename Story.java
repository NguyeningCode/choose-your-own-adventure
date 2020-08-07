public class Story {
    
    String storyText;
    String choice1;
    String choice2;
    boolean oneChoiceAvailable;
    boolean storyFinished;

    public Story(String storyText, String choice1, String choice2) {
        this.storyText = storyText;
        this.choice1 = choice1;
        this.choice2 = choice2;
    }

    public Story(String storyText, String choice1) {
        this.storyText = storyText;
        this.choice1 = choice1;
        this.oneChoiceAvailable = true;
    }

    public Story(String storyText) {
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



}