/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Diego Alejandro
 */
@Entity
@Table(name = "materiales_proyecto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MaterialesProyecto.findAll", query = "SELECT m FROM MaterialesProyecto m")
    , @NamedQuery(name = "MaterialesProyecto.findByIdMaterialCotizacion", query = "SELECT m FROM MaterialesProyecto m WHERE m.idMaterialCotizacion = :idMaterialCotizacion")
    , @NamedQuery(name = "MaterialesProyecto.findByCantidadMaterial", query = "SELECT m FROM MaterialesProyecto m WHERE m.cantidadMaterial = :cantidadMaterial")
    , @NamedQuery(name = "MaterialesProyecto.findByValorunitario", query = "SELECT m FROM MaterialesProyecto m WHERE m.valorunitario = :valorunitario")
    , @NamedQuery(name = "MaterialesProyecto.findByImporte", query = "SELECT m FROM MaterialesProyecto m WHERE m.importe = :importe")})
public class MaterialesProyecto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMaterialCotizacion")
    private Integer idMaterialCotizacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidadMaterial")
    private Float cantidadMaterial;
    @Column(name = "valorunitario")
    private Float valorunitario;
    @Column(name = "importe")
    private Float importe;
    @JoinColumn(name = "fkMaterial", referencedColumnName = "idMaterial")
    @ManyToOne
    private Materiales fkMaterial;
    @JoinColumn(name = "fkProyecto", referencedColumnName = "idProyecto")
    @ManyToOne
    private Proyectos fkProyecto;

    public MaterialesProyecto() {
    }

    public MaterialesProyecto(Integer idMaterialCotizacion) {
        this.idMaterialCotizacion = idMaterialCotizacion;
    }

    public Integer getIdMaterialCotizacion() {
        return idMaterialCotizacion;
    }

    public void setIdMaterialCotizacion(Integer idMaterialCotizacion) {
        this.idMaterialCotizacion = idMaterialCotizacion;
    }

    public Float getCantidadMaterial() {
        return cantidadMaterial;
    }

    public void setCantidadMaterial(Float cantidadMaterial) {
        this.cantidadMaterial = cantidadMaterial;
    }

    public Float getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(Float valorunitario) {
        this.valorunitario = valorunitario;
    }

    public Float getImporte() {
        return importe;
    }

    public void setImporte(Float importe) {
        this.importe = importe;
    }

    public Materiales getFkMaterial() {
        return fkMaterial;
    }

    public void setFkMaterial(Materiales fkMaterial) {
        this.fkMaterial = fkMaterial;
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
        hash += (idMaterialCotizacion != null ? idMaterialCotizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaterialesProyecto)) {
            return false;
        }
        MaterialesProyecto other = (MaterialesProyecto) object;
        if ((this.idMaterialCotizacion == null && other.idMaterialCotizacion != null) || (this.idMaterialCotizacion != null && !this.idMaterialCotizacion.equals(other.idMaterialCotizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.MaterialesProyecto[ idMaterialCotizacion=" + idMaterialCotizacion + " ]";
    }
    
}
