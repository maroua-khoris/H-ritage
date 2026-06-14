package org.example;

public class App {
    static void main() {
        Adherent adherent=new Adherent("Mohamed","Ali","Mohamed@gmail.com", 107398515, 45,12);
        Auteur auteur=new Auteur("Ali","Yahya","Ali@gmail.com",01245520,40,23);
        Livre livre=new Livre(1247001, "le riche",auteur);
        System.out.println(adherent.toString());
        System.out.println(livre.toString());
    }
}
