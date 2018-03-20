/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "materiales_mat_requeridos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MaterialesMatRequeridos.findAll", query = "SELECT m FROM MaterialesMatRequeridos m")
    , @NamedQuery(name = "MaterialesMatRequeridos.findByIdMaterialCotizacion", query = "SELECT m FROM MaterialesMatRequeridos m WHERE m.idMaterialCotizacion = :idMaterialCotizacion")
    , @NamedQuery(name = "MaterialesMatRequeridos.findByFkMatRequeRido", query = "SELECT m FROM MaterialesMatRequeridos m WHERE m.fkMatRequeRido = :fkMatRequeRido")
    , @NamedQuery(name = "MaterialesMatRequeridos.findByFkMaterial", query = "SELECT m FROM MaterialesMatRequeridos m WHERE m.fkMaterial = :fkMaterial")
    , @NamedQuery(name = "MaterialesMatRequeridos.findByCantidadMaterial", query = "SELECT m FROM MaterialesMatRequeridos m WHERE m.cantidadMaterial = :cantidadMaterial")
    , @NamedQuery(name = "MaterialesMatRequeridos.findByValorunitario", query = "SELECT m FROM MaterialesMatRequeridos m WHERE m.valorunitario = :valorunitario")
    , @NamedQuery(name = "MaterialesMatRequeridos.findByImporte", query = "SELECT m FROM MaterialesMatRequeridos m WHERE m.importe = :importe")})
public class MaterialesMatRequeridos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMaterialCotizacion")
    private Integer idMaterialCotizacion;
    @Column(name = "fkMatRequeRido")
    private Integer fkMatRequeRido;
    @Column(name = "fkMaterial")
    private Integer fkMaterial;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantidadMaterial")
    private Float cantidadMaterial;
    @Column(name = "valorunitario")
    private Float valorunitario;
    @Column(name = "importe")
    private Float importe;

    public MaterialesMatRequeridos() {
    }

    public MaterialesMatRequeridos(Integer idMaterialCotizacion) {
        this.idMaterialCotizacion = idMaterialCotizacion;
    }

    public Integer getIdMaterialCotizacion() {
        return idMaterialCotizacion;
    }

    public void setIdMaterialCotizacion(Integer idMaterialCotizacion) {
        this.idMaterialCotizacion = idMaterialCotizacion;
    }

    public Integer getFkMatRequeRido() {
        return fkMatRequeRido;
    }

    public void setFkMatRequeRido(Integer fkMatRequeRido) {
        this.fkMatRequeRido = fkMatRequeRido;
    }

    public Integer getFkMaterial() {
        return fkMaterial;
    }

    public void setFkMaterial(Integer fkMaterial) {
        this.fkMaterial = fkMaterial;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMaterialCotizacion != null ? idMaterialCotizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaterialesMatRequeridos)) {
            return false;
        }
        MaterialesMatRequeridos other = (MaterialesMatRequeridos) object;
        if ((this.idMaterialCotizacion == null && other.idMaterialCotizacion != null) || (this.idMaterialCotizacion != null && !this.idMaterialCotizacion.equals(other.idMaterialCotizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.MaterialesMatRequeridos[ idMaterialCotizacion=" + idMaterialCotizacion + " ]";
    }
    
}
