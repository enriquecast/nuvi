/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Diego Alejandro
 */
@Entity
@Table(name = "tipodocumentos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipodocumentos.findAll", query = "SELECT t FROM Tipodocumentos t")
    , @NamedQuery(name = "Tipodocumentos.findByPkTipoDocum", query = "SELECT t FROM Tipodocumentos t WHERE t.pkTipoDocum = :pkTipoDocum")
    , @NamedQuery(name = "Tipodocumentos.findByNombreTipoDocum", query = "SELECT t FROM Tipodocumentos t WHERE t.nombreTipoDocum = :nombreTipoDocum")
    , @NamedQuery(name = "Tipodocumentos.findByDescripcion", query = "SELECT t FROM Tipodocumentos t WHERE t.descripcion = :descripcion")})
public class Tipodocumentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pkTipoDocum")
    private Integer pkTipoDocum;
    @Size(max = 10)
    @Column(name = "nombreTipoDocum")
    private String nombreTipoDocum;
    @Size(max = 200)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "fkTipoDocum")
    private List<Familias> familiasList;
    @OneToMany(mappedBy = "fkTipoDocum")
    private List<Personal> personalList;
    @OneToMany(mappedBy = "fkTipoDocum")
    private List<Usuarios> usuariosList;
    @OneToMany(mappedBy = "fkTipoDocum")
    private List<Donaciones> donacionesList;

    public Tipodocumentos() {
    }

    public Tipodocumentos(Integer pkTipoDocum) {
        this.pkTipoDocum = pkTipoDocum;
    }

    public Integer getPkTipoDocum() {
        return pkTipoDocum;
    }

    public void setPkTipoDocum(Integer pkTipoDocum) {
        this.pkTipoDocum = pkTipoDocum;
    }

    public String getNombreTipoDocum() {
        return nombreTipoDocum;
    }

    public void setNombreTipoDocum(String nombreTipoDocum) {
        this.nombreTipoDocum = nombreTipoDocum;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Familias> getFamiliasList() {
        return familiasList;
    }

    public void setFamiliasList(List<Familias> familiasList) {
        this.familiasList = familiasList;
    }

    @XmlTransient
    public List<Personal> getPersonalList() {
        return personalList;
    }

    public void setPersonalList(List<Personal> personalList) {
        this.personalList = personalList;
    }

    @XmlTransient
    public List<Usuarios> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<Usuarios> usuariosList) {
        this.usuariosList = usuariosList;
    }

    @XmlTransient
    public List<Donaciones> getDonacionesList() {
        return donacionesList;
    }

    public void setDonacionesList(List<Donaciones> donacionesList) {
        this.donacionesList = donacionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkTipoDocum != null ? pkTipoDocum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipodocumentos)) {
            return false;
        }
        Tipodocumentos other = (Tipodocumentos) object;
        if ((this.pkTipoDocum == null && other.pkTipoDocum != null) || (this.pkTipoDocum != null && !this.pkTipoDocum.equals(other.pkTipoDocum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Tipodocumentos[ pkTipoDocum=" + pkTipoDocum + " ]";
    }
    
}
