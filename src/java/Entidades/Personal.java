/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Diego Alejandro
 */
@Entity
@Table(name = "personal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personal.findAll", query = "SELECT p FROM Personal p")
    , @NamedQuery(name = "Personal.findByIdPersonal", query = "SELECT p FROM Personal p WHERE p.idPersonal = :idPersonal")
    , @NamedQuery(name = "Personal.findByNombrePersonal", query = "SELECT p FROM Personal p WHERE p.nombrePersonal = :nombrePersonal")
    , @NamedQuery(name = "Personal.findByApellidoPersonal", query = "SELECT p FROM Personal p WHERE p.apellidoPersonal = :apellidoPersonal")
    , @NamedQuery(name = "Personal.findByProfesionPersonal", query = "SELECT p FROM Personal p WHERE p.profesionPersonal = :profesionPersonal")
    , @NamedQuery(name = "Personal.findByFechaNacimiento", query = "SELECT p FROM Personal p WHERE p.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Personal.findByCategoriaPersonal", query = "SELECT p FROM Personal p WHERE p.categoriaPersonal = :categoriaPersonal")
    , @NamedQuery(name = "Personal.findByNDocumentoPersonal", query = "SELECT p FROM Personal p WHERE p.nDocumentoPersonal = :nDocumentoPersonal")
    , @NamedQuery(name = "Personal.findByNContactoPersonal", query = "SELECT p FROM Personal p WHERE p.nContactoPersonal = :nContactoPersonal")
    , @NamedQuery(name = "Personal.findByEmailPersonal", query = "SELECT p FROM Personal p WHERE p.emailPersonal = :emailPersonal")
    , @NamedQuery(name = "Personal.findBySueldo", query = "SELECT p FROM Personal p WHERE p.sueldo = :sueldo")
    , @NamedQuery(name = "Personal.findByDisponibilidad", query = "SELECT p FROM Personal p WHERE p.disponibilidad = :disponibilidad")})
public class Personal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPersonal")
    private Integer idPersonal;
    @Size(max = 45)
    @Column(name = "nombrePersonal")
    private String nombrePersonal;
    @Size(max = 45)
    @Column(name = "apellidoPersonal")
    private String apellidoPersonal;
    @Size(max = 45)
    @Column(name = "profesionPersonal")
    private String profesionPersonal;
    @Column(name = "fechaNacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Size(max = 45)
    @Column(name = "categoriaPersonal")
    private String categoriaPersonal;
    @Size(max = 45)
    @Column(name = "nDocumentoPersonal")
    private String nDocumentoPersonal;
    @Size(max = 45)
    @Column(name = "nContactoPersonal")
    private String nContactoPersonal;
    @Size(max = 45)
    @Column(name = "emailPersonal")
    private String emailPersonal;
    @Column(name = "sueldo")
    private Integer sueldo;
    @Size(max = 19)
    @Column(name = "disponibilidad")
    private String disponibilidad;
    @JoinColumn(name = "fkTipoDocum", referencedColumnName = "pkTipoDocum")
    @ManyToOne
    private Tipodocumentos fkTipoDocum;
    @JoinColumn(name = "fkProyecto", referencedColumnName = "idProyecto")
    @ManyToOne
    private Proyectos fkProyecto;

    public Personal() {
    }

    public Personal(Integer idPersonal) {
        this.idPersonal = idPersonal;
    }

    public Integer getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(Integer idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getNombrePersonal() {
        return nombrePersonal;
    }

    public void setNombrePersonal(String nombrePersonal) {
        this.nombrePersonal = nombrePersonal;
    }

    public String getApellidoPersonal() {
        return apellidoPersonal;
    }

    public void setApellidoPersonal(String apellidoPersonal) {
        this.apellidoPersonal = apellidoPersonal;
    }

    public String getProfesionPersonal() {
        return profesionPersonal;
    }

    public void setProfesionPersonal(String profesionPersonal) {
        this.profesionPersonal = profesionPersonal;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCategoriaPersonal() {
        return categoriaPersonal;
    }

    public void setCategoriaPersonal(String categoriaPersonal) {
        this.categoriaPersonal = categoriaPersonal;
    }

    public String getNDocumentoPersonal() {
        return nDocumentoPersonal;
    }

    public void setNDocumentoPersonal(String nDocumentoPersonal) {
        this.nDocumentoPersonal = nDocumentoPersonal;
    }

    public String getNContactoPersonal() {
        return nContactoPersonal;
    }

    public void setNContactoPersonal(String nContactoPersonal) {
        this.nContactoPersonal = nContactoPersonal;
    }

    public String getEmailPersonal() {
        return emailPersonal;
    }

    public void setEmailPersonal(String emailPersonal) {
        this.emailPersonal = emailPersonal;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Tipodocumentos getFkTipoDocum() {
        return fkTipoDocum;
    }

    public void setFkTipoDocum(Tipodocumentos fkTipoDocum) {
        this.fkTipoDocum = fkTipoDocum;
    }

    public Proyectos getFkProyecto() {
        return fkProyecto;
    }

    public void setFkProyecto(Proyectos fkProyecto) {
        this.fkProyecto = fkProyecto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersonal != null ? idPersonal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personal)) {
            return false;
        }
        Personal other = (Personal) object;
        if ((this.idPersonal == null && other.idPersonal != null) || (this.idPersonal != null && !this.idPersonal.equals(other.idPersonal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Personal[ idPersonal=" + idPersonal + " ]";
    }
    
}
