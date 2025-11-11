public class DeadCharacterException extends Exception {
    private Character character;

    public DeadCharacterException(Character character) {
        this.character = character;
    }

    public String getMessage() {
        String type = this.character.getClass().getName().toLowerCase();
        return String.format("The %s %s is dead.", type, this.character.getName());
    }
}
