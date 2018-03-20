
package Controlador;

import Entidades.Personal;
import Entidades.Proyectos;
import Entidades.Tipodocumentos;
import Facade.PersonalFacade;
import Facade.ProyectosFacade;
import Facade.TipodocumentosFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Diego Leguizamon
 */
@Named(value = "personalControlador")
@SessionScoped
public class PersonalControlador implements Serializable {


    public PersonalControlador() {
    }
    
    @EJB
    ProyectosFacade proyectosFacade;
    Proyectos proyectos = new Proyectos();
        
    @EJB 
    PersonalFacade personalFacade;
    Personal personal = new Personal();
    
    @EJB
    TipodocumentosFacade tipodocumentoFacade;
    Tipodocumentos tipodocumentos = new Tipodocumentos();

    public Proyectos getProyectos() {
        return proyectos;
    }

    public void setProyectos(Proyectos proyectos) {
        this.proyectos = proyectos;
    }

    public Tipodocumentos getTipodocumentos() {
        return tipodocumentos;
    }

    public void setTipodocumentos(Tipodocumentos tipodocumentos) {
        this.tipodocumentos = tipodocumentos;
    } 

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
    
    public String registrarPersonal(){
        personalFacade.create(personal);
        personal = new Personal();
        return "listaPersonal";
    }
    
    public List<Personal> listarPersonal(){
        return personalFacade.findAll();
    }
    
    public String actualizarPersonal(Personal objPersonal){
        personal = objPersonal;
        return "AsignarPersonal";
    }
    
    public String editarPersonal(){
        personal.setFkProyecto(proyectosFacade.find(proyectos.getIdProyecto()));
        personalFacade.edit(personal);
        return "listaPersonal";
    }
    
    public String eliminarPersonal(Personal objPersonal){
        personal = objPersonal;
        personalFacade.remove(personal);
        return "listaPersonal";
    }
    
}
