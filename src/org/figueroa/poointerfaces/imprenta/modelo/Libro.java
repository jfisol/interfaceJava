package org.figueroa.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{

   // private List<Hoja> hoja;
   private List<Imprimible> hoja;
    private String autor;
    private String tituloLibro;
    private Genero genero;

    public Libro( String autor, String tituloLibro, Genero genero) {
        this.autor = autor;
        this.tituloLibro = tituloLibro;
        this.genero = genero;
        this.hoja = new ArrayList<>();
    }

    public Libro addPaginas(Imprimible pagina){
        hoja.add(pagina);
        return this;
    }
    @Override
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(this.tituloLibro).append("\n")
                .append("Autor: ").append(this.autor).append("\n")
                .append("genero: ").append(this.genero).append("\n");
        for(Imprimible paginas:hoja){
            sb.append(paginas.imprimir()).append("\n");
        }

        return sb.toString();
    }
}
