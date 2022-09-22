package fr.prlopez.td1;

public class Bus extends Vehicule {

    private int nombreDePassager;


    public Bus(int nombreDeRoue, String marque, int nombreDePassager) {
        super(nombreDeRoue, marque);
        this.nombreDePassager = nombreDePassager;
    }

    public int coutMaintenanceRoue() {

        return nombreDeRoue * 500;
    }

    @Override
    public String info() {
        return "C'est un bus avec " + nombreDePassager + " passagers.";
    }
}
