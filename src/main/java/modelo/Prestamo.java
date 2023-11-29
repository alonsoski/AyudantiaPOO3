package modelo;

import java.util.Date;

public class Prestamo {
    private Bibliotecario bibliotecario;
    private Usuario usuario;
    private Libro libro;
    private Date fInicio;
    private Date fTermino;
    public Prestamo(Bibliotecario bibiliotecario, Usuario usuario, Libro libro, Date fInicio, Date fTermino) {
        this.bibliotecario = bibiliotecario;
        this.usuario = usuario;
        this.libro = libro;
        this.fInicio = fInicio;
        this.fTermino = fTermino;
    }
    public Prestamo(){
    }
    public Bibliotecario getBibiliotecario() {
        return bibliotecario;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public Libro getLibro() {
        return libro;
    }
    public Date getfInicio() {
        return fInicio;
    }
    public Date getfTermino() {
        return fTermino;
    }
    public void setBibiliotecario(Bibliotecario bibiliotecario) {
        this.bibliotecario = bibiliotecario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public void setfInicio(Date fInicio) {
        this.fInicio = fInicio;
    }
    public void setfTermino(Date fTermino) {
        this.fTermino = fTermino;
    }

    @Override
    public String toString() {
        String retorno=this.bibliotecario+";"+this.usuario;
        return retorno;
    }
}
