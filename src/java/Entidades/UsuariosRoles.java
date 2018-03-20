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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "usuarios_roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuariosRoles.findAll", query = "SELECT u FROM UsuariosRoles u")
    , @NamedQuery(name = "UsuariosRoles.findByIdUsuariosRoles", query = "SELECT u FROM UsuariosRoles u WHERE u.idUsuariosRoles = :idUsuariosRoles")
    , @NamedQuery(name = "UsuariosRoles.findByFkUsuario", query = "SELECT u FROM UsuariosRoles u WHERE u.fkUsuario = :fkUsuario")
    , @NamedQuery(name = "UsuariosRoles.findByFkRol", query = "SELECT u FROM UsuariosRoles u WHERE u.fkRol = :fkRol")})
public class UsuariosRoles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUsuariosRoles")
    private Integer idUsuariosRoles;
    @Column(name = "fkUsuario")
    private Integer fkUsuario;
    @Column(name = "fkRol")
    private Integer fkRol;

    public UsuariosRoles() {
    }

    public UsuariosRoles(Integer idUsuariosRoles) {
        this.idUsuariosRoles = idUsuariosRoles;
    }

    public Integer getIdUsuariosRoles() {
        return idUsuariosRoles;
    }

    public void setIdUsuariosRoles(Integer idUsuariosRoles) {
        this.idUsuariosRoles = idUsuariosRoles;
    }

    public Integer getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(Integer fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    public Integer getFkRol() {
        return fkRol;
    }

    public void setFkRol(Integer fkRol) {
        this.fkRol = fkRol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuariosRoles != null ? idUsuariosRoles.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuariosRoles)) {
            return false;
        }
        UsuariosRoles other = (UsuariosRoles) object;
        if ((this.idUsuariosRoles == null && other.idUsuariosRoles != null) || (this.idUsuariosRoles != null && !this.idUsuariosRoles.equals(other.idUsuariosRoles))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.UsuariosRoles[ idUsuariosRoles=" + idUsuariosRoles + " ]";
    }
    
}
