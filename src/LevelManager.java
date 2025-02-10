public class LevelManager {
    private int level = 1;

    public void advanceLevel(){
        level++;
        System.out.println("Advancing to next level...");
    }

    public int getLevel(){
        return level;
    }
}
