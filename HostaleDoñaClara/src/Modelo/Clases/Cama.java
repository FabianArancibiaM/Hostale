package Modelo.Clases;
// Generated 22-may-2018 23:54:46 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Cama generated by hbm2java
 */
public class Cama  implements java.io.Serializable {


     private BigDecimal codigo;
     private Habitacion habitacion;
     private String descripcion;
     private String disponible;
     private Set alojamientos = new HashSet(0);

    public Cama() {
    }

	
    public Cama(BigDecimal codigo, Habitacion habitacion, String descripcion, String disponible) {
        this.codigo = codigo;
        this.habitacion = habitacion;
        this.descripcion = descripcion;
        this.disponible = disponible;
    }
    public Cama(BigDecimal codigo, Habitacion habitacion, String descripcion, String disponible, Set alojamientos) {
       this.codigo = codigo;
       this.habitacion = habitacion;
       this.descripcion = descripcion;
       this.disponible = disponible;
       this.alojamientos = alojamientos;
    }
   
    public BigDecimal getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }
    public Habitacion getHabitacion() {
        return this.habitacion;
    }
    
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDisponible() {
        return this.disponible;
    }
    
    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }
    public Set getAlojamientos() {
        return this.alojamientos;
    }
    
    public void setAlojamientos(Set alojamientos) {
        this.alojamientos = alojamientos;
    }




}


