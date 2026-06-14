package org.example;

public class Personne {
    private String nom;
    private String prenom;
    private String email;
    private int tel;
    private int age;

    public Personne(String nom,String prenom, String email, int tel, int age){
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.tel=tel;
        this.age=age;
    }
    public String toString(){
        return " nom "+nom+"\nprenom "+prenom+"\nemail "+email+"\nnuméro de téléphone "+tel+"\nage "+age;
    }
}
