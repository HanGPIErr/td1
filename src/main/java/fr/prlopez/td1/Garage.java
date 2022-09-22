package fr.prlopez.td1;

import java.util.ArrayList;
import java.util.Collections;

public class Garage {

    protected String nom;

    protected ArrayList<Voiture> listeVoiture = new ArrayList<>();

    public Garage(String nom) {
        this.nom = nom;
    }

    public void ajoutVoiture(Voiture... tableauVoiture){

//        for (Voiture voiture : tableauVoiture) {
//            listeVoiture.add(voiture);
//        }
        Collections.addAll(listeVoiture, tableauVoiture);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Voiture> getListeVoiture() {
        return listeVoiture;
    }

    public void setListeVoiture(ArrayList<Voiture> listeVoiture) {
        this.listeVoiture = listeVoiture;
    }
}