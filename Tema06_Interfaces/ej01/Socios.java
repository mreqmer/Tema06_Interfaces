package Tema06_Interfaces.ej01;

public class Socios {

    static Socio socios[] = new Socio[10];

    public static boolean anadeUsuario(Socio o) {
        int posicion = -1;
        int i = 0;
        boolean anadido = false;

        while (posicion != -1 && i < socios.length) {
            if (socios[i] == null) {
                posicion = i;
                anadido = true;
                socios[posicion] = o;
            }
        }

        return anadido;
    }

    public static void mostrarInfo(){
        for(Socio elemento : socios ){
            if(elemento != null){
                System.out.println(elemento);
            }
            
        }
    }
}


