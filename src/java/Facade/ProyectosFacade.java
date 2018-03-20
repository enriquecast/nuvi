/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.Proyectos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Diego Leguizamon
 */
@Stateless
public class ProyectosFacade extends AbstractFacade<Proyectos> {

    @PersistenceContext(unitName = "NUVIPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProyectosFacade() {
        super(Proyectos.class);
    }

    public List listarMateriales(Proyectos objKey) {
        Query q = em.createNativeQuery("SELECT  PROYECTOS.nombreProyecto, MATERIALES.nombreMaterial, MATERIALES.unidadMedida, MATERIALES_PROYECTO.cantidadMaterial, MATERIALES_PROYECTO.valorUnitario, MATERIALES_PROYECTO.importe \n"
                + "FROM PROYECTOS \n"
                + "JOIN MATERIALES_PROYECTO ON MATERIALES_PROYECTO.fkProyecto= PROYECTOS.idProyecto\n"
                + "JOIN MATERIALES ON MATERIALES.idMaterial = MATERIALES_PROYECTO.fkMaterial\n"
                + "WHERE PROYECTOS.idProyecto = 1");
        
        
      //  q.setParameter("codProyecto", ObjKey.getIdProyecto());
        List <Object[]> listadoMateriales= q.getResultList();
        return listadoMateriales;
    }
}
