/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.Familias;
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
public class FamiliasFacade extends AbstractFacade<Familias> {

    @PersistenceContext(unitName = "NUVIPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FamiliasFacade() {
        super(Familias.class);
    }

    public List<Object[]> graficarProblematica() {
        Query q = em.createNativeQuery("SELECT tipoproblematicas.tipoProblematica, COUNT(*) as Cantidad\n"
                + "FROM FAMILIAS  JOIN tipoproblematicas \n"
                + "ON tipoproblematicas.idTipoProblematica= familias.fkTipoProblematica\n"
                + "GROUP BY tipoproblematicas.tipoProblematica;");
        List<Object[]> listadoFamilias = q.getResultList();
        return listadoFamilias;
    }

}
