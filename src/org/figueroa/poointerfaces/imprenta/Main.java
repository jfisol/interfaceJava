package org.figueroa.poointerfaces.imprenta;

import org.figueroa.poointerfaces.imprenta.modelo.*;

public class Main {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo("Desarrollo de software","Jose","Ingeniero en Sistemas");
        cv.addExperiencia("Java");
        cv.addExperiencia("Angular");
        cv.addExperiencia("html y css");

        Libro book = new Libro("Paulo","Programacion Orientada a Objetos",Genero.PROGRA);
        book.addPaginas(new Pagina("Pilares de la Programacion"));
        book.addPaginas(new Pagina("Polimorfismo"));
        book.addPaginas(new Pagina("Encapsulamiento"));
        book.addPaginas(new Pagina("Abstraccion"));
        book.addPaginas(new Pagina("Herencia"));




        Informe info = new Informe("Estudios de POO", "Jose","Julio");
        imprimir(cv);
        imprimir(info);
       // book.imprimir();
        imprimir(book);

    }

    public static  void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}