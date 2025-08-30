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
    Libro l1 = LogisticaLibro.crear( ""