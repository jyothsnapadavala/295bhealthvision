/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sjsu.hv.txbeans;

import edu.sjsu.hv.entitybeans.Patients;
import edu.sjsu.hv.entitybeans.Patients;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jyothsna
 */
@Stateless
public class getPatientBean implements getPatientBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @PersistenceContext
    private EntityManager em;   // for JPA management
    
    @Override
    public Collection<Patients> byCity(String value) {
        try {
            Query q = em.createNamedQuery("Patients.findByCity");
            q.setParameter("city", value);
            return (Collection<Patients>) q.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }
    
    @Override
    public Collection<Patients> byState(String value) {
        try {
            Query q = em.createNamedQuery("Patients.findByState");
            q.setParameter("state", value);
            return (Collection<Patients>) q.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }
    
    @Override
    public Collection<Patients> byZip(String value) {
        try {
            Query q = em.createNamedQuery("Patients.findByZip");
            q.setParameter("zip", value);
            return (Collection<Patients>) q.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }
    
    @Override
    public Collection<Patients> byStatus(String value) {
        try {
            Query q = em.createNamedQuery("Patients.findByStatus");
            q.setParameter("status", value);
            return (Collection<Patients>) q.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }

}
