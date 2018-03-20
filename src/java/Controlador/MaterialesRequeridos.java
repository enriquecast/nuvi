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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "materiales_requeridos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MaterialesRequeridos.findAll", query = "SELECT m FROM MaterialesRequeridos m")
    , @NamedQuery(name = "MaterialesRequeridos.findByIdMatRequerido", query = "SELECT m FROM MaterialesRequeridos m WHERE m.idMatRequerido = :idMatRequerido")
    , @NamedQuery(name = "MaterialesRequeridos.findByNumCotizacion", query = "SELECT m FROM MaterialesRequeridos m WHERE m.numCotizacion = :numCotizacion")
    , @NamedQuery(name = "MaterialesRequeridos.findByFkProyecto", query = "SELECT m FROM MaterialesRequeridos m WHERE m.fkProyecto = :fkProyecto")
    , @NamedQuery(name = "MaterialesRequeridos.findByDetalle", query = "SELECT m FROM MaterialesRequeridos m WHERE m.detalle = :detalle")
    , @NamedQuery(name = "MaterialesRequeridos.findByImgCotizacion", query = "SELECT m FROM MaterialesRequeridos m WHERE m.imgCotizacion = :imgCotizacion")})
public class MaterialesRequeridos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMatRequerido")
    private Integer idMatRequerido;
    @Size(max = 45)
    @Column(name = "numCotizacion")
    private String numCotizacion;
    @Column(name = "fkProyecto")
    private Integer fkProyecto;
    @Size(max = 200)
    @Column(name = "detalle")
    private String detalle;
    @Size(max = 200)
    @Column(name = "imgCotizacion")
    private String imgCotizacion;

    public MaterialesRequeridos() {
    }

    public MaterialesRequeridos(Integer idMatRequerido) {
        this.idMatRequerido = idMatRequerido;
    }

    public Integer getIdMatRequerido() {
        return idMatRequerido;
    }

    public void setIdMatRequerido(Integer idMatRequerido) {
        this.idMatRequerido = idMatRequerido;
    }

    public String getNumCotizacion() {
        return numCotizacion;
    }

    public void setNumCotizacion(String numCotizacion) {
        this.numCotizacion = numCotizacion;
    }

    public Integer getFkProyecto() {
        return fkProyecto;
    }

    public void setFkProyecto(Integer fkProyecto) {
        this.fkProyecto = fkProyecto;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getImgCotizacion() {
        return imgCotizacion;
    }

    public void setImgCotizacion(String imgCotizacion) {
        this.imgCotizacion = imgCotizacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMatRequerido != null ? idMatRequerido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaterialesRequeridos)) {
            return false;
        }
        MaterialesRequeridos other = (MaterialesRequeridos) object;
        if ((this.idMatRequerido == null && other.idMatRequerido != null) || (this.idMatRequerido != null && !this.idMatRequerido.equals(other.idMatRequerido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.MaterialesRequeridos[ idMatRequerido=" + idMatRequerido + " ]";
    }
    
}
