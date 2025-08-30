package ar.edu.biblio.app;

import ar.edu.biblio.singleton.Database;
import ar.edu.biblio.factorymethod.LogisticaLibro;
import ar.edu.biblio.model.Libro;
import ar.edu.biblio.abstractfactory.*;
import ar.edu.biblio.builder.Usuario;
import ar.edu.biblio.prototype.Prestamo;

import java.time.LocalDate;

public class Main {
    public static void main (String [] args){
    //Factory Method y singleton
    Libro l1 = LogisticaLibro.crear("Fisico","Patrones creacionales");
    Database.getInstance().listarLibros().forEach(lib -> System.out.println("-" + lib.titulo()));

    //Abstract Factory
    UIFactory f = new UsuarioFactory();
    System.out.println(f.crearUI().render());
    System.out.println(f.crearEnvio().enviar(l1.titulo()));


    // para builder
    Usuario u = new Usuario.Builder().nombre("Ana").email("ana@ej.com").build();

    //Prototype
    Prestamo p1= new Prestamo (l1, u, LocalDate.now(), LocalDate.now().plusDays(7));
    Prestamo p2 = p1.clone().conFin(LocalDate.now().plusDays(14));
    System.out.println(p1);
    System.out .println(p2);

    }
}