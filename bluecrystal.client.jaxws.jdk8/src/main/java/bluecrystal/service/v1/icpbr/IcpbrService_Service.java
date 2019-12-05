
package bluecrystal.service.v1.icpbr;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "icpbrService", targetNamespace = "http://icpbr.v1.service.bluecrystal/", wsdlLocation = "http://localhost:8080/bluc/serv/icpbr_1?wsdl")
public class IcpbrService_Service
    extends Service
{

    private final static URL ICPBRSERVICE_WSDL_LOCATION;
    private final static WebServiceException ICPBRSERVICE_EXCEPTION;
    private final static QName ICPBRSERVICE_QNAME = new QName("http://icpbr.v1.service.bluecrystal/", "icpbrService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/bluc/serv/icpbr_1?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ICPBRSERVICE_WSDL_LOCATION = url;
        ICPBRSERVICE_EXCEPTION = e;
    }

    public IcpbrService_Service() {
        super(__getWsdlLocation(), ICPBRSERVICE_QNAME);
    }

    public IcpbrService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ICPBRSERVICE_QNAME, features);
    }

    public IcpbrService_Service(URL wsdlLocation) {
        super(wsdlLocation, ICPBRSERVICE_QNAME);
    }

    public IcpbrService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ICPBRSERVICE_QNAME, features);
    }

    public IcpbrService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IcpbrService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IcpbrService
     */
    @WebEndpoint(name = "icpbrPort")
    public IcpbrService getIcpbrPort() {
        return super.getPort(new QName("http://icpbr.v1.service.bluecrystal/", "icpbrPort"), IcpbrService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IcpbrService
     */
    @WebEndpoint(name = "icpbrPort")
    public IcpbrService getIcpbrPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://icpbr.v1.service.bluecrystal/", "icpbrPort"), IcpbrService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ICPBRSERVICE_EXCEPTION!= null) {
            throw ICPBRSERVICE_EXCEPTION;
        }
        return ICPBRSERVICE_WSDL_LOCATION;
    }

}
