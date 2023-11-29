package modelo;

public class Bibliotecario {
    private String nombre;
    private String rut;
    private String direccion;
    private String id;

    public Bibliotecario(String nombre, String rut, String direccion, String id){
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.id = id;
    }
    public Bibliotecario(){

    }

    public String getDireccion() {
        return this.direccion;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getId() {
        return this.id;
    }
    public String getRut() {
        return this.rut;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
}
