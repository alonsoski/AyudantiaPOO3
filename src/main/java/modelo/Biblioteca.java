package modelo;

import datos.Gestor;

import java.util.ArrayList;
import java.util.Date;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private String nombreBiblio;
    private String direccion;
    private Bibliotecario bibliotecario;
    public Biblioteca(ArrayList<Libro> libros, String nombreBiblio, String direccion){
        this.libros = libros;
        this.nombreBiblio = nombreBiblio;
        this.direccion = direccion;
    }
    public Biblioteca(){
        this.libros=new ArrayList<Libro>();
        this.nombreBiblio = "Nombre aux";
        this.direccion= "Las heras #355";
        this.bibliotecario=new Bibliotecario("ibibi","20.33.44-2","avda R. #222","qwer444");
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombreBiblio() {
        return nombreBiblio;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombreBiblio(String nombreBiblio) {
        this.nombreBiblio = nombreBiblio;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    public void agregarUnLibro(Libro libro){
        boolean existe=false;
        for (int i = 0; i <this.libros.size() ; i++) {
            if (this.libros.get(i).getNombre().equals(libro.getNombre())){
                existe=true;
                break;
            }
        }
        if (existe){
            System.out.println("el libro ya existe");
        }else {
            Gestor.registrarDato(libro,"./biblioteca.txt");
            this.libros.add(libro);
        }
    }
    public Libro buscarLibro(String libro){
        Libro retorno = null;

        for (int i = 0; i <this.libros.size() ; i++) {
            if (this.libros.get(i).getNombre().equals(libro)){
                retorno=this.libros.get(i);
                break;
            }
        }
        if (retorno==null){
            System.out.println("El libro no esta en la biblioteca");
        }
        return retorno;
    }
    public ArrayList<Libro> buscarPorAutor(String autor){
        ArrayList<Libro> retorno = new ArrayList<Libro>();
        for (int i = 0; i <this.libros.size() ; i++) {
            if (this.libros.get(i).getAutor().equals(autor)){
                retorno.add(this.libros.get(i));
            }
        }
        if (retorno.size()==0){
            System.out.println("No tenemos libros de ese autor");
        }
        return retorno;
    }
    public boolean libroExiste(Libro libro){
        boolean existe=false;
        for (int i = 0; i <this.libros.size() ; i++) {
            if (this.libros.get(i).getNombre().equals(libro.getNombre())){
                existe=true;
                break;
            }
        }
        if (existe){
            System.out.println("el libro existe");
        }else {
            System.out.println("el libro no existe");;
        }
        return existe;
    }

    public Prestamo generarPrestamo(Bibliotecario bibl, Usuario usuario, Libro libro, Date fInicio, Date fTermino){
        return new Prestamo(bibl,usuario,libro,fInicio,fTermino);
    }

}

