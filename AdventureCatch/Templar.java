public class Templar extends Character implements Tank, Healer {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int currentHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, currentHealth, weapon);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public void heal(Character character) throws DeadCharacterException{
        if (this.getCurrentHealth() == 0 ) {
            throw new DeadCharacterException(this);
        }
        character
                .setCurrentHealth(Math.min(character.getMaxHealth(), character.getCurrentHealth() + this.healCapacity));
    }

    @Override
    public int getShield() {
        return this.shield;
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() == 0) {
            return String.format(
                    "%s has been beaten, even with its %d shield. So bad, it could heal %d HP. He has the weapon %s",
                    this.getName(), this.getShield(), this.getHealCapacity(), this.getWeapon().toString());
        } else {
            return String.format(
                    "%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d. He has the weapon %s",
                    this.getName(), this.getCurrentHealth(), this.getHealCapacity(), this.getShield(),
                    this.getWeapon().toString());
        }
    }

    @Override
    public void takeDamage(int damage) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        } 
        damage = Math.max(0, this.getCurrentHealth() - (damage - this.shield));
        this.setCurrentHealth(damage);
    }

    @Override
    public void attack(Character character) throws DeadCharacterException {
        this.heal(this);
        int damage = 6;
        if (this.getWeapon() != null) {
            damage = this.getWeapon().getDamage();
        }
        character.takeDamage(damage);
    }
}
