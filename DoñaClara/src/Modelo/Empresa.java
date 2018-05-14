package Modelo;
// Generated 06-05-2018 17:41:07 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Empresa generated by hbm2java
 */
public class Empresa  implements java.io.Serializable {


     private String rut;
     private String razonSocial;
     private String rubro;
     private String email;
     private String telefono;
     private String logo;
     private Proveedor proveedor;
     private Set personas = new HashSet(0);
     private Cliente cliente;

    public Empresa() {
    }

	
    public Empresa(String rut, String razonSocial, String rubro) {
        this.rut = rut;
        this.razonSocial = razonSocial;
        this.rubro = rubro;
    }
    public Empresa(String rut, String razonSocial, String rubro, String email, String telefono, String logo, Proveedor proveedor, Set personas, Cliente cliente) {
       this.rut = rut;
       this.razonSocial = razonSocial;
       this.rubro = rubro;
       this.email = email;
       this.telefono = telefono;
       this.logo = logo;
       this.proveedor = proveedor;
       this.personas = personas;
       this.cliente = cliente;
    }
   
    public String getRut() {
        return this.rut;
    }
    
    public void setRut(String rut) {
        this.rut = rut;
    }
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getRubro() {
        return this.rubro;
    }
    
    public void setRubro(String rubro) {
        this.rubro = rubro;
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
    public String getLogo() {
        return this.logo;
    }
    
    public void setLogo(String logo) {
        this.logo = logo;
    }
    public Proveedor getProveedor() {
        return this.proveedor;
    }
    
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    public Set getPersonas() {
        return this.personas;
    }
    
    public void setPersonas(Set personas) {
        this.personas = personas;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }




}


