/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "donaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Donaciones.findAll", query = "SELECT d FROM Donaciones d")
    , @NamedQuery(name = "Donaciones.findByIdDonacion", query = "SELECT d FROM Donaciones d WHERE d.idDonacion = :idDonacion")
    , @NamedQuery(name = "Donaciones.findByNombreDonador", query = "SELECT d FROM Donaciones d WHERE d.nombreDonador = :nombreDonador")
    , @NamedQuery(name = "Donaciones.findByApellidoDonador", query = "SELECT d FROM Donaciones d WHERE d.apellidoDonador = :apellidoDonador")
    , @NamedQuery(name = "Donaciones.findByFkTipoDocum", query = "SELECT d FROM Donaciones d WHERE d.fkTipoDocum = :fkTipoDocum")
    , @NamedQuery(name = "Donaciones.findByNDocumentoDonador", query = "SELECT d FROM Donaciones d WHERE d.nDocumentoDonador = :nDocumentoDonador")
    , @NamedQuery(name = "Donaciones.findByNContactoDonador", query = "SELECT d FROM Donaciones d WHERE d.nContactoDonador = :nContactoDonador")
    , @NamedQuery(name = "Donaciones.findByEmailDonador", query = "SELECT d FROM Donaciones d WHERE d.emailDonador = :emailDonador")
    , @NamedQuery(name = "Donaciones.findByValorDonacion", query = "SELECT d FROM Donaciones d WHERE d.valorDonacion = :valorDonacion")
    , @NamedQuery(name = "Donaciones.findByFechaDonacion", query = "SELECT d FROM Donaciones d WHERE d.fechaDonacion = :fechaDonacion")
    , @NamedQuery(name = "Donaciones.findByDireccion", query = "SELECT d FROM Donaciones d WHERE d.direccion = :direccion")
    , @NamedQuery(name = "Donaciones.findByCiudad", query = "SELECT d FROM Donaciones d WHERE d.ciudad = :ciudad")
    , @NamedQuery(name = "Donaciones.findByFkProyecto", query = "SELECT d FROM Donaciones d WHERE d.fkProyecto = :fkProyecto")
    , @NamedQuery(name = "Donaciones.findByImgComporbante", query = "SELECT d FROM Donaciones d WHERE d.imgComporbante = :imgComporbante")})
public class Donaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDonacion")
    private Integer idDonacion;
    @Size(max = 45)
    @Column(name = "nombreDonador")
    private String nombreDonador;
    @Size(max = 45)
    @Column(name = "apellidoDonador")
    private String apellidoDonador;
    @Column(name = "fkTipoDocum")
    private Integer fkTipoDocum;
    @Size(max = 45)
    @Column(name = "nDocumentoDonador")
    private String nDocumentoDonador;
    @Size(max = 45)
    @Column(name = "nContactoDonador")
    private String nContactoDonador;
    @Size(max = 45)
    @Column(name = "emailDonador")
    private String emailDonador;
    @Column(name = "valorDonacion")
    private Integer valorDonacion;
    @Column(name = "fechaDonacion")
    @Temporal(TemporalType.DATE)
    private Date fechaDonacion;
    @Size(max = 30)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 30)
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "fkProyecto")
    private Integer fkProyecto;
    @Size(max = 45)
    @Column(name = "imgComporbante")
    private String imgComporbante;

    public Donaciones() {
    }

    public Donaciones(Integer idDonacion) {
        this.idDonacion = idDonacion;
    }

    public Integer getIdDonacion() {
        return idDonacion;
    }

    public void setIdDonacion(Integer idDonacion) {
        this.idDonacion = idDonacion;
    }

    public String getNombreDonador() {
        return nombreDonador;
    }

    public void setNombreDonador(String nombreDonador) {
        this.nombreDonador = nombreDonador;
    }

    public String getApellidoDonador() {
        return apellidoDonador;
    }

    public void setApellidoDonador(String apellidoDonador) {
        this.apellidoDonador = apellidoDonador;
    }

    public Integer getFkTipoDocum() {
        return fkTipoDocum;
    }

    public void setFkTipoDocum(Integer fkTipoDocum) {
        this.fkTipoDocum = fkTipoDocum;
    }

    public String getNDocumentoDonador() {
        return nDocumentoDonador;
    }

    public void setNDocumentoDonador(String nDocumentoDonador) {
        this.nDocumentoDonador = nDocumentoDonador;
    }

    public String getNContactoDonador() {
        return nContactoDonador;
    }

    public void setNContactoDonador(String nContactoDonador) {
        this.nContactoDonador = nContactoDonador;
    }

    public String getEmailDonador() {
        return emailDonador;
    }

    public void setEmailDonador(String emailDonador) {
        this.emailDonador = emailDonador;
    }

    public Integer getValorDonacion() {
        return valorDonacion;
    }

    public void setValorDonacion(Integer valorDonacion) {
        this.valorDonacion = valorDonacion;
    }

    public Date getFechaDonacion() {
        return fechaDonacion;
    }

    public void setFechaDonacion(Date fechaDonacion) {
        this.fechaDonacion = fechaDonacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getFkProyecto() {
        return fkProyecto;
    }

    public void setFkProyecto(Integer fkProyecto) {
        this.fkProyecto = fkProyecto;
    }

    public String getImgComporbante() {
        return imgComporbante;
    }

    public void setImgComporbante(String imgComporbante) {
        this.imgComporbante = imgComporbante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDonacion != null ? idDonacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Donaciones)) {
            return false;
        }
        Donaciones other = (Donaciones) object;
        if ((this.idDonacion == null && other.idDonacion != null) || (this.idDonacion != null && !this.idDonacion.equals(other.idDonacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Donaciones[ idDonacion=" + idDonacion + " ]";
    }
    
}
