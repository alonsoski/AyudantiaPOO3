import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private String nombreBiblio;
    private String direccion;


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
        this.libros.add(libro);
    }
}

