package entity;
// Generated 10-23-2016 01:47:09 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Rol generated by hbm2java
 */
@Entity
@Table(name="ROL"
    ,schema="TOOUSER"
)
public class Rol  implements java.io.Serializable {


     private BigDecimal codRol;
     private String nombre;
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);

    public Rol() {
    }

	
    public Rol(BigDecimal codRol, String nombre) {
        this.codRol = codRol;
        this.nombre = nombre;
    }
    public Rol(BigDecimal codRol, String nombre, Set<Usuario> usuarios) {
       this.codRol = codRol;
       this.nombre = nombre;
       this.usuarios = usuarios;
    }
   
     @Id 

    
    @Column(name="COD_ROL", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getCodRol() {
        return this.codRol;
    }
    
    public void setCodRol(BigDecimal codRol) {
        this.codRol = codRol;
    }

    
    @Column(name="NOMBRE", nullable=false, length=50)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="rol")
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }




}


