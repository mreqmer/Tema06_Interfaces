package Tema06_Interfaces.ej03;

public class Perro extends AnimalDomestico {

    public void sacarPaseo(){
        System.out.println("*paseito*");
    }

    @Override
    public boolean hacerCaso() {
        boolean caso = false;
        int aleatorio = (int) (Math.random() * 10) + 1;

        if (aleatorio <= 9) {
            caso = true;
        }

        return caso;
    }

    @Override
    public void hacerRuido() {
        System.out.println("Guau");
    }

}
