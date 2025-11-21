public class WithPickles extends RacletteDecorator{
    public WithPickles(Raclette raclette) {
        super(raclette);
    }

    @Override
    public int getCalories() {
        return this.raclette.getCalories() + 50;
    }

    @Override
    public String getIngredients(){
        return this.raclette.getIngredients() + ", cornichons";
    }

    @Override
    public String toString() {
        return String.format("%s pour %d calories", getIngredients(), getCalories());
    }
}
