import fr.prlopez.td1.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Principale {

    public static void main(String[] args) {

//Vehicule monModel = new Vehicule(4, "Lotus");
//
//Bus monBus = new Bus(8, "Mercedes", 15);
//
//Voiture monTest = new Voiture("Toyota", 30);
//
//        System.out.println(monTest.fraisKilometrique(50));

//    impossible car abstraite    Vehicule monVehicule = new Vehicule(2, "Yamaha");
////        System.out.println(monVehicule.info());

//        Voiture maVoiture = new Voiture("Ferrari", 300);
////        System.out.println(maVoiture.info());
//
//        Bus monBus = new Bus(20, "SuperBus", 60);
////        System.out.println(monBus.info());
//
//        Vehicule autreVehicule = maVoiture;
//        Voiture nouvelVoiture = (Voiture)autreVehicule;
//
//        final Voiture voiture2 = new Voiture("Peugeot", 250);
//
//        System.out.println(nouvelVoiture.info());

        Garage superGarage = new Garage("Super Garage !");

        Voiture reno = new Voiture("Reno",45);

        superGarage.ajoutVoiture(
            reno,
            new Voiture("toytoy", 45),
            new Voiture("Merko", 60)
        );

        //mettre HashSet pour ne pas afficher les doublons a la place de ArrayList
    HashSet<Voiture> listeVoiture = new HashSet<>();
    listeVoiture.add(reno);
    listeVoiture.add(reno);
    listeVoiture.add(new Voiture("Mini", 32));

        System.out.println(listeVoiture.size());
//        superGarage.getListeVoiture().add(new Voiture("Mitsubichi", 75));

        HashMap<String, Voiture> mapVoiture = new HashMap<>();

        mapVoiture.put("Reno", reno);
        mapVoiture.put("Mini", new Voiture("mini", 34));


    }

}
