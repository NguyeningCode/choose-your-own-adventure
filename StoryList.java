public class StoryList {
    Story[] stories;

    public StoryList(Story[] stories) {
        this.stories = stories;
    }

    public StoryList() {
        initStories();
    }

    public Story getStory(int num) {
        return stories[num] != null ? stories[num] : stories[99];
    }

    public void initStories() {
        // set aside some space
        stories = new Story[100];
        
        // create our stories
        Story story1 = new Story("Once upon a time, some rabbit did drugs. Suddenly, he locked eyes with you. What do you do?", "Hit him", "Chill and do drugs with him");
        Story story2 = new Story("You both hit a bong, it was great. Now as you're starting to pass out, the rabbit runs away with your wallet. What do?", "Chase after him", "Go to sleep");
        Story end = new Story("You died.");
        
        // create the relationships here
        story1.setChoice2Story(story2);

        stories[0] = story1;
        stories[1] = story2;
        stories[99] = end;
    }

}