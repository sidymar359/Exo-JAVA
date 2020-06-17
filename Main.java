import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        final Scanner clavier = new Scanner(System.in);
        int choix;
        ArrayList<Carre> listCarre = new ArrayList<Carre>();
        ArrayList<Rectangle> listRectangle = new ArrayList<Rectangle>();

        do {
            System.out.println("=========  MENU    ===========");
            System.out.println("======1- Ajout Rectangle======");
            System.out.println("======2-Lister Rectangle===== ");
            System.out.println("======3-Lister Carre==========");
            System.out.println("======4-Lister Carre==========");
            System.out.println("======5- QUITTER  ============");
            System.out.println("=======FAITES UN CHOIX======= ");
            choix = clavier.nextInt();

            switch (choix) {
                case 1:
                    String response;
                    System.out.println("Saisir un rectangle");

                    do {

                        System.out.println("Saisir la longeur");
                        int l;
                        do {
                            l = clavier.nextInt();
                        } while (l < 0);

                        System.out.println("Saisir la largeur ");
                        int L;
                        do {
                            L = clavier.nextInt();

                        } while (L < 0);

                        Rectangle rec = new Rectangle(l, L);
                        listRectangle.add(rec);

                        System.out.println("Voulez saisir un rectangle oui/non");
                        response = clavier.next();
                    } while (!response.equals("non"));

                    break;

                case 2:
                    for (Rectangle r : listRectangle) {
                        System.out
                                .println("======Rectangle =======" + "L = " + r.getLongueur() + "l =" + r.getLargeur());
                        System.out.println("Le Demi Perimetre est " + r.demiPerimetre());
                        System.out.println("Le Perimetre est " + r.perimetre());
                        System.out.println("La Surface est " + r.surface());
                        System.out.println("La Diagonale est " + r.diagonnale());
                        System.out.println("==================================================");
                    }

                    break;

                case 3:
                    String response2;
                    System.out.println("Saisir un carre");

                    do {

                        System.out.println("Saisir la largeur ");
                        int Lc;
                        do {
                            Lc = clavier.nextInt();

                        } while (Lc < 0);

                        Carre car = new Carre(Lc);
                        listCarre.add(car);

                        System.out.println("Voulez saisir un rectangle oui/non");
                        response2 = clavier.next();
                    } while (!response2.equals("non"));

                    break;

                case 4:
                    for (Carre c : listCarre) {
                        System.out.println("======Rectangle =======" + "L = " + c.getLongueur());
                        System.out.println("Le Demi Perimetre est " + c.demiPerimetre());
                        System.out.println("Le Perimetre est " + c.perimetre());
                        System.out.println("La Surface est " + c.surface());
                        System.out.println("La Diagonale est " + c.diagonnale());
                        System.out.println("==================================================");
                    }
                    break;

                default:
                    System.out.println("Au revoir");
                    break;

            }

        } while (choix != 5);

    }
}