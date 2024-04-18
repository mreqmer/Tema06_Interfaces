package Tema06_Interfaces.ej03;

public class Gato extends AnimalDomestico {

    public void toserBolaPelo(){
        System.out.println("*tose*");
    }

    @Override
    public boolean hacerCaso() {
        boolean caso = false;
        int aleatorio = (int) (Math.random() * 100) + 1;

        if (aleatorio <= 5) {
            caso = true;
        }

        return caso;
    }

    @Override
    public void hacerRuido() {
        System.out.println("Miau");
    }

}
