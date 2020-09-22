
package com.mycompany.practicados.model;

import java.util.Objects;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Proveedor {

    @NotEmpty(message = "Este campo no puede estar vacío.")
    @NotNull(message = "Este campo no puede ser nulo.")
    private String codigo;
        
    @Size(min = 9, message="Este campo no puede estar vacio y debe tener 9 digitos.")
    @Size(max = 9, message="Este campo debe tener 9 digitos.")
    private String NIT;
    
    @NotEmpty(message = "Este campo no puede estar vacío.")
    @NotNull(message = "Este campo no puede ser nulo.")
    private String nombreComercial;
    
    @NotNull(message="Este campo no puede ser nulo.")
    @NotEmpty(message="Este campo no puede estar vacío.")
    private String direccion;
    
    private boolean eliminado;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Proveedor other = (Proveedor) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }    
    
    @Override
    public String toString() {
        return "Proveedor{" + "codigo=" + codigo + '}';
    }

}
