
package bluecrystal.service.v1.rebuilder;

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
@WebServiceClient(name = "envelopeRebuilderService", targetNamespace = "http://rebuilder.v1.service.bluecrystal/", wsdlLocation = "http://localhost:8080/bluc/serv/rebuild_1?wsdl")
public class EnvelopeRebuilderService_Service
    extends Service
{

    private final static URL ENVELOPEREBUILDERSERVICE_WSDL_LOCATION;
    private final static WebServiceException ENVELOPEREBUILDERSERVICE_EXCEPTION;
    private final static QName ENVELOPEREBUILDERSERVICE_QNAME = new QName("http://rebuilder.v1.service.bluecrystal/", "envelopeRebuilderService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/bluc/serv/rebuild_1?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ENVELOPEREBUILDERSERVICE_WSDL_LOCATION = url;
        ENVELOPEREBUILDERSERVICE_EXCEPTION = e;
    }

    public EnvelopeRebuilderService_Service() {
        super(__getWsdlLocation(), ENVELOPEREBUILDERSERVICE_QNAME);
    }

    public EnvelopeRebuilderService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ENVELOPEREBUILDERSERVICE_QNAME, features);
    }

    public EnvelopeRebuilderService_Service(URL wsdlLocation) {
        super(wsdlLocation, ENVELOPEREBUILDERSERVICE_QNAME);
    }

    public EnvelopeRebuilderService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ENVELOPEREBUILDERSERVICE_QNAME, features);
    }

    public EnvelopeRebuilderService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EnvelopeRebuilderService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EnvelopeRebuilderService
     */
    @WebEndpoint(name = "envelopeRebuilderPort")
    public EnvelopeRebuilderService getEnvelopeRebuilderPort() {
        return super.getPort(new QName("http://rebuilder.v1.service.bluecrystal/", "envelopeRebuilderPort"), EnvelopeRebuilderService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EnvelopeRebuilderService
     */
    @WebEndpoint(name = "envelopeRebuilderPort")
    public EnvelopeRebuilderService getEnvelopeRebuilderPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://rebuilder.v1.service.bluecrystal/", "envelopeRebuilderPort"), EnvelopeRebuilderService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ENVELOPEREBUILDERSERVICE_EXCEPTION!= null) {
            throw ENVELOPEREBUILDERSERVICE_EXCEPTION;
        }
        return ENVELOPEREBUILDERSERVICE_WSDL_LOCATION;
    }

}
