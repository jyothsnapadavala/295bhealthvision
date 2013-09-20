/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hvclient;

import edu.sjsu.hv.healthvision.HealthVision;
import edu.sjsu.hv.healthvision.HealthVision_Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jyothsna
 */
public class Main {

    /**
     * Constants
     */
    private static final String HV_SERVICE_WSDL_SUFFIX = "/hv-war/HealthVision?wsdl";

    public static void main(String[] args) throws MalformedURLException {
        if (args.length < 4) {
            System.err.println("\nUsage: java -jar hvclient.jar https://<host:port> <doctor|patient> <criteria> <search-value>\n");
            return;
        }

        // Get all parameters into variables
        String hostport = args[0];
        String filterfor = args[1];
        String criteria = args[2];
        String value = args[3];
        
        // Create URL
        String hosturl = hostport + HV_SERVICE_WSDL_SUFFIX;
        URL baseUrl = HealthVision_Service.class.getResource(".");
        URL url = new URL(baseUrl, hosturl);

        // Create EncryptionService and Encryption objects
        HealthVision_Service service = new HealthVision_Service(url);
        HealthVision port = service.getHealthVisionPort();

        // Identify what service we are calling and where
        System.out.println("\nCalling " + service.getServiceName().getLocalPart() + " at " + hostport + "...\n");
        
        // Make the call
        List<String> outlist = null;
        if ( filterfor.equalsIgnoreCase("patient")) {
            outlist = port.filterPatients(criteria, value);
        } else if ( filterfor.equalsIgnoreCase("doctor")) {
            outlist = port.filterDoctors(criteria, value);
        }
        
        // Display the result
        if (outlist != null) {
            System.out.println();
            Iterator<String> iterator = outlist.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }

}
