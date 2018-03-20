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
@Table(name = "tipoproblematicas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoproblematicas.findAll", query = "SELECT t FROM Tipoproblematicas t")
    , @NamedQuery(name = "Tipoproblematicas.findByIdTipoProblematica", query = "SELECT t FROM Tipoproblematicas t WHERE t.idTipoProblematica = :idTipoProblematica")
    , @NamedQuery(name = "Tipoproblematicas.findByTipoProblematica", query = "SELECT t FROM Tipoproblematicas t WHERE t.tipoProblematica = :tipoProblematica")
    , @NamedQuery(name = "Tipoproblematicas.findByDetalleProblematica", query = "SELECT t FROM Tipoproblematicas t WHERE t.detalleProblematica = :detalleProblematica")})
public class Tipoproblematicas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTipoProblematica")
    private Integer idTipoProblematica;
    @Size(max = 45)
    @Column(name = "tipoProblematica")
    private String tipoProblematica;
    @Size(max = 200)
    @Column(name = "detalleProblematica")
    private String detalleProblematica;

    public Tipoproblematicas() {
    }

    public Tipoproblematicas(Integer idTipoProblematica) {
        this.idTipoProblematica = idTipoProblematica;
    }

    public Integer getIdTipoProblematica() {
        return idTipoProblematica;
    }

    public void setIdTipoProblematica(Integer idTipoProblematica) {
        this.idTipoProblematica = idTipoProblematica;
    }

    public String getTipoProblematica() {
        return tipoProblematica;
    }

    public void setTipoProblematica(String tipoProblematica) {
        this.tipoProblematica = tipoProblematica;
    }

    public String getDetalleProblematica() {
        return detalleProblematica;
    }

    public void setDetalleProblematica(String detalleProblematica) {
        this.detalleProblematica = detalleProblematica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoProblematica != null ? idTipoProblematica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoproblematicas)) {
            return false;
        }
        Tipoproblematicas other = (Tipoproblematicas) object;
        if ((this.idTipoProblematica == null && other.idTipoProblematica != null) || (this.idTipoProblematica != null && !this.idTipoProblematica.equals(other.idTipoProblematica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Tipoproblematicas[ idTipoProblematica=" + idTipoProblematica + " ]";
    }
    
}
