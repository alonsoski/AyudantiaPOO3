package modelo;

public class Usuario {
    private String nombre;
    private String rut;
    private int numTel;

    public Usuario(String nombre, String rut, int num){
        this.nombre = nombre;
        this.rut = rut;
        this.numTel = num;
    }public Usuario(){

    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }
}
