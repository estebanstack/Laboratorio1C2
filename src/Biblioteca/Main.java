package Biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Publicacion> publicaciones=new ArrayList<>();

    public static void main(String[] args) {
        Publicacion libro1=new Libro(123, "Narnia",2010,"Editorial1", "Jorge Meneses",
                325);
        publicaciones.add(libro1);
        prestar();


    }

    public static void prestar(){
        System.out.println("Ingrese el codigo del libro ");
        Scanner sc=new Scanner(System.in);
        int codigo=sc.nextInt();
        for(Publicacion p:publicaciones){
            if(p.getCodigo()==codigo){
                //Libro pp = (Libro) p;
                //pp.setEstado(true);
                //pp.setFechaPrestamo(LocalDate.now());

                p.prestar();
                System.out.println(p);
            }else{
                System.out.println("Libro no existente");
            }
        }
    }
}
