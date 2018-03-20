
package Controlador;

import Entidades.Tipodocumentos;
import Facade.TipodocumentosFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;


@Named(value = "tipodocumentosControlador")
@SessionScoped
public class TipodocumentosControlador implements Serializable {

    public TipodocumentosControlador() {
    }
    
    @EJB
    
    TipodocumentosFacade tipodocumentosFacade;
    Tipodocumentos tipodocumentos = new Tipodocumentos();

    public Tipodocumentos getTipodocumentos() {
        return tipodocumentos;
    }

    public void setTipodocumentos(Tipodocumentos tipodocumentos) {
        this.tipodocumentos = tipodocumentos;
    }
    
    public List<Tipodocumentos> listarTipoDocumentos(){
        return tipodocumentosFacade.findAll();
    }
    
    public String registrarTipoDocumentos(){
        tipodocumentosFacade.create(tipodocumentos);
        tipodocumentos = new Tipodocumentos();
        return "listaTipoDocumentos";
    }
    
    public String ActualizarTipoDocumentos(Tipodocumentos objTdocumentos){
        tipodocumentos = objTdocumentos;
        return "listaTipoDocumentos";
    }
    
    public String editarTipoDocumentos(){
        tipodocumentosFacade.edit(tipodocumentos);
        return "listaTipoDocumentos";
    }
    
    public String eliminarTipoDocumentos(Tipodocumentos objTdocumentos){
        tipodocumentos = objTdocumentos;
        tipodocumentosFacade.remove(objTdocumentos);
        return "listaDocumentos";
    }
    
}
