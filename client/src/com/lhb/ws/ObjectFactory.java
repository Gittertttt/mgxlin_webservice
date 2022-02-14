
package com.lhb.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lhb.ws package. 
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

    private final static QName _Ws_QNAME = new QName("http://ws.lhb.com", "ws");
    private final static QName _WsResponse_QNAME = new QName("http://ws.lhb.com", "wsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lhb.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Ws }
     * 
     */
    public Ws createWs() {
        return new Ws();
    }

    /**
     * Create an instance of {@link WsResponse }
     * 
     */
    public WsResponse createWsResponse() {
        return new WsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ws }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.lhb.com", name = "ws")
    public JAXBElement<Ws> createWs(Ws value) {
        return new JAXBElement<Ws>(_Ws_QNAME, Ws.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.lhb.com", name = "wsResponse")
    public JAXBElement<WsResponse> createWsResponse(WsResponse value) {
        return new JAXBElement<WsResponse>(_WsResponse_QNAME, WsResponse.class, null, value);
    }

}
