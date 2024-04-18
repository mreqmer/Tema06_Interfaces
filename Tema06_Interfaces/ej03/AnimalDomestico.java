package Tema06_Interfaces.ej03;

public abstract class AnimalDomestico implements Animal {

    private String nombre = "";

    private String raza = "";

    private String peso = "";

    private String color = "";

    

    public AnimalDomestico() {
    }

    public AnimalDomestico(String nombre, String raza, String peso, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.color = color;
    }

    /**
     * 
     */
    public boolean vacunar(){
        boolean vacunado = false;

        return vacunado;
    }

    public void comer(){
        System.out.println("Comer 3 veces al día");
    }

    public void dormir(){
        System.out.println("Dormir por la noche");
    }


    public abstract boolean hacerCaso();

    public abstract void hacerRuido();

    

}
