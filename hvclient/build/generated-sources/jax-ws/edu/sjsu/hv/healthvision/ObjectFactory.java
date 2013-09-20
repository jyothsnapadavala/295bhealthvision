
package edu.sjsu.hv.healthvision;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.sjsu.hv.healthvision package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FilterPatientsResponse_QNAME = new QName("http://healthvision.hv.sjsu.edu/", "filterPatientsResponse");
    private final static QName _FilterPatients_QNAME = new QName("http://healthvision.hv.sjsu.edu/", "filterPatients");
    private final static QName _FilterDoctors_QNAME = new QName("http://healthvision.hv.sjsu.edu/", "filterDoctors");
    private final static QName _FilterDoctorsResponse_QNAME = new QName("http://healthvision.hv.sjsu.edu/", "filterDoctorsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.sjsu.hv.healthvision
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FilterDoctorsResponse }
     * 
     */
    public FilterDoctorsResponse createFilterDoctorsResponse() {
        return new FilterDoctorsResponse();
    }

    /**
     * Create an instance of {@link FilterDoctors }
     * 
     */
    public FilterDoctors createFilterDoctors() {
        return new FilterDoctors();
    }

    /**
     * Create an instance of {@link FilterPatients }
     * 
     */
    public FilterPatients createFilterPatients() {
        return new FilterPatients();
    }

    /**
     * Create an instance of {@link FilterPatientsResponse }
     * 
     */
    public FilterPatientsResponse createFilterPatientsResponse() {
        return new FilterPatientsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterPatientsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthvision.hv.sjsu.edu/", name = "filterPatientsResponse")
    public JAXBElement<FilterPatientsResponse> createFilterPatientsResponse(FilterPatientsResponse value) {
        return new JAXBElement<FilterPatientsResponse>(_FilterPatientsResponse_QNAME, FilterPatientsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterPatients }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthvision.hv.sjsu.edu/", name = "filterPatients")
    public JAXBElement<FilterPatients> createFilterPatients(FilterPatients value) {
        return new JAXBElement<FilterPatients>(_FilterPatients_QNAME, FilterPatients.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterDoctors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthvision.hv.sjsu.edu/", name = "filterDoctors")
    public JAXBElement<FilterDoctors> createFilterDoctors(FilterDoctors value) {
        return new JAXBElement<FilterDoctors>(_FilterDoctors_QNAME, FilterDoctors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterDoctorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthvision.hv.sjsu.edu/", name = "filterDoctorsResponse")
    public JAXBElement<FilterDoctorsResponse> createFilterDoctorsResponse(FilterDoctorsResponse value) {
        return new JAXBElement<FilterDoctorsResponse>(_FilterDoctorsResponse_QNAME, FilterDoctorsResponse.class, null, value);
    }

}
