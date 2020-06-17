import java.lang.Math;

public class Carre extends Figure {

    public Carre(int longeur) {
        this.longueur = longueur;
    }

    @Override
    public double demiPerimetre() {
        return this.longueur * 2;
    }

    @Override
    public double surface() {
        return this.longueur * this.longueur;
    }

    @Override
    public double diagonnale() {
        return Math.sqrt(Math.pow(this.longueur, 2) * 2);
    }

}