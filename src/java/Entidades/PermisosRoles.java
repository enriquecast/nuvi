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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "permisos_roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PermisosRoles.findAll", query = "SELECT p FROM PermisosRoles p")
    , @NamedQuery(name = "PermisosRoles.findByPkpermisosRoles", query = "SELECT p FROM PermisosRoles p WHERE p.pkpermisosRoles = :pkpermisosRoles")
    , @NamedQuery(name = "PermisosRoles.findByFkRol", query = "SELECT p FROM PermisosRoles p WHERE p.fkRol = :fkRol")
    , @NamedQuery(name = "PermisosRoles.findByFkPermisos", query = "SELECT p FROM PermisosRoles p WHERE p.fkPermisos = :fkPermisos")})
public class PermisosRoles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pkpermisosRoles")
    private Integer pkpermisosRoles;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fkRol")
    private int fkRol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fkPermisos")
    private int fkPermisos;

    public PermisosRoles() {
    }

    public PermisosRoles(Integer pkpermisosRoles) {
        this.pkpermisosRoles = pkpermisosRoles;
    }

    public PermisosRoles(Integer pkpermisosRoles, int fkRol, int fkPermisos) {
        this.pkpermisosRoles = pkpermisosRoles;
        this.fkRol = fkRol;
        this.fkPermisos = fkPermisos;
    }

    public Integer getPkpermisosRoles() {
        return pkpermisosRoles;
    }

    public void setPkpermisosRoles(Integer pkpermisosRoles) {
        this.pkpermisosRoles = pkpermisosRoles;
    }

    public int getFkRol() {
        return fkRol;
    }

    public void setFkRol(int fkRol) {
        this.fkRol = fkRol;
    }

    public int getFkPermisos() {
        return fkPermisos;
    }

    public void setFkPermisos(int fkPermisos) {
        this.fkPermisos = fkPermisos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkpermisosRoles != null ? pkpermisosRoles.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PermisosRoles)) {
            return false;
        }
        PermisosRoles other = (PermisosRoles) object;
        if ((this.pkpermisosRoles == null && other.pkpermisosRoles != null) || (this.pkpermisosRoles != null && !this.pkpermisosRoles.equals(other.pkpermisosRoles))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.PermisosRoles[ pkpermisosRoles=" + pkpermisosRoles + " ]";
    }
    
}
