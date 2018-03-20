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
@Table(name = "casos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Casos.findAll", query = "SELECT c FROM Casos c")
    , @NamedQuery(name = "Casos.findByIdCaso", query = "SELECT c FROM Casos c WHERE c.idCaso = :idCaso")
    , @NamedQuery(name = "Casos.findByNombreUsuario", query = "SELECT c FROM Casos c WHERE c.nombreUsuario = :nombreUsuario")
    , @NamedQuery(name = "Casos.findByEmailUsuario", query = "SELECT c FROM Casos c WHERE c.emailUsuario = :emailUsuario")
    , @NamedQuery(name = "Casos.findByDetalleProblema", query = "SELECT c FROM Casos c WHERE c.detalleProblema = :detalleProblema")
    , @NamedQuery(name = "Casos.findByDetalleSoluci\u00f3n", query = "SELECT c FROM Casos c WHERE c.detalleSoluci\u00f3n = :detalleSoluci\u00f3n")
    , @NamedQuery(name = "Casos.findByEstadoCaso", query = "SELECT c FROM Casos c WHERE c.estadoCaso = :estadoCaso")
    , @NamedQuery(name = "Casos.findByFkUsuario", query = "SELECT c FROM Casos c WHERE c.fkUsuario = :fkUsuario")
    , @NamedQuery(name = "Casos.findByCalificacion", query = "SELECT c FROM Casos c WHERE c.calificacion = :calificacion")})
public class Casos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCaso")
    private Integer idCaso;
    @Size(max = 45)
    @Column(name = "nombreUsuario")
    private String nombreUsuario;
    @Size(max = 45)
    @Column(name = "EmailUsuario")
    private String emailUsuario;
    @Size(max = 300)
    @Column(name = "DetalleProblema")
    private String detalleProblema;
    @Size(max = 300)
    @Column(name = "DetalleSoluci\u00f3n")
    private String detalleSolución;
    @Size(max = 15)
    @Column(name = "EstadoCaso")
    private String estadoCaso;
    @Column(name = "fkUsuario")
    private Integer fkUsuario;
    @Size(max = 2)
    @Column(name = "calificacion")
    private String calificacion;

    public Casos() {
    }

    public Casos(Integer idCaso) {
        this.idCaso = idCaso;
    }

    public Integer getIdCaso() {
        return idCaso;
    }

    public void setIdCaso(Integer idCaso) {
        this.idCaso = idCaso;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getDetalleProblema() {
        return detalleProblema;
    }

    public void setDetalleProblema(String detalleProblema) {
        this.detalleProblema = detalleProblema;
    }

    public String getDetalleSolución() {
        return detalleSolución;
    }

    public void setDetalleSolución(String detalleSolución) {
        this.detalleSolución = detalleSolución;
    }

    public String getEstadoCaso() {
        return estadoCaso;
    }

    public void setEstadoCaso(String estadoCaso) {
        this.estadoCaso = estadoCaso;
    }

    public Integer getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(Integer fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCaso != null ? idCaso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Casos)) {
            return false;
        }
        Casos other = (Casos) object;
        if ((this.idCaso == null && other.idCaso != null) || (this.idCaso != null && !this.idCaso.equals(other.idCaso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Casos[ idCaso=" + idCaso + " ]";
    }
    
}
