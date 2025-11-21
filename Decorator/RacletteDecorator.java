public abstract class RacletteDecorator implements Raclette{
    protected Raclette raclette;

    public RacletteDecorator(Raclette raclette){
        this.raclette = raclette;
    }

    @Override
    public int getCalories() {
        return this.raclette.getCalories();
    }

    @Override
    public String getIngredients(){
        return this.raclette.getIngredients();
    }

    @Override
    public String toString() {
        return String.format("%s pour %d calories", getIngredients(), getCalories());
    }
}
