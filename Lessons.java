/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package first.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author quent
 */
public class FirstProject {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Fiche 1
        // Exercice 1
        System.out.println("Hello World");
        System.out.print("Veuillez entrer votre prenom: ");
        String prenom = scanner.next();
        System.out.println("Bonjour " + prenom);
        
        System.out.print("\n");
        
        // Exercice 2
        int a = 1;
        int b = 2;
        
        int temp = b;
        b = a;
        a = temp;        
        System.out.println("a: " + a + " b: " + b);
        
        System.out.print("\n");
        
        // Exercice 3
        int y = 2;
        int x = y + 1;
        
        System.out.println("La nouvelle valeure de x est : " + x);
        System.out.print("La nouvelle valeure de x est : " + y+1);
        System.out.print("\n");
        System.out.println(x);
        
        System.out.print("\n");
        
        // Exercice 4
        String str = "Test";
        int nbrEntier = 10;
        float nbrDecimal = 7.07f;
        
        System.out.println(str.getClass().getSimpleName());
        System.out.println(((Object)nbrEntier).getClass().getSimpleName());
        System.out.println(((Object)nbrDecimal).getClass().getSimpleName());
        
        String str2, str3, str4;
        int g, e, o;
        
        System.out.print("\n");
        
        // Exercice 5
        String nbr = nbrEntier + "";
        String eleve = nbr + " eleve";
        
        System.out.println(eleve);
        
        System.out.print("\n");
        
        // Exercice 6        
        System.out.print("Entrez la longueur du rectangle: ");
        float longueur = scanner.nextFloat();
        System.out.print("Entrez la largueur du rectangle: ");
        float largueur = scanner.nextFloat();
        float aire = longueur * largueur;
        System.out.println("L'aire du rectangle est de: " + aire);
        
        System.out.print("\n");
        
        // Exercice 7
        System.out.print("Entrez la premiere longueur du rectangle: ");
        float longueur1 = scanner.nextFloat();
        System.out.print("Entrez la seconde longueur du rectangle: ");
        float longueur2 = scanner.nextFloat();
        
        double hypo = Math.pow(longueur1, 2) + Math.pow(longueur2, 2);
        System.out.println("L'hypoténuse du triangle est de: " + Math.sqrt(hypo) + " cm");
        
        System.out.print("\n");
        
        // Exercice 8
        System.out.print("Entrez le rayon du cone: ");
        float rayon = scanner.nextFloat();
        System.out.print("Entrez la hauteur du cone: ");
        float hauteur = scanner.nextFloat();
        
        double V = (Math.PI * Math.pow(rayon, 2) * hauteur) / 3;
        System.out.println("Le volume de votre cone est de: " + V);
        
        System.out.print("\n");
        
        // Exercice 9
        System.out.print("Entrez le rayon du disque a decouper: ");
        float rExt = scanner.nextFloat();
        System.out.print("Entrez le rayon du trou a decouper: ");
        float rInt = scanner.nextFloat();
        if(rInt < rExt){
            double surfaceTrou = Math.PI * Math.pow(rInt, 2);
            double surfaceDisque = Math.PI * Math.pow(rExt, 2);
            double surfaceTotal = surfaceDisque - surfaceTrou;
            System.out.println("La surface totale du disque est de: " + surfaceTotal);
        }
        else {
            System.out.println("Veuillez entrer un rayon plus petit que celui du disque !");
        } 
        
        // Fiche 2
        // Exercice 1
        System.out.print("Entrez une premiere valeur: ");
        int V1 = scanner.nextInt();
        System.out.print("Entrez une seconde valeur: ");
        int V2 = scanner.nextInt();
        if(V1 < V2){
            System.out.println("La valeur la plus petite est: " + V1);
        } 
        else if(V1 == V2){
            System.out.println("Les deux valeurs sont identiques");
        }
        else{
            System.out.println("La valeur la plus petite est: " + V2);
        }
        
        System.out.print("\n");
        
        // Exercice 2
        int jour = 7;
        int mois = 7;
        int annee = 2022;
        System.out.print("Entrez votre annee de naissance: ");
        int eAnnee = scanner.nextInt();
        System.out.print("Entrez votre mois de naissance: ");
        int eMois = scanner.nextInt();
        System.out.print("Entrez votre jour de naissance: ");
        int eJour = scanner.nextInt();
        if(annee == eAnnee && mois == eMois && jour == eJour){
            System.out.println("Joyeux anniversaire !");
        } else{
            System.out.println("Ce n'est malheureusement pas ton anniversaire..");
        }
        
        System.out.print("\n");
        
        // Exercice 3
        System.out.print("Entrez un mois de l'annee: ");
        String moisAnnee = scanner.next();
        moisAnnee = moisAnnee.toLowerCase();
        switch(moisAnnee){
                case "janvier" -> System.out.println("Mois numero 1 de l'annee");
                case "fevrier" -> System.out.println("Mois numero 2 de l'annee");
                case "mars" -> System.out.println("Mois numero 3 de l'annee");
                case "avril" -> System.out.println("Mois numero 4 de l'annee");
                case "mai" -> System.out.println("Mois numero 5 de l'annee");
                case "juin" -> System.out.println("Mois numero 6 de l'annee");
                case "juillet" -> System.out.println("Mois numero 7 de l'annee");
                case "aout" -> System.out.println("Mois numero 8 de l'annee");
                case "septembre" -> System.out.println("Mois numero 9 de l'annee");
                case "octobre" -> System.out.println("Mois numero 10 de l'annee");
                case "novembre" -> System.out.println("Mois numero 11 de l'annee");
                case "decembre" -> System.out.println("Mois numero 12 de l'annee");
                case default -> System.out.println("Erreur de saisi");
        }
        
        // Exercice 4
        System.out.print("Entrez le prix de fabrication du produit: ");
        float prixFab = scanner.nextFloat();
        System.out.print("Entrez le prix de vente du produit: ");
        float prixVente = scanner.nextFloat();
        if(prixFab > prixVente){
            System.out.println("Perte");
        } else{
            System.out.println("Profit");
        }
        
        // Exercice 5
        System.out.print("Entrez le prix de fabrication du produit: ");
        int numEnt = scanner.nextInt();
        if (numEnt % 2 == 0){
            System.out.println("Le nombre est pair.");
        } else{
            System.out.println("Le nombre est impair.");
        }
        
        // Exercice 6
        System.out.print("Entrez la premiere chaine de caractere: ");
        String ligneCarac1 = scanner.next();
        System.out.print("Entrez la seconde chaine de caractere: ");
        String ligneCarac2 = scanner.next();
        if(ligneCarac1.length() > ligneCarac2.length()){
            System.out.println(ligneCarac1 + " est plus long que " + ligneCarac2);
        } else if(ligneCarac1.length() == ligneCarac2.length()){
            System.out.println("Les deux chaines de caracteres sont aussi longues");
        } else{
            System.out.println(ligneCarac2 + " est plus long que " + ligneCarac1);
        }
        
        // Exercice 7
        System.out.print("Entrez votre lettre: ");
        String VoyOrCons = scanner.next();
        VoyOrCons = VoyOrCons.toLowerCase();
        switch(VoyOrCons){
            case "a", "e", "i", "o", "u", "y" -> System.out.println("Le caractere" + VoyOrCons + "est une voyelle");
            case "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z" -> System.out.println("Le caractere" + VoyOrCons + "est une consonne");
            case default -> System.out.println("Le caractere ne fait pas partie de l'alphabet");
        }
        
        // Exercice 8
        System.out.print("Veuillez entrer le numero du mois: ");
        int nbrMois = scanner.nextInt();
        switch(nbrMois){
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Mois composé de 31 jours");
            case 4, 6, 9, 11 -> System.out.println("Mois composé de 30 jours");
            case 2 -> System.out.println("Mois composé de 28 ou 29 jours");
        }
        
