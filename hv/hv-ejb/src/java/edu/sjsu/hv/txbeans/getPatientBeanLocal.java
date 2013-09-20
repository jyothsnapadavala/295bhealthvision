/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sjsu.hv.txbeans;

import edu.sjsu.hv.entitybeans.Patients;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author jyothsna
 */
@Local
public interface getPatientBeanLocal {
    
    Collection<Patients> byState(String value);
    Collection<Patients> byCity(String value);
    Collection<Patients> byZip(String value);
    Collection<Patients> byStatus(String value);
}
