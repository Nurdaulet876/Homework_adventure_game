public class CombatManager {
    public void fight(Player player, IEnemy enemy){
        System.out.println(player.getName() + " engages in combat with " + enemy.getName() + "!");
        player.takeDamage(enemy.getDamage());
        player.gainExperience(enemy.getExperience());
    }
}
