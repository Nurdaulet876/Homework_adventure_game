import java.util.ArrayList;
import java.util.List;
public class ItemManager {
    private List<IItem> items = new ArrayList<>();

    public ItemManager(int level){
        if(level==1){
            items.add(new GoldCoin());
            items.add(new HealthElixir());
        }else if (level==2){
            items.add(new MagicScroll());
        }else if (level==3){
            items.add(new GoldCoin());
            items.add(new HealthElixir());
        }
    }

    public List<IItem> getItems(){
        return items;
    }
}

class GoldCoin implements IItem{
    public String getName(){
        return "Gold Coin";
    }
    public void applyEffect(Player player){
        player.gainExperience(5);
    }
}

class HealthElixir implements IItem{
    public String getName(){
        return "Health Elixir";
    }
    public void applyEffect(Player player){
        player.takeDamage(-20);
    }
}

class MagicScroll implements IItem{
    public String getName(){
        return "Magic Scroll";
    }
    public void applyEffect(Player player){
        player.gainExperience(15);
    }

}
