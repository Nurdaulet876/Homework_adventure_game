import java.util.ArrayList;
import java.util.List;
public class EnemyManager {
    private List<IEnemy> enemies = new ArrayList<>();

    public EnemyManager(int level){
        if(level==1){
            enemies.add(new Skeleton());
            enemies.add(new Zombie());
        } else if (level==2) {
            enemies.add(new Vampire());
        } else if (level==3) {
            enemies.add(new Zombie());
            enemies.add(new Vampire());
        }
    }

    public List<IEnemy> getEnemies(){
        return enemies;
    }
}

class Skeleton implements IEnemy{
    public String getName(){
        return "Skeleton";
    }
    public int getDamage(){
        return 10;
    }
    public int getExperience(){
        return 20;
    }
}

class Zombie implements IEnemy{
    public String getName(){
        return "Zombie";
    }
    public int getDamage(){
        return 15;
    }
    public int getExperience(){
        return 30;
    }
}

class Vampire implements IEnemy{
    public String getName(){
        return "Vampire";
    }
    public int getDamage(){
        return 25;
    }
    public int getExperience(){
        return 50;
    }

}
