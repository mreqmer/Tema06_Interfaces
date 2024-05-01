package Tema07_Collections.ejercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ejercicio02 {

    public static void main(String[] args) {
        //tamaño que tendrá el set
        final int LIMITE = 10;
        //se usa para guardar un número aleatorio
        int aleatorio;
        //Clase random
        Random rand = new Random();
        //Usado para guardar números no repetidos basados en su orden de inserción
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
        //Añade un número aleatorio cada iteración hasta que sea de tamño LIMITE, al set un HashSet no se repetirán
        while(numeros.size() != LIMITE){
            aleatorio = rand.nextInt(1, 20);
            numeros.add(aleatorio);
        }
        //muestra valores
        for (int valor : numeros) {
            System.out.print(valor + " ");
        }
        
    }

}
