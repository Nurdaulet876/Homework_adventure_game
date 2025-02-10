public class Main {
    public static void main(String[] args) {
        Player player = new Player("Adventurer");
        CombatManager combatManager = new CombatManager();
        LevelManager levelManager = new LevelManager();

        while (levelManager.getLevel() <= 3 && player.getHealth() > 0) {
            System.out.println("\n=== Level " + levelManager.getLevel() + " ===");

            EnemyManager enemyManager = new EnemyManager(levelManager.getLevel());
            ItemManager itemManager = new ItemManager(levelManager.getLevel());

            for (IEnemy enemy : enemyManager.getEnemies()) {
                combatManager.fight(player, enemy);
                if (player.getHealth() <= 0) break;
            }

            if (player.getHealth() > 0) {
                for (IItem item : itemManager.getItems()) {
                    player.pickUpItem(item);
                }
                if (levelManager.getLevel() < 3) levelManager.advanceLevel();

                if (levelManager.getLevel() == 3) break;
            }
        }

        if (player.getHealth() <= 0) {
            System.out.println(player.getName() + " has perished. Game over.");
        } else {
            System.out.println("Congratulations, " + player.getName() + "! You completed the adventure!");
        }
    }
}