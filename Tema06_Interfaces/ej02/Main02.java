package Tema06_Interfaces.ej02;

import java.util.Arrays;

public class Main02{

    public static void main(String[] args) {
        
        Futbolista[] futbolistas = new Futbolista[5];

        futbolistas [0] = new Futbolista(2, "Juan", 15, 5);
        futbolistas [1] = new Futbolista(2, "Juan", 18, 5);
        futbolistas [2] = new Futbolista(3, "Juan", 16, 5);
        futbolistas [3] = new Futbolista(1, "Lola", 20, 5);
        futbolistas [4] = new Futbolista(1, "Pepa", 14, 5);

        System.out.println("Sin ordenar: ");
        System.out.println();
        informacion(futbolistas);

        Arrays.sort(futbolistas);
        System.out.println("Ordenados:");
        System.out.println();
        informacion(futbolistas);

    }   

    public static void informacion(Futbolista[] futbolistas){
        for(Futbolista valor : futbolistas){
            System.out.println(valor);
        }

    }

}



