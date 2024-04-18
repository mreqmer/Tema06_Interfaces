package Tema06_Interfaces.ej01;

public class Socio implements Comparable <Socio> {

    /**
     * id del socio
     */
    private int id;

    /**
     * nombre del socio
     */
    private String nombre;

    /**
     * edad del socio
     */
    private int edad;

    /**
     * constructor sin parámetros
     */
    public Socio() {

    }

    /**
     * Constructor con todos los atributos del socio
     * @param id ID del socio
     * @param nombre Nombre del socio
     * @param edad Edad del socio
     */
    public Socio(int id, String nombre, int edad) {
        if (id > 0) {
            this.id = id;
        }

        if (nombre != "" && nombre != null) {
            this.nombre = nombre;
        }

        if (edad > 0) {
            this.edad = edad;
        }

    }

    /**
     * 
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     */
    public void setId(int id) {
        if (this.id > 0) {
            this.id = id;
        }
    }

    /**
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        if (this.nombre != "" && this.nombre != null) {
            this.nombre = nombre;
        }
    }

    /**
     * 
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     * 
     * @param edad
     */
    public void setEdad(int edad) {
        if (this.edad > 0) {
            this.edad = edad;
        }
    }

    /**
     * Método toString para los objeto socio
     * @return
     */
    @Override
    public String toString() {
        String cadena = "";

        cadena += "ID: " + this.id + "\n";
        cadena += "Nombre: " + this.nombre + "\n";
        cadena += "Edad: " + this.edad + "\n";
        cadena += "--------------------------------";

        return cadena;
    }

    /**
     * Método compareTo que compara socios según su ID
     * @param o
     * @return
     */
    public int compareTo(Socio o){
        int res = 0;

        if(this.id < o.id){
            res = -1; 
        }else if(this.id > o.id){
            res = 1;
        }

        return res;
    }

    

}
