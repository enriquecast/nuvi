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
@Table(name = "permisos_roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PermisosRoles.findAll", query = "SELECT p FROM PermisosRoles p")
    , @NamedQuery(name = "PermisosRoles.findByPkpermisosRoles", query = "SELECT p FROM PermisosRoles p WHERE p.pkpermisosRoles = :pkpermisosRoles")})
public class PermisosRoles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pkpermisosRoles")
    private Integer pkpermisosRoles;
    @JoinColumn(name = "fkRol", referencedColumnName = "idRol")
    @ManyToOne(optional = false)
    private Roles fkRol;
    @JoinColumn(name = "fkPermisos", referencedColumnName = "idPermisos")
    @ManyToOne(optional = false)
    private Permisos fkPermisos;

    public PermisosRoles() {
    }

    public PermisosRoles(Integer pkpermisosRoles) {
        this.pkpermisosRoles = pkpermisosRoles;
    }

    public Integer getPkpermisosRoles() {
        return pkpermisosRoles;
    }

    public void setPkpermisosRoles(Integer pkpermisosRoles) {
        this.pkpermisosRoles = pkpermisosRoles;
    }

    public Roles getFkRol() {
        return fkRol;
    }

    public void setFkRol(Roles fkRol) {
        this.fkRol = fkRol;
    }

    public Permisos getFkPermisos() {
        return fkPermisos;
    }

    public void setFkPermisos(Permisos fkPermisos) {
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
