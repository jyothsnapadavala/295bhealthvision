
package edu.sjsu.hv.healthvision;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HealthVision", targetNamespace = "http://healthvision.hv.sjsu.edu/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HealthVision {


    /**
     * 
     * @param criteria
     * @param value
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "filterDoctors", targetNamespace = "http://healthvision.hv.sjsu.edu/", className = "edu.sjsu.hv.healthvision.FilterDoctors")
    @ResponseWrapper(localName = "filterDoctorsResponse", targetNamespace = "http://healthvision.hv.sjsu.edu/", className = "edu.sjsu.hv.healthvision.FilterDoctorsResponse")
    @Action(input = "http://healthvision.hv.sjsu.edu/HealthVision/filterDoctorsRequest", output = "http://healthvision.hv.sjsu.edu/HealthVision/filterDoctorsResponse")
    public List<String> filterDoctors(
        @WebParam(name = "criteria", targetNamespace = "")
        String criteria,
        @WebParam(name = "value", targetNamespace = "")
        String value);

    /**
     * 
     * @param criteria
     * @param value
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "filterPatients", targetNamespace = "http://healthvision.hv.sjsu.edu/", className = "edu.sjsu.hv.healthvision.FilterPatients")
    @ResponseWrapper(localName = "filterPatientsResponse", targetNamespace = "http://healthvision.hv.sjsu.edu/", className = "edu.sjsu.hv.healthvision.FilterPatientsResponse")
    @Action(input = "http://healthvision.hv.sjsu.edu/HealthVision/filterPatientsRequest", output = "http://healthvision.hv.sjsu.edu/HealthVision/filterPatientsResponse")
    public List<String> filterPatients(
        @WebParam(name = "criteria", targetNamespace = "")
        String criteria,
        @WebParam(name = "value", targetNamespace = "")
        String value);

}
