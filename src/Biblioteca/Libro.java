package Biblioteca;

import java.time.LocalDate;

public class Libro extends Publicacion{
    private String autor;
    private int numeroPaginas;
    private boolean estado;
    private LocalDate fechaPrestamo;

    public Libro(int codigo, String titulo, int year, String editorial, String autor, int numeroPaginas) {
        super(codigo, titulo, year, editorial);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    @Override
    public void prestar() {
        this.setEstado(true);
        this.setFechaPrestamo(LocalDate.now());
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", estado=" + estado +
                ", fechaPrestamo=" + fechaPrestamo +
                ", codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", year=" + year +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
