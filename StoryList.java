public class StoryList {
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
        
        // create our stories
        Story end = new Story(0, "You died.");
        Story story1 = new Story(1, "Once upon a time, some rabbit did drugs. Suddenly, he locked eyes with you. What do you do?", "Hit him", "Chill and do drugs with him");
        Story story2 = new Story(2, "You both hit a bong, it was great. Now as you're starting to pass out, the rabbit runs away with your wallet. What do?", "Chase after him", "Go to sleep");
        
        // create the relationships here
        story1.setChoice2Story(2);

        stories[0] = end;
        stories[1] = story1;
        stories[2] = story2;
        
    }

}