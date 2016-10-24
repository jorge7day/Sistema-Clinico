package entity;
// Generated 10-23-2016 11:08:44 PM by Hibernate Tools 4.3.1


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
 * Departamento generated by hbm2java
 */
@Entity
@Table(name="DEPARTAMENTO"
    ,schema="TOOUSER"
)
public class Departamento  implements java.io.Serializable {


     private BigDecimal codDepartamento;
     private String nombre;
     private Set<Persona> personas = new HashSet<Persona>(0);
     private Set<Municipio> municipios = new HashSet<Municipio>(0);
     private Set<Clinica> clinicas = new HashSet<Clinica>(0);

    public Departamento() {
    }

	
    public Departamento(BigDecimal codDepartamento) {
        this.codDepartamento = codDepartamento;
    }
    public Departamento(BigDecimal codDepartamento, String nombre, Set<Persona> personas, Set<Municipio> municipios, Set<Clinica> clinicas) {
       this.codDepartamento = codDepartamento;
       this.nombre = nombre;
       this.personas = personas;
       this.municipios = municipios;
       this.clinicas = clinicas;
    }
   
     @Id 

    
    @Column(name="COD_DEPARTAMENTO", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getCodDepartamento() {
        return this.codDepartamento;
    }
    
    public void setCodDepartamento(BigDecimal codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    
    @Column(name="NOMBRE", length=30)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="departamento")
    public Set<Persona> getPersonas() {
        return this.personas;
    }
    
    public void setPersonas(Set<Persona> personas) {
        this.personas = personas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="departamento")
    public Set<Municipio> getMunicipios() {
        return this.municipios;
    }
    
    public void setMunicipios(Set<Municipio> municipios) {
        this.municipios = municipios;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="departamento")
    public Set<Clinica> getClinicas() {
        return this.clinicas;
    }
    
    public void setClinicas(Set<Clinica> clinicas) {
        this.clinicas = clinicas;
    }




}


