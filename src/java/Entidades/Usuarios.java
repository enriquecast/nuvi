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
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u")
    , @NamedQuery(name = "Usuarios.findByIdUsuario", query = "SELECT u FROM Usuarios u WHERE u.idUsuario = :idUsuario")
    , @NamedQuery(name = "Usuarios.findByNombreUsuario", query = "SELECT u FROM Usuarios u WHERE u.nombreUsuario = :nombreUsuario")
    , @NamedQuery(name = "Usuarios.findByApellidoUsuario", query = "SELECT u FROM Usuarios u WHERE u.apellidoUsuario = :apellidoUsuario")
    , @NamedQuery(name = "Usuarios.findByFkTipoDocum", query = "SELECT u FROM Usuarios u WHERE u.fkTipoDocum = :fkTipoDocum")
    , @NamedQuery(name = "Usuarios.findByNDocumentoUsuario", query = "SELECT u FROM Usuarios u WHERE u.nDocumentoUsuario = :nDocumentoUsuario")
    , @NamedQuery(name = "Usuarios.findByPasswordUsuario", query = "SELECT u FROM Usuarios u WHERE u.passwordUsuario = :passwordUsuario")
    , @NamedQuery(name = "Usuarios.findByTelefonoUsuario", query = "SELECT u FROM Usuarios u WHERE u.telefonoUsuario = :telefonoUsuario")
    , @NamedQuery(name = "Usuarios.findByCorreoElectronico", query = "SELECT u FROM Usuarios u WHERE u.correoElectronico = :correoElectronico")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUsuario")
    private Integer idUsuario;
    @Size(max = 45)
    @Column(name = "nombreUsuario")
    private String nombreUsuario;
    @Size(max = 45)
    @Column(name = "apellidoUsuario")
    private String apellidoUsuario;
    @Column(name = "fkTipoDocum")
    private Integer fkTipoDocum;
    @Size(max = 45)
    @Column(name = "nDocumentoUsuario")
    private String nDocumentoUsuario;
    @Size(max = 45)
    @Column(name = "passwordUsuario")
    private String passwordUsuario;
    @Size(max = 45)
    @Column(name = "telefonoUsuario")
    private String telefonoUsuario;
    @Size(max = 45)
    @Column(name = "correoElectronico")
    private String correoElectronico;

    public Usuarios() {
    }

    public Usuarios(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public Integer getFkTipoDocum() {
        return fkTipoDocum;
    }

    public void setFkTipoDocum(Integer fkTipoDocum) {
        this.fkTipoDocum = fkTipoDocum;
    }

    public String getNDocumentoUsuario() {
        return nDocumentoUsuario;
    }

    public void setNDocumentoUsuario(String nDocumentoUsuario) {
        this.nDocumentoUsuario = nDocumentoUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Usuarios[ idUsuario=" + idUsuario + " ]";
    }
    
}
