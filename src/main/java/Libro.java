public class Libro {
    private String nombre;
    private String editorial;
    private String autor;

    public Libro(String nombre, String editorial, String autor){
        this.nombre = nombre;
        this.editorial = editorial;
        this.autor = autor;
    }
    public Libro(){

    }
    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
