/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Familias;
import Entidades.Proyectos;
import Entidades.Tipoproblematicas;
import Facade.FamiliasFacade;
import Facade.TipoproblematicasFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;

/**
 *
 * @author julieth
 */
@Named(value = "familiasControlador")
@SessionScoped
public class FamiliasControlador implements Serializable {

    /**
     * Creates a new instance of FamiliasControlador
     */
    public FamiliasControlador() {
    }
    
    //List<Tipoproblematicas> listaTipoproblematicas;
    List<Object[]> listadoTipoproblematicas;
    BarChartModel graficaBarras;
    List<Tipoproblematicas> listaTipoproblematica;
    
    @EJB
    FamiliasFacade familiasFacade;
    Familias familias = new Familias();
    
    @EJB
    TipoproblematicasFacade tipoproblematicasFacade;
    Tipoproblematicas tipoProblematicas = new Tipoproblematicas();
    
    Tipoproblematicas tipoproblematica = new Tipoproblematicas();
    
    /*public List<Tipoproblematicas> ListarTipoProblematicas(){
        return tipoproblematicasFacade.findAll();
    }*/

    public List<Tipoproblematicas> getListaTipoproblematica() {
        return listaTipoproblematica;
    }

    public void setListaTipoproblematica(List<Tipoproblematicas> listaTipoproblematica) {
        this.listaTipoproblematica = listaTipoproblematica;
    }

    public Tipoproblematicas getTipoproblematica() {
        return tipoproblematica;
    }

    public void setTipoproblematica(Tipoproblematicas tipoproblematica) {
        this.tipoproblematica = tipoproblematica;
    }
    
    

    /*public List<Tipoproblematicas> getListaTipoproblematicas() {
        return listaTipoproblematicas;
    }*/

    public BarChartModel getGraficaBarras() {
        return graficaBarras;
    }

    public void setGraficaBarras(BarChartModel graficaBarras) {
        this.graficaBarras = graficaBarras;
    }
    
    /*public void setListaTipoproblematicas(List<Tipoproblematicas> listaTipoproblematicas) {
        this.listaTipoproblematicas = listaTipoproblematicas;
    }*/

    public List<Object[]> getListadoTipoproblematicas() {
        return listadoTipoproblematicas;
    }

    public void setListadoTipoproblematicas(List<Object[]> listadoTipoproblematicas) {
        this.listadoTipoproblematicas = listadoTipoproblematicas;
    }

    public Familias getFamilias() {
        return familias;
    }

    public void setFamilias(Familias familias) {
        this.familias = familias;
    }

    public Tipoproblematicas getTipoProblematicas() {
        return tipoProblematicas;
    }

    public void setTipoProblematicas(Tipoproblematicas tipoProblematicas) {
        this.tipoProblematicas = tipoProblematicas;
    }
    
    @PostConstruct
    public void init(){
        listaTipoproblematica = new ArrayList();
    }
    
    
    public void cargarDatos(){
        listaTipoproblematica = new ArrayList<>();
        listadoTipoproblematicas = familiasFacade.graficarProblematica();
        
        for (Object[] elemento : listadoTipoproblematicas) {
            Tipoproblematicas tipoproblematica = new Tipoproblematicas();
            tipoproblematica.setTipoProblematica(elemento[0].toString());
            //tipoproblematica.setCantidad(Integer.parseInt(elemento[1].toString()));
            
            listaTipoproblematica.add(tipoproblematica);
        }
        graficarBarra(listaTipoproblematica);
    }
    
    
    public void graficarBarra(List<Tipoproblematicas> lista){
        graficaBarras = new BarChartModel();
        ChartSeries serie = new ChartSeries();
        serie.setLabel("Tipo Problematica");
        for (Tipoproblematicas tipoproblematica1 : lista) {
            //serie.set(tipoproblematica1.getTipoProblematica(), tipoproblematica1.getCantidad());
        }
        graficaBarras.addSeries(serie);
        graficaBarras.setTitle("Cantidad Problematicas");
        graficaBarras.setLegendPosition("e");
    }
    
}
