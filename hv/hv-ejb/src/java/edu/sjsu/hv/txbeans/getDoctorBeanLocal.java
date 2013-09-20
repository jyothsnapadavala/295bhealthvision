/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sjsu.hv.txbeans;

import edu.sjsu.hv.entitybeans.Doctors;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author jyothsna
 */
@Local
public interface getDoctorBeanLocal {
    
    Collection<Doctors> bySpecialization(String value);
    Collection<Doctors> byCity(String value);
    Collection<Doctors> byZip(String value);
    Collection<Doctors> byStatus(String value);
}
