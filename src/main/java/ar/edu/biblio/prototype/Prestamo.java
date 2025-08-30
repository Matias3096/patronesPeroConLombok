package ar.edu.biblio.prototype;
import ar.edu.biblio.model.Libro;
import ar.edu.biblio.builder.Usuario;
import java.time.LocalDate;

public class Prestamo implements Cloneable {
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaInicio, fechaFin;

    public Prestamo (Libro libro, Usuario usario, LocalDate ini, LocalDate fin){
        this.libro = libro;
        this.usuario = usuario;
        this.fechaInicio = ini;
        this.fechaFin = fin;
    }
    @Override public Prestamo clone(){
        try { return (Prestamo) super.clone();}
        catch (CloneNotSupportedException e){
            throw new RuntimeException(e);}
        }
    }
    public Prestamo conFin(LocalDate fin) {
        this.fechaFin = fin;

    }
}
