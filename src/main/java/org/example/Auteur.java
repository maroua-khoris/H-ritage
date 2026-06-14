package org.example;

public class Auteur extends Personne{
    private int numAuteur;


    public Auteur(String nom, String prenom, String email, int tel, int age,int numAuteur) {
        super(nom, prenom, email, tel, age);
        this.numAuteur=numAuteur;
    }

    @Override
    public String toString(){
        return super.toString()+"\nnuméro d'auteur "+numAuteur;
    }
}
