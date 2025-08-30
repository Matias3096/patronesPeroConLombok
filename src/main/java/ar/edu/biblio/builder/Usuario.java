package ar.edu.biblio.builder;
import ar.edu.biblio.abstractfactory.UsuarioFactory;
import lombok.Builder;

import java.time.LocalDate;
import java.util.Locale;

public class Usuario {
    private final String nombre, email, direccion,telefono;
    private final LocalDate fechaNacimiento;

    private Usuario(Builder b){
        this.nombre = b.nombre;
        this.email = b.email;
        this.direccion = b.direccion;
        this.telefono = b.telefono;
        this.telefono = b.fechaNacimiento;
    }
    public String toString{
        return  "Usuario{" + nombre + "," + email + "," + direccion +"," + telefono + "," +fechaNacimiento + "}";
    }
    public static class Builder{
        private String nombre, email, direccion, telefono;
        private LocalDate fechaNacimiento;

        public Builder nombre(String v) {
            this.nombre = v;
            return this;
        }
        public Builder email(String v){
            this.email = v;
            return this;
        }
        public Builder direccion(String v){
            this.direccion = v;
            return this;
        }
        public Builder telefono(String v){
            this.telefono = v;
            return this;
        }
        public Builder fechaNacimiento(LocalDate v){
            this.fechaNacimiento = v;
            return this;
        }
        public Usuario build (){
            return new Usuario(this);
        }
    }
}
