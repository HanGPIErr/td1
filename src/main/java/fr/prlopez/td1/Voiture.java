package fr.prlopez.td1;

public class Voiture extends Vehicule {

    private int nombreDeChevaux;


    public Voiture(String marque, int nombreDeChevaux) {
        super(4, marque);
        this.nombreDeChevaux = nombreDeChevaux;

    }

    public int fraisKilometrique(int nombreKilometre) {

        return nombreKilometre * nombreDeChevaux * 34;
    }
@Override
    public String info() {
        return "C'est une voiture à 4 roues";
    }
}
