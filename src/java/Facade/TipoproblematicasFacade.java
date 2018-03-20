/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.Tipoproblematicas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Diego Leguizamon
 */
@Stateless
public class TipoproblematicasFacade extends AbstractFacade<Tipoproblematicas> {

    @PersistenceContext(unitName = "NUVIPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoproblematicasFacade() {
        super(Tipoproblematicas.class);
    }
    
}
