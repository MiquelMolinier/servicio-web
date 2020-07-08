
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _Hello_QNAME = new QName("http://services/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://services/", "helloResponse");
    private final static QName _TipoCambio_QNAME = new QName("http://services/", "tipoCambio");
    private final static QName _TipoCambioDate_QNAME = new QName("http://services/", "tipoCambioDate");
    private final static QName _TipoCambioDateResponse_QNAME = new QName("http://services/", "tipoCambioDateResponse");
    private final static QName _TipoCambioResponse_QNAME = new QName("http://services/", "tipoCambioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link TipoCambio }
     * 
     */
    public TipoCambio createTipoCambio() {
        return new TipoCambio();
    }

    /**
     * Create an instance of {@link TipoCambioDate }
     * 
     */
    public TipoCambioDate createTipoCambioDate() {
        return new TipoCambioDate();
    }

    /**
     * Create an instance of {@link TipoCambioDateResponse }
     * 
     */
    public TipoCambioDateResponse createTipoCambioDateResponse() {
        return new TipoCambioDateResponse();
    }

    /**
     * Create an instance of {@link TipoCambioResponse }
     * 
     */
    public TipoCambioResponse createTipoCambioResponse() {
        return new TipoCambioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoCambio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TipoCambio }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "tipoCambio")
    public JAXBElement<TipoCambio> createTipoCambio(TipoCambio value) {
        return new JAXBElement<TipoCambio>(_TipoCambio_QNAME, TipoCambio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoCambioDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TipoCambioDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "tipoCambioDate")
    public JAXBElement<TipoCambioDate> createTipoCambioDate(TipoCambioDate value) {
        return new JAXBElement<TipoCambioDate>(_TipoCambioDate_QNAME, TipoCambioDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoCambioDateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TipoCambioDateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "tipoCambioDateResponse")
    public JAXBElement<TipoCambioDateResponse> createTipoCambioDateResponse(TipoCambioDateResponse value) {
        return new JAXBElement<TipoCambioDateResponse>(_TipoCambioDateResponse_QNAME, TipoCambioDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoCambioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TipoCambioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "tipoCambioResponse")
    public JAXBElement<TipoCambioResponse> createTipoCambioResponse(TipoCambioResponse value) {
        return new JAXBElement<TipoCambioResponse>(_TipoCambioResponse_QNAME, TipoCambioResponse.class, null, value);
    }

}
