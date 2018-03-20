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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "proyectos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proyectos.findAll", query = "SELECT p FROM Proyectos p")
    , @NamedQuery(name = "Proyectos.findByIdProyecto", query = "SELECT p FROM Proyectos p WHERE p.idProyecto = :idProyecto")
    , @NamedQuery(name = "Proyectos.findByNombreProyecto", query = "SELECT p FROM Proyectos p WHERE p.nombreProyecto = :nombreProyecto")
    , @NamedQuery(name = "Proyectos.findByFechaInicioProyecto", query = "SELECT p FROM Proyectos p WHERE p.fechaInicioProyecto = :fechaInicioProyecto")
    , @NamedQuery(name = "Proyectos.findByFechaFinProyecto", query = "SELECT p FROM Proyectos p WHERE p.fechaFinProyecto = :fechaFinProyecto")
    , @NamedQuery(name = "Proyectos.findByCostoMaterial", query = "SELECT p FROM Proyectos p WHERE p.costoMaterial = :costoMaterial")
    , @NamedQuery(name = "Proyectos.findByCostoPersonal", query = "SELECT p FROM Proyectos p WHERE p.costoPersonal = :costoPersonal")
    , @NamedQuery(name = "Proyectos.findByCostoProyecto", query = "SELECT p FROM Proyectos p WHERE p.costoProyecto = :costoProyecto")
    , @NamedQuery(name = "Proyectos.findByDineroRecaudado", query = "SELECT p FROM Proyectos p WHERE p.dineroRecaudado = :dineroRecaudado")
    , @NamedQuery(name = "Proyectos.findByDineroFaltante", query = "SELECT p FROM Proyectos p WHERE p.dineroFaltante = :dineroFaltante")
    , @NamedQuery(name = "Proyectos.findBySolucionProyecto", query = "SELECT p FROM Proyectos p WHERE p.solucionProyecto = :solucionProyecto")
    , @NamedQuery(name = "Proyectos.findByFkFamilia", query = "SELECT p FROM Proyectos p WHERE p.fkFamilia = :fkFamilia")
    , @NamedQuery(name = "Proyectos.findByEstado", query = "SELECT p FROM Proyectos p WHERE p.estado = :estado")})
public class Proyectos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProyecto")
    private Integer idProyecto;
    @Size(max = 45)
    @Column(name = "nombreProyecto")
    private String nombreProyecto;
    @Column(name = "fechaInicioProyecto")
    @Temporal(TemporalType.DATE)
    private Date fechaInicioProyecto;
    @Column(name = "fechaFinProyecto")
    @Temporal(TemporalType.DATE)
    private Date fechaFinProyecto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "costoMaterial")
    private Float costoMaterial;
    @Column(name = "costoPersonal")
    private Float costoPersonal;
    @Column(name = "costoProyecto")
    private Float costoProyecto;
    @Column(name = "dineroRecaudado")
    private Float dineroRecaudado;
    @Column(name = "dineroFaltante")
    private Float dineroFaltante;
    @Size(max = 1000)
    @Column(name = "solucionProyecto")
    private String solucionProyecto;
    @Column(name = "fkFamilia")
    private Integer fkFamilia;
    @Size(max = 13)
    @Column(name = "estado")
    private String estado;

    public Proyectos() {
    }

    public Proyectos(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public Date getFechaInicioProyecto() {
        return fechaInicioProyecto;
    }

    public void setFechaInicioProyecto(Date fechaInicioProyecto) {
        this.fechaInicioProyecto = fechaInicioProyecto;
    }

    public Date getFechaFinProyecto() {
        return fechaFinProyecto;
    }

    public void setFechaFinProyecto(Date fechaFinProyecto) {
        this.fechaFinProyecto = fechaFinProyecto;
    }

    public Float getCostoMaterial() {
        return costoMaterial;
    }

    public void setCostoMaterial(Float costoMaterial) {
        this.costoMaterial = costoMaterial;
    }

    public Float getCostoPersonal() {
        return costoPersonal;
    }

    public void setCostoPersonal(Float costoPersonal) {
        this.costoPersonal = costoPersonal;
    }

    public Float getCostoProyecto() {
        return costoProyecto;
    }

    public void setCostoProyecto(Float costoProyecto) {
        this.costoProyecto = costoProyecto;
    }

    public Float getDineroRecaudado() {
        return dineroRecaudado;
    }

    public void setDineroRecaudado(Float dineroRecaudado) {
        this.dineroRecaudado = dineroRecaudado;
    }

    public Float getDineroFaltante() {
        return dineroFaltante;
    }

    public void setDineroFaltante(Float dineroFaltante) {
        this.dineroFaltante = dineroFaltante;
    }

    public String getSolucionProyecto() {
        return solucionProyecto;
    }

    public void setSolucionProyecto(String solucionProyecto) {
        this.solucionProyecto = solucionProyecto;
    }

    public Integer getFkFamilia() {
        return fkFamilia;
    }

    public void setFkFamilia(Integer fkFamilia) {
        this.fkFamilia = fkFamilia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProyecto != null ? idProyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proyectos)) {
            return false;
        }
        Proyectos other = (Proyectos) object;
        if ((this.idProyecto == null && other.idProyecto != null) || (this.idProyecto != null && !this.idProyecto.equals(other.idProyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Proyectos[ idProyecto=" + idProyecto + " ]";
    }
    
}
