package Biblioteca;

import java.time.LocalDate;

public class Publicacion {
    protected int codigo;
    protected String titulo;
    protected int year;
    protected String editorial;


    public Publicacion(int codigo, String titulo, int year, String editorial) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.year = year;
        this.editorial = editorial;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void prestar(){

    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", year=" + year +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
