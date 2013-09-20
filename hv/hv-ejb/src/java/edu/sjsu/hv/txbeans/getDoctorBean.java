/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sjsu.hv.txbeans;

import edu.sjsu.hv.entitybeans.Doctors;
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
public class getDoctorBean implements getDoctorBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @PersistenceContext
    private EntityManager em;   // for JPA management
    
    @Override
    public Collection<Doctors> bySpecialization(String value) {
        try {
            Query q = em.createNamedQuery("Doctors.findBySpecialization");
            q.setParameter("specialization", value);
            return (Collection<Doctors>) q.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }
    
    @Override
    public Collection<Doctors> byCity(String value) {
        try {
            Query q = em.createNamedQuery("Doctors.findByCity");
            q.setParameter("city", value);
            return (Collection<Doctors>) q.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }
    
    @Override
    public Collection<Doctors> byZip(String value) {
        try {
            Query q = em.createNamedQuery("Doctors.findByZip");
            q.setParameter("zip", value);
            return (Collection<Doctors>) q.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }
    
    @Override
    public Collection<Doctors> byStatus(String value) {
        try {
            Query q = em.createNamedQuery("Doctors.findByStatus");
            q.setParameter("status", value);
            return (Collection<Doctors>) q.getResultList();
        } catch (NoResultException ex) {
            return null;
        }
    }
}
