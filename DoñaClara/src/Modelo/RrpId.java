package Modelo;
// Generated 06-05-2018 17:41:07 by Hibernate Tools 4.3.1



/**
 * RrpId generated by hbm2java
 */
public class RrpId  implements java.io.Serializable {


     private long codigo;
     private short indice;

    public RrpId() {
    }

    public RrpId(long codigo, short indice) {
       this.codigo = codigo;
       this.indice = indice;
    }
   
    public long getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    public short getIndice() {
        return this.indice;
    }
    
    public void setIndice(short indice) {
        this.indice = indice;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RrpId) ) return false;
		 RrpId castOther = ( RrpId ) other; 
         
		 return (this.getCodigo()==castOther.getCodigo())
 && (this.getIndice()==castOther.getIndice());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getCodigo();
         result = 37 * result + this.getIndice();
         return result;
   }   


}


