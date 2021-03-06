package Modelo.Clases;
// Generated 22-may-2018 23:54:46 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Persona generated by hbm2java
 */
public class Persona  implements java.io.Serializable {


     private String rut;
     private String nombre;
     private String apellido;
     private Date nacimiento;
     private String email;
     private String telefono;
     private Set empresas = new HashSet(0);
     private Set usuarios = new HashSet(0);
     private Set comidas = new HashSet(0);
     private Set paises = new HashSet(0);
     private Set alojamientos = new HashSet(0);

    public Persona() {
    }

	
    public Persona(String rut, String nombre, String apellido, Date nacimiento) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
    }
    public Persona(String rut, String nombre, String apellido, Date nacimiento, String email, String telefono, Set empresas, Set usuarios, Set comidas, Set paises, Set alojamientos) {
       this.rut = rut;
       this.nombre = nombre;
       this.apellido = apellido;
       this.nacimiento = nacimiento;
       this.email = email;
       this.telefono = telefono;
       this.empresas = empresas;
       this.usuarios = usuarios;
       this.comidas = comidas;
       this.paises = paises;
       this.alojamientos = alojamientos;
    }
   
    public String getRut() {
        return this.rut;
    }
    
    public void setRut(String rut) {
        this.rut = rut;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Date getNacimiento() {
        return this.nacimiento;
    }
    
    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Set getEmpresas() {
        return this.empresas;
    }
    
    public void setEmpresas(Set empresas) {
        this.empresas = empresas;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }
    public Set getComidas() {
        return this.comidas;
    }
    
    public void setComidas(Set comidas) {
        this.comidas = comidas;
    }
    public Set getPaises() {
        return this.paises;
    }
    
    public void setPaises(Set paises) {
        this.paises = paises;
    }
    public Set getAlojamientos() {
        return this.alojamientos;
    }
    
    public void setAlojamientos(Set alojamientos) {
        this.alojamientos = alojamientos;
    }




}


