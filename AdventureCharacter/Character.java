public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;

    public Character(String name, int maxHealth ){
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.name = name;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        if (this.currentHealth == 0) {
            return String.format("%s : KO", this.name);
        }else {
            return String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
        }
    }

    public void takeDamage(int damage){
        this.currentHealth = Math.max(0, this.currentHealth - damage);
    }

    public void attack(Character character) {
        character.takeDamage(9);
    }
}
