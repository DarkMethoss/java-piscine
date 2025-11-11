import java.util.ArrayList;
import java.util.List;

public abstract class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();

    public Character(String name, int maxHealth) {
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.name = name;

        Character.allCharacters.add(this);
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public void setCurrentHealth(int value) {
        this.currentHealth = value;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        if (this.currentHealth == 0) {
            return String.format("%s : KO", this.name);
        } else {
            return String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
        }
    }

    public abstract void takeDamage(int damage);

    public abstract void attack(Character character);

    public static String printStatus() {
        String outline = "------------------------------------------";
        StringBuilder res = new StringBuilder("");
        res.append(outline + "\n");
        if (Character.allCharacters.isEmpty()) {
            res.append("Nobody's fighting right now !" + "\n");
        } else {
            res.append("Characters currently fighting :" + "\n");
            
            for (Character character : Character.allCharacters) {
                res.append(" - " + character.toString() + "\n");
            }
        }
        res.append(outline+ "\n" );
        return String.valueOf(res);
    }

    public static Character fight(Character character1, Character character2) {
        while (true) {
            character1.attack(character2);
            if (character2.getCurrentHealth() == 0) {
                return character1;
            } 

            character2.attack(character1);
            if (character1.getCurrentHealth() == 0) {
                return character2;
            } 
        }
    }
}
