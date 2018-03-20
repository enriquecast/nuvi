
package Controlador;

import Entidades.Proyectos;
import Facade.ProyectosFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;


@Named(value = "proyectosControlador")
@SessionScoped
public class ProyectosControlador implements Serializable {

    /**
     * Creates a new instance of ProyectosControlador
     */
    public ProyectosControlador() {
    }
    List<Proyectos> listaRequerimiento = new ArrayList();
    
    @EJB
    ProyectosFacade proyectosFacade;
    
    Proyectos proyectos = new Proyectos();

    public Proyectos getProyectos() {
        return proyectos;
    }

    public void setProyectos(Proyectos proyectos) {
        this.proyectos = proyectos;
    }
    
    public List<Proyectos> listarProyecto(){
        return proyectosFacade.findAll();
    }
    
    public String buscarRequerimientos(Proyectos listaRequerimiento){
        proyectos = listaRequerimiento;
        return "ListaProyectos";
    }
    
    
    
}
