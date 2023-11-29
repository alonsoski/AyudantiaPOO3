package modelo;

import datos.Gestor;
import utiles.GestorPDF;

public class Main {
    public static void main(String[] args) {
        Biblioteca bi = new Biblioteca();
        bi.agregarUnLibro(new Libro("H","editorial1","Autor1"));
        bi.agregarUnLibro(new Libro("a","editorial1","Autor2"));
        bi.agregarUnLibro(new Libro("sf","editorial1","Autor1"));
        bi.agregarUnLibro(new Libro("123","editorial1","Autor1"));
        bi.agregarUnLibro(new Libro("Hhghj","editorial1","Autor1"));
        bi.agregarUnLibro(new Libro("asdas","editorial1","Autor4"));


        Gestor.leerArchivoLibros(bi,"./biblioteca.txt");
        for (int i = 0; i <bi.getLibros().size() ; i++) {
            System.out.println(bi.getLibros().get(i).getNombre());
        }
    }


}
