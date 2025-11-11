public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() == 0) {
            return String.format("%s is a dead sorcerer. So bad, it could heal %d HP. He has the weapon %s",
                    this.getName(), this.getHealCapacity(), this.getWeapon().toString());
        } else {
            return String.format("%s is a sorcerer with %d HP. It can heal %d HP. He has the weapon %s", this.getName(),
                    this.getCurrentHealth(), this.getHealCapacity(), this.getWeapon().toString());
        }
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public void heal(Character character) {
        character
                .setCurrentHealth(Math.min(character.getMaxHealth(), character.getCurrentHealth() + this.healCapacity));
    }

    @Override
    public void takeDamage(int damage) {
        damage = Math.max(0, this.getCurrentHealth() - damage);
        this.setCurrentHealth(damage);
    }

    @Override
    public void attack(Character character) {
        this.heal(this);
        int damage = 10;
        if (this.getWeapon() != null) {
            damage = this.getWeapon().getDamage();
        }
        character.takeDamage(damage);
    }
}