package fr.prlopez.td1;

public class Bus extends Vehicule {

    private int nombreDePassager;


    public Bus(int nombreDeRoue, String marque, int nombreDePassager) {
        super(nombreDeRoue, marque);
        this.nombreDePassager = nombreDePassager;
    }


}
