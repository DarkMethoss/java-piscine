public class Monster extends Character{

    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    @Override
    public String toString(){
        if (this.getCurrentHealth() == 0 ) {
            return String.format("%s is a monster and is dead. He has the weapon %s",  this.getName(), this.getWeapon().toString());
        }else {
            return String.format("%s is a monster with %d HP. He has the weapon %s",  this.getName(), this.getCurrentHealth(), this.getWeapon().toString());
        }
    }

    @Override
    public void takeDamage(int damage) throws DeadCharacterException  {
        if (this.getCurrentHealth() == 0 ) {
            throw new DeadCharacterException(this);
        }
        damage = Math.max(0, this.getCurrentHealth() - (int) Math.floor(damage * 80 / 100));
        this.setCurrentHealth(damage);
    }

    @Override
    public void attack(Character character) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0 ) {
            throw new DeadCharacterException(this);
        }

        int damage = 7;
        if (this.getWeapon() != null) {
            damage = this.getWeapon().getDamage();
        }

        character.takeDamage(damage);
    }
}
