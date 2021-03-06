package entity;
// Generated 10-23-2016 11:08:44 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Empleado generated by hbm2java
 */
@Entity
@Table(name="EMPLEADO"
    ,schema="TOOUSER"
)
public class Empleado  implements java.io.Serializable {


     private BigDecimal codEmpleado;
     private Persona persona;
     private Clinica clinica;
     private Date fechaContratacion;
     private String puesto;
     private Set<Medico> medicos = new HashSet<Medico>(0);

    public Empleado() {
    }

	
    public Empleado(BigDecimal codEmpleado, Date fechaContratacion, String puesto) {
        this.codEmpleado = codEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.puesto = puesto;
    }
    public Empleado(BigDecimal codEmpleado, Persona persona, Clinica clinica, Date fechaContratacion, String puesto, Set<Medico> medicos) {
       this.codEmpleado = codEmpleado;
       this.persona = persona;
       this.clinica = clinica;
       this.fechaContratacion = fechaContratacion;
       this.puesto = puesto;
       this.medicos = medicos;
    }
   
     @Id 

    
    @Column(name="COD_EMPLEADO", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getCodEmpleado() {
        return this.codEmpleado;
    }
    
    public void setCodEmpleado(BigDecimal codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="COD_PERSONA")
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="COD_CLINICA")
    public Clinica getClinica() {
        return this.clinica;
    }
    
    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_CONTRATACION", nullable=false, length=7)
    public Date getFechaContratacion() {
        return this.fechaContratacion;
    }
    
    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    
    @Column(name="PUESTO", nullable=false, length=25)
    public String getPuesto() {
        return this.puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

@OneToMany(fetch=FetchType.EAGER, mappedBy="empleado")
    public Set<Medico> getMedicos() {
        return this.medicos;
    }
    
    public void setMedicos(Set<Medico> medicos) {
        this.medicos = medicos;
    }




}


