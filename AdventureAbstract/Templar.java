public class Templar extends Character implements Tank, Healer{
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int currentHealth, int healCapacity, int shield){
        super(name, currentHealth);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public void heal(Character character) {
        character.setCurrentHealth(Math.min(character.getMaxHealth(), character.getCurrentHealth() + this.healCapacity));
    }

    @Override
    public int getShield() {
        return this.shield;
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() == 0) {
            return String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP.", this.getName(),this.getShield(), this.getHealCapacity());
        } else {
            return String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.", this.getName(), this.getCurrentHealth(), this.getHealCapacity(), this.getShield());
        }
    }

    @Override
    public void takeDamage(int damage) {
        damage = Math.max(0, this.getCurrentHealth() - (damage -this.shield));
        this.setCurrentHealth(damage);
    }
    
    @Override
    public void attack(Character character) {
        this.heal(this);
        character.takeDamage(6);
    }
}
