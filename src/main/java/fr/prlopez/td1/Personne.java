package fr.prlopez.td1;

public class Personne {

    public final static String[] listeCivilite = {"M.", "Me.", "Mlle."};

    private String nom;
    private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public static void test(){

        System.out.println();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
