/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sjsu.hv.healthvision;

import edu.sjsu.hv.entitybeans.Doctors;
import edu.sjsu.hv.entitybeans.Patients;
import edu.sjsu.hv.txbeans.getDoctorBeanLocal;
import edu.sjsu.hv.txbeans.getPatientBeanLocal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jyothsna
 */
@WebService(serviceName = "HealthVision")
public class HealthVision {

    @EJB getDoctorBeanLocal     getdoc;
    @EJB getPatientBeanLocal    getpat;

    @WebMethod(operationName = "filterDoctors")
    public List<String> filterDoctors(@WebParam(name = "criteria") String criteria,
                                      @WebParam(name = "value") String value) {
        
        Collection<Doctors> docs = null;
        
        if ( criteria.equalsIgnoreCase("specialization")) {
            docs = getdoc.bySpecialization(value);
        } else if (criteria.equalsIgnoreCase("city")) {
            docs = getdoc.byCity(value);
        } else if (criteria.equalsIgnoreCase("zip")) {
            docs = getdoc.byZip(value);
        } else if (criteria.equalsIgnoreCase("status")) {
            docs = getdoc.byStatus(value);
        }
        
        List<String> doctors = new ArrayList<String>();
        for ( Doctors d : docs ) {
            String s = d.getFname() + "\t" + d.getLname();
            doctors.add(s);
        }
        
        return doctors;
    }
    
    @WebMethod(operationName = "filterPatients")
    public List<String> filterPatients(@WebParam(name = "criteria") String criteria,
                                       @WebParam(name = "value") String value) {
        
        Collection<Patients> pats = null;
        
        if ( criteria.equalsIgnoreCase("city")) {
            pats = getpat.byCity(value);
        } else if (criteria.equalsIgnoreCase("state")) {
            pats = getpat.byState(value);
        } else if (criteria.equalsIgnoreCase("zip")) {
            pats = getpat.byZip(value);
        } else if (criteria.equalsIgnoreCase("status")) {
            pats = getpat.byStatus(value);
        }
        
        List<String> patients = new ArrayList<String>();
        for ( Patients p : pats ) {
            String s = p.getFname() + "\t" + p.getLname();
            patients.add(s);
        }
        
        return patients;
    }
}
