public abstract class Figure {

    protected double longueur;
    protected static String unite;

    // Constructeur
    public Figure() {

    }

    // Getter et setter pour longueur
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLongueur() {
        return longueur;
    }

    // Getter et setter pour unite
    public String getUnite() {
        return unite;
    }

    public static void setUnite(String unite) {
        Figure.unite = unite;
    }

    // Methodes
    public abstract double demiPerimetre();

    public abstract double surface();

    public abstract double diagonnale();

    public double perimetre() {
        return demiPerimetre() * 2;
    }

}