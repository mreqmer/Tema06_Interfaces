package Tema06_Interfaces.ej02;

public class Futbolista implements Comparable<Futbolista> {

    /**
     * número de camiseta
     */
    private int camiseta;

    /**
     * Nombre del jugador
     */
    private String nombre;

    /**
     * Edad del jugador
     */
    private int edad;

    /**
     * Goles realizados por el jugador
     */
    private int numeroGoles;

    /**
     * Constructor con todos los parámetros del objeto futbolista
     * 
     * @param camiseta
     * @param nombre
     * @param edad
     * @param numeroGoles
     */
    public Futbolista(int camiseta, String nombre, int edad, int numeroGoles) {

        if (camiseta > 0) {
            this.camiseta = camiseta;
        }
        if (nombre != null && nombre != "") {
            this.nombre = nombre;
        }
        if (edad > 0) {
            this.edad = edad;
        }

        if (numeroGoles >= 0) {
            this.numeroGoles = numeroGoles;
        }
    }

    public int getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(int camiseta) {

        if (camiseta > 0) {
            this.camiseta = camiseta;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && nombre != "") {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        if (numeroGoles >= 0) {
            this.numeroGoles = numeroGoles;
        }
    }

    /**
     * método toSring
     */
    @Override
    public String toString() {
        String cadena = "";

        cadena += "Numero camiseta: " + this.camiseta + "\n";
        cadena += "Nombre: " + this.nombre + "\n";
        cadena += "Edad: " + this.edad + "\n";
        cadena += "Goles: " + this.numeroGoles + "\n";

        return cadena;
    }

    /**
     * Método compareTo que tiene en cuenta el número de la camiseta para ordenar a
     * los jugadores, en caso que tengan el mismo número entonces tiene en *cuenta
     * el nombre del jugador
     * 
     * @return 
     */
    @Override
    public int compareTo(Futbolista f) {
        int res = 0;

        if (this.camiseta > f.camiseta) {
            res = 1;
        } else if (this.camiseta < f.camiseta) {
            res = -1;
        } else if (this.camiseta == f.camiseta) {
            res = this.nombre.compareTo(f.nombre);
        }

        return res;
    }

    /**
     * Método equals que comprueba que el número de camiseta y el nombre de los
     * jugadores tengan que ser iguales para que se consideren iguales
     * 
     * @return True o False dependiendo si son iguales o no
     */
    @Override
    public boolean equals(Object obj) {
       boolean iguales = false;

        Futbolista f = (Futbolista) obj;

        if(this.camiseta == f.camiseta && this.nombre.equals(f.nombre)){
            iguales = true;
        }

        return iguales;
    }

}
