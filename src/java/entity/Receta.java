package entity;
// Generated 10-23-2016 11:08:44 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Receta generated by hbm2java
 */
@Entity
@Table(name="RECETA"
    ,schema="TOOUSER"
)
public class Receta  implements java.io.Serializable {


     private BigDecimal codReceta;
     private Date fecha;

    public Receta() {
    }

    public Receta(BigDecimal codReceta, Date fecha) {
       this.codReceta = codReceta;
       this.fecha = fecha;
    }
   
     @Id 

    
    @Column(name="COD_RECETA", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getCodReceta() {
        return this.codReceta;
    }
    
    public void setCodReceta(BigDecimal codReceta) {
        this.codReceta = codReceta;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA", nullable=false, length=7)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }




}


