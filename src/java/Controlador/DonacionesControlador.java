
package Controlador;

import Entidades.Donaciones;
import Entidades.Proyectos;
import Entidades.Tipodocumentos;
import Facade.DonacionesFacade;
import Facade.ProyectosFacade;
import Facade.TipodocumentosFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;


@Named(value = "donacionesControlador")
@SessionScoped
public class DonacionesControlador implements Serializable {

    
    public DonacionesControlador() {
    }
    
    @EJB
    DonacionesFacade donacionesFacade;
    Donaciones donaciones = new Donaciones();
    
    @EJB
    ProyectosFacade proyectosFacade;
    Proyectos proyectos = new Proyectos();
    
    @EJB
    TipodocumentosFacade tipoDocumentosFacade;
    Tipodocumentos tipoDocumentos = new Tipodocumentos();

    public Tipodocumentos getTipoDocumentos() {
        return tipoDocumentos;
    }

    public void setTipoDocumentos(Tipodocumentos tipoDocumentos) {
        this.tipoDocumentos = tipoDocumentos;
    }
    
    public Donaciones getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(Donaciones donaciones) {
        this.donaciones = donaciones;
    }

    public Proyectos getProyectos() {
        return proyectos;
    }

    public void setProyectos(Proyectos proyectos) {
        this.proyectos = proyectos;
    }
    
        
    public String registrarDonacion(){
        donacionesFacade.create(donaciones);
        donaciones = new Donaciones();
        return "ListaDonacion";
    }
    
    public String asignarProyecto(Donaciones objDonaciones){
        donaciones = objDonaciones;
        return "ListasDonacion";
    }
    
    public List<Donaciones> listarDonacion(){
        return donacionesFacade.findAll();
    }
    
    public String actualizarDonacion(Donaciones objDonaciones){
        donaciones = objDonaciones;
        return "ActualizarDonacion";
    }
    
    public String editarDonacion(){
        //donaciones.setFkProyecto(proyectosFacade.find(proyectos.getIdProyecto()));
        donacionesFacade.edit(donaciones);
        return "ListaDonacion";
    }
    
    public String eliminarDonacion(){
        donacionesFacade.remove(donaciones);
        return "ListaDonacion";
    }
}
    


