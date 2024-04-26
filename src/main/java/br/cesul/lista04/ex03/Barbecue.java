package br.cesul.lista04.ex03;

public class Barbecue {

    private static final double MEAT_FOR_MEN = 0.5;
    private static final double MEAT_FOR_WOMEN = 0.3;
    private static final double MEAT_FOR_CHILDREN = 0.2;

    private static final double BEER_FOR_MEN = 0.75;
    private static final double BEER_FOR_WOMEN = 0.3;

    private final int women;
    private final int men;
    private final int children;

    public Barbecue(int women, int men, int children) {
        this.women = women;
        this.men = men;
        this.children = children;
    }

    public double getMeatQuantity() {
        return (women * MEAT_FOR_WOMEN) +
                (men * MEAT_FOR_MEN) +
                (children * MEAT_FOR_CHILDREN);
    }

    public double getBeerQuantity() {
        return (women * BEER_FOR_WOMEN) + (men * BEER_FOR_MEN);
    }

    public int getWomen() {
        return women;
    }

    public int getMen() {
        return men;
    }

    public int getChildren() {
        return children;
    }
}
