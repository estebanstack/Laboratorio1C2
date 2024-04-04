package Biblioteca;

public class Revista extends Publicacion{
    private int numero;
    private int periodicidad;


    public Revista(int codigo, String titulo, int year, String editorial, int numero, int periodicidad) {
        super(codigo, titulo, year, editorial);
        this.numero = numero;
        this.periodicidad = periodicidad;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getPeriodicidad() {
        return periodicidad;
    }
    public void setPeriodicidad(int periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "numero=" + numero +
                ", periodicidad=" + periodicidad +
                ", codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", year=" + year +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
