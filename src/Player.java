import java.util.ArrayList;
import java.util.List;
public class Player {
    private String playerName;
    private int playerHealth;
    private int playerExperience;
    private List<IItem> inventory;

    public Player(String playerName){
        this.playerName = playerName;
        this.playerHealth = 100;
        this.playerExperience = 0;
        this.inventory = new ArrayList<>();
    }


    public String getPlayerName(){
        return playerName;
    }

    public int getPlayerHealth(){
        return playerHealth;
    }

    public void takeDamage(int damage){
        this.playerHealth -= damage;
        System.out.println(playerName + " received " + damage + " damage. Health: " + playerHealth);
    }

    public void gainExperience(int exp){
        this.playerExperience += exp;
        System.out.println(playerName + " received " + exp + " experience. Overall score: " + playerExperience);
    }

    public void pickUpItem(IItem item){
        inventory.add(item);
        item.applyEffect(this);
        System.out.println(playerName + " взял предмет: " + item.getName());
    }
    public int getHealth(){
        return playerHealth;
    }
    public String getName(){
        return playerName;
    }
    
}
