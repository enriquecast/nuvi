/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Materiales;
import Entidades.Proyectos;
import Facade.MaterialesFacade;
import Facade.ProyectosFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 *
 * @author Diego Leguizamon
 */
@Named(value = "materialControlador")
@SessionScoped
public class MaterialControlador implements Serializable {

    @EJB
    MaterialesFacade materialFacade;
    Materiales materiales = new Materiales();
    
    @EJB
    private ProyectosFacade proyectosFacade;
    private List<Object[]> listadoMateriales;
    
    @EJB
    Proyectos proyectos = new Proyectos();

    public List<Object[]> getListadoMateriales() {
        return listadoMateriales;
    }

    public void setListadoMateriales(List<Object[]> listadoMateriales) {
        this.listadoMateriales = listadoMateriales;
    }   

    public Materiales getMateriales() {
        return materiales;
    }

    public void setMateriales(Materiales materiales) {
        this.materiales = materiales;
    }
    public MaterialControlador() {
    }
    
    
    public String registrarMaterial(){
        materialFacade.create(materiales);
        materiales = new Materiales();
        return "ListaMateriales";
    }
    
    public List<Materiales> listarMateriales(){
        return materialFacade.findAll();
    }
    
    
    /*public void llenarTabla(Proyectos proyecto){
        listadoMateriales = proyectosFacade.listarMateriales(proyecto);
    }*/
    
}
