package Modelo.Clases;
// Generated 22-may-2018 23:54:46 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * PagoId generated by hbm2java
 */
public class PagoId  implements java.io.Serializable {


     private String tipoFactura;
     private BigDecimal numeroFactura;

    public PagoId() {
    }

    public PagoId(String tipoFactura, BigDecimal numeroFactura) {
       this.tipoFactura = tipoFactura;
       this.numeroFactura = numeroFactura;
    }
   
    public String getTipoFactura() {
        return this.tipoFactura;
    }
    
    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }
    public BigDecimal getNumeroFactura() {
        return this.numeroFactura;
    }
    
    public void setNumeroFactura(BigDecimal numeroFactura) {
        this.numeroFactura = numeroFactura;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PagoId) ) return false;
		 PagoId castOther = ( PagoId ) other; 
         
		 return ( (this.getTipoFactura()==castOther.getTipoFactura()) || ( this.getTipoFactura()!=null && castOther.getTipoFactura()!=null && this.getTipoFactura().equals(castOther.getTipoFactura()) ) )
 && ( (this.getNumeroFactura()==castOther.getNumeroFactura()) || ( this.getNumeroFactura()!=null && castOther.getNumeroFactura()!=null && this.getNumeroFactura().equals(castOther.getNumeroFactura()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTipoFactura() == null ? 0 : this.getTipoFactura().hashCode() );
         result = 37 * result + ( getNumeroFactura() == null ? 0 : this.getNumeroFactura().hashCode() );
         return result;
   }   


}