        // Fiche 3
        // Exercice 1
        String[] array = new String[] {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
        System.out.println(Arrays.asList(array));
        System.out.println(array[0]);
        System.out.println(array[4]);
        array[5] = "dimanche";
        Collections.swap(Arrays.asList(array), 0, 6);
        System.out.print(array[6]);
        
        // Exercice 2
        ArrayList<String> animaux = new ArrayList<String>() {{add("baleine"); add("chien"); add("chat"); add("Jeudi"); add("brebis"); add("loup");}};
        System.out.println(animaux);
        System.out.print(animaux.get(0));
        animaux.add("girafe");
        animaux.add("serpent");
        animaux.remove(0);
        animaux.remove("chien");
        System.out.println(animaux);
        animaux.size();
        
        // Exercice 3
        ArrayList<Integer> nombres = new ArrayList<Integer>() {{add(7); add(07); add(20); add(22);}};
        System.out.println(nombres);
        nombres.add(69);
        System.out.println(nombres);
        System.out.println(nombres.get(0) + nombres.get(1));
        if(nombres.get(0) > 10){
            System.out.println("Le premier élément de la liste est supérieur à 10");
        } else{
            System.out.println("Le premier élément de la liste est inférieur à 10");
        }
        System.out.println(nombres);
        System.out.println(nombres.size());
         
       
        // Exercice 4
        String s = "Ceci est un test"; 
        String[] words = s.split("\\W+");
        System.out.println(Arrays.asList(words));
        
        // Exercice 5
        ArrayList<Integer> entiers = new ArrayList<Integer>() {{add(7); add(07); add(20); add(22);}};
        System.out.println("Que souhaitez vous faire ? (1) Ajouter (2) Supprimer");
        int choix = scanner.nextInt();
        if(choix == 1){
            System.out.print("Entrez un nombre: ");
            int nbr = scanner.nextInt();
            System.out.print("Entrez une position: ");
            int pos = scanner.nextInt();
            int taille = entiers.size();
            entiers.add(pos, nbr);
            if(taille >= entiers.size()){
                System.out.println("Position incorrect");
            }
        } else{
            System.out.println(entiers);
            System.out.println("Selectionnez le nombre à supprimer");
            int supp = scanner.nextInt();
            entiers.remove(supp);
        }
        
        // Exercice 6
        ArrayList<String> eleves = new ArrayList<String>() {{add("Geoffroy"); add("Jacob"); add("Théo"); add("Maurice");}};
        for(int i =0; i<5;i++){
            Collections.shuffle(eleves);
            System.out.println(eleves);
        }
        
        // Fiche 4
        // Exercice 1
        for(int i = 0; i < 10; i++){
            System.out.println("J'aime programmer avec Java ! Ligne " + (i+1));
        }
        ArrayList<String> animaux = new ArrayList<String>() {{add("baleine"); add("chien"); add("chat"); add("Jeudi"); add("brebis"); add("loup");}};
        for(int i = 0; i < animaux.size(); i++){
            System.out.println(animaux.get(i));
        }
        for(String animau: animaux){
            System.out.println(animau);
        }
        for(int i = 0; i < animaux.size(); i++){
            System.out.println(animaux.get(i) + " Position : " + (i+1));
        }
        
        // Exercice 2
        int x = 0;
        while(x <= 10){
            System.out.println(x);
            x++;
        }
        System.out.println(x);
        int enter;
        do{
            System.out.println("Veuillez entrer un nombre: ");
            enter = scanner.nextInt();
        } while(enter != 10);
        
        // Exercice 3
        System.out.println("Entrez un mot: ");
        String mot = scanner.next();
        String[] tableau = mot.split("");
        for(int i = 0; i < tableau.length; i++){
            System.out.println(tableau[i]);
        }
        for(String aff: tableau){
            System.out.println(aff);
        }
        
        // Exercice 4
        int x = 27;
        int value;
        do{
            System.out.println("Entrez une valeur");
            value = scanner.nextInt();
            if(value > x){
                System.out.println("Plus petit");
            } else if(value < x){
                System.out.println("Plus grand");
            }
        } while( value != x);
        
        // Exercice 5
        int x = 0;
        System.out.print("Saisissez une longueur: ");
        int longueur = scanner.nextInt();
        System.out.print("Saisissez une hauteur: ");
        int hauteur = scanner.nextInt();
        System.out.print("Saisissez votre symbole: ");
        String symbol = scanner.next();
        do{
            for(int i = 0; i < longueur; i++){
                System.out.print(symbol);
            }
            System.out.println("");
            x += 1;
        } while(x < hauteur);
        
        // Exercice 6
        int nl ; 
        int nesp ; 
        int j;
        System.out.println("Combien de lignes : ");
        int nlignes = scanner.nextInt();
        for(nl = 0; nl < nlignes; nl++) {
            nesp = nlignes - nl - 1;

            for (j = 0; j < nesp; j ++) System.out.print(' ');
            for (j = 0; j < 2 *nl+1; j ++) System.out.print("*");
            System.out.print('\n');
        }
        
        // Exercice 7
        int nbr;
        do{
            System.out.print("Entrez un nombre: ");
            nbr = scanner.nextInt();
        } while(nbr < 0);
        
        
        // Exercice 8
        System.out.print("Entrez un nombre supérieur à 1: ");
        int nbr = scanner.nextInt();
        ArrayList<Integer> nombres = new ArrayList<Integer>();
        for(int i = 1; i < nbr; i++){
            if(nbr % i == 0){
                nombres.add(i);
            }
        }
        System.out.print(nombres + "sont les nombres qui divisent" + nbr);


    }   

}
