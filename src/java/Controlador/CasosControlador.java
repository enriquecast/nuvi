/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Casos;
import Entidades.Usuarios;
import Facade.CasosFacade;
import Facade.UsuariosFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Diego Leguizamon
 */
@Named(value = "casosControlador")
@SessionScoped
public class CasosControlador implements Serializable {

    /**
     * Creates a new instance of CasosControlador
     */
    public CasosControlador() {
    }
    
    @EJB
    CasosFacade casosFacade;
    Casos casos = new Casos();
    
    @EJB
    UsuariosFacade usuariosFacade;
    Usuarios usuario = new Usuarios();

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }  
    
    public Casos getCasos() {
        return casos;
    }

    public void setCasos(Casos casos) {
        this.casos = casos;
    }
    
    public String registrarCaso(){
        //casos.setEstado(estadoFacade.find(est.getIdEstado()));
        casosFacade.create(casos);
        casos = new Casos();
        return "Lista";
    }
    
    public List<Casos> listarCasos(){
        return casosFacade.findAll();
    }
    
    public String asignarCaso(Casos objCasos){
        casos = objCasos;
        return "AsignacionCasos";
    }
    public String asignarCasoaTecnico(){
        casos.setFkUsuario(usuariosFacade.find(usuario.getIdUsuario()));
        casosFacade.edit(casos);
        return "RespuestaCasos";
    }
    
    public String resolverCaso(Casos objCaso){
        casos = objCaso;
        return "RespuestaCaso";
    }
    public String cargarRespuestaCaso(){
        casosFacade.edit(casos);
        return "RespuestaCasos";
    }
    
    public String cerrarCaso(){
        casosFacade.edit(casos);
        return "ListaCasos";
    }
}
