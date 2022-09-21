import fr.prlopez.td1.Bus;
import fr.prlopez.td1.Vehicule;
import fr.prlopez.td1.Voiture;

public class Principale {

    public static void main(String[] args) {

Vehicule monModel = new Vehicule(4, "Lotus");

Bus monBus = new Bus(8, "Mercedes", 15);

Voiture monTest = new Voiture("Toyota", 30);

        System.out.println(monTest.fraisKilometrique(50));

    }
}
