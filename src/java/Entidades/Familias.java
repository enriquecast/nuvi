/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Diego Alejandro
 */
@Entity
@Table(name = "familias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Familias.findAll", query = "SELECT f FROM Familias f")
    , @NamedQuery(name = "Familias.findByIdFamilia", query = "SELECT f FROM Familias f WHERE f.idFamilia = :idFamilia")
    , @NamedQuery(name = "Familias.findByFechaVisita", query = "SELECT f FROM Familias f WHERE f.fechaVisita = :fechaVisita")
    , @NamedQuery(name = "Familias.findByNombreCdeFamilia", query = "SELECT f FROM Familias f WHERE f.nombreCdeFamilia = :nombreCdeFamilia")
    , @NamedQuery(name = "Familias.findByApellidoCdeFamilia", query = "SELECT f FROM Familias f WHERE f.apellidoCdeFamilia = :apellidoCdeFamilia")
    , @NamedQuery(name = "Familias.findByNDocumentoCdeFamilia", query = "SELECT f FROM Familias f WHERE f.nDocumentoCdeFamilia = :nDocumentoCdeFamilia")
    , @NamedQuery(name = "Familias.findByNIntegrantesFamilia", query = "SELECT f FROM Familias f WHERE f.nIntegrantesFamilia = :nIntegrantesFamilia")
    , @NamedQuery(name = "Familias.findByLocalidadFamilia", query = "SELECT f FROM Familias f WHERE f.localidadFamilia = :localidadFamilia")
    , @NamedQuery(name = "Familias.findByBarrioFamilia", query = "SELECT f FROM Familias f WHERE f.barrioFamilia = :barrioFamilia")
    , @NamedQuery(name = "Familias.findByDireccionFamilia", query = "SELECT f FROM Familias f WHERE f.direccionFamilia = :direccionFamilia")
    , @NamedQuery(name = "Familias.findByCiudadFamilia", query = "SELECT f FROM Familias f WHERE f.ciudadFamilia = :ciudadFamilia")})
public class Familias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFamilia")
    private Integer idFamilia;
    @Column(name = "fechaVisita")
    @Temporal(TemporalType.DATE)
    private Date fechaVisita;
    @Size(max = 45)
    @Column(name = "nombreCdeFamilia")
    private String nombreCdeFamilia;
    @Size(max = 45)
    @Column(name = "apellidoCdeFamilia")
    private String apellidoCdeFamilia;
    @Size(max = 45)
    @Column(name = "nDocumentoCdeFamilia")
    private String nDocumentoCdeFamilia;
    @Column(name = "nIntegrantesFamilia")
    private Integer nIntegrantesFamilia;
    @Column(name = "localidadFamilia")
    private Integer localidadFamilia;
    @Size(max = 45)
    @Column(name = "barrioFamilia")
    private String barrioFamilia;
    @Size(max = 45)
    @Column(name = "direccionFamilia")
    private String direccionFamilia;
    @Size(max = 45)
    @Column(name = "ciudadFamilia")
    private String ciudadFamilia;
    @JoinColumn(name = "fkTipoDocum", referencedColumnName = "pkTipoDocum")
    @ManyToOne
    private Tipodocumentos fkTipoDocum;
    @JoinColumn(name = "fkTipoProblematica", referencedColumnName = "idTipoProblematica")
    @ManyToOne
    private Tipoproblematicas fkTipoProblematica;
    @OneToMany(mappedBy = "fkFamilia")
    private List<Proyectos> proyectosList;

    public Familias() {
    }

    public Familias(Integer idFamilia) {
        this.idFamilia = idFamilia;
    }

    public Integer getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(Integer idFamilia) {
        this.idFamilia = idFamilia;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getNombreCdeFamilia() {
        return nombreCdeFamilia;
    }

    public void setNombreCdeFamilia(String nombreCdeFamilia) {
        this.nombreCdeFamilia = nombreCdeFamilia;
    }

    public String getApellidoCdeFamilia() {
        return apellidoCdeFamilia;
    }

    public void setApellidoCdeFamilia(String apellidoCdeFamilia) {
        this.apellidoCdeFamilia = apellidoCdeFamilia;
    }

    public String getNDocumentoCdeFamilia() {
        return nDocumentoCdeFamilia;
    }

    public void setNDocumentoCdeFamilia(String nDocumentoCdeFamilia) {
        this.nDocumentoCdeFamilia = nDocumentoCdeFamilia;
    }

    public Integer getNIntegrantesFamilia() {
        return nIntegrantesFamilia;
    }

    public void setNIntegrantesFamilia(Integer nIntegrantesFamilia) {
        this.nIntegrantesFamilia = nIntegrantesFamilia;
    }

    public Integer getLocalidadFamilia() {
        return localidadFamilia;
    }

    public void setLocalidadFamilia(Integer localidadFamilia) {
        this.localidadFamilia = localidadFamilia;
    }

    public String getBarrioFamilia() {
        return barrioFamilia;
    }

    public void setBarrioFamilia(String barrioFamilia) {
        this.barrioFamilia = barrioFamilia;
    }

    public String getDireccionFamilia() {
        return direccionFamilia;
    }

    public void setDireccionFamilia(String direccionFamilia) {
        this.direccionFamilia = direccionFamilia;
    }

    public String getCiudadFamilia() {
        return ciudadFamilia;
    }

    public void setCiudadFamilia(String ciudadFamilia) {
        this.ciudadFamilia = ciudadFamilia;
    }

    public Tipodocumentos getFkTipoDocum() {
        return fkTipoDocum;
    }

    public void setFkTipoDocum(Tipodocumentos fkTipoDocum) {
        this.fkTipoDocum = fkTipoDocum;
    }

    public Tipoproblematicas getFkTipoProblematica() {
        return fkTipoProblematica;
    }

    public void setFkTipoProblematica(Tipoproblematicas fkTipoProblematica) {
        this.fkTipoProblematica = fkTipoProblematica;
    }

    @XmlTransient
    public List<Proyectos> getProyectosList() {
        return proyectosList;
    }

    public void setProyectosList(List<Proyectos> proyectosList) {
        this.proyectosList = proyectosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFamilia != null ? idFamilia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Familias)) {
            return false;
        }
        Familias other = (Familias) object;
        if ((this.idFamilia == null && other.idFamilia != null) || (this.idFamilia != null && !this.idFamilia.equals(other.idFamilia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Familias[ idFamilia=" + idFamilia + " ]";
    }
    
}
