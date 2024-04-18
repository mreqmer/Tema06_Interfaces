package Tema06_Interfaces.ej01;

import java.util.Arrays;

public class Main01 {

    public static void main(String[] args) {

        
        Socios.socios[0] = new Socio(02, "Juan", 29);

        Socios.socios[1] = new Socio(01, "Pili", 28);

        Socios.socios[2] = new Socio(00, "Pedro", 16);

        Arrays.sort(Socios.socios);

        Socios.mostrarInfo();

    }

}
