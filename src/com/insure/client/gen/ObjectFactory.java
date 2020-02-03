
package com.insure.client.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.insure.client.gen package. 
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

    private final static QName _IDNotFoundException_QNAME = new QName("http://server.insure.com/", "IDNotFoundException");
    private final static QName _ClearDataStore_QNAME = new QName("http://server.insure.com/", "clearDataStore");
    private final static QName _ClearDataStoreResponse_QNAME = new QName("http://server.insure.com/", "clearDataStoreResponse");
    private final static QName _CreateClaim_QNAME = new QName("http://server.insure.com/", "createClaim");
    private final static QName _CreateClaimResponse_QNAME = new QName("http://server.insure.com/", "createClaimResponse");
    private final static QName _RetrieveClaim_QNAME = new QName("http://server.insure.com/", "retrieveClaim");
    private final static QName _RetrieveClaimResponse_QNAME = new QName("http://server.insure.com/", "retrieveClaimResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.insure.client.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IDNotFoundException }
     * 
     */
    public IDNotFoundException createIDNotFoundException() {
        return new IDNotFoundException();
    }

    /**
     * Create an instance of {@link ClearDataStore }
     * 
     */
    public ClearDataStore createClearDataStore() {
        return new ClearDataStore();
    }

    /**
     * Create an instance of {@link ClearDataStoreResponse }
     * 
     */
    public ClearDataStoreResponse createClearDataStoreResponse() {
        return new ClearDataStoreResponse();
    }

    /**
     * Create an instance of {@link CreateClaim }
     * 
     */
    public CreateClaim createCreateClaim() {
        return new CreateClaim();
    }

    /**
     * Create an instance of {@link CreateClaimResponse }
     * 
     */
    public CreateClaimResponse createCreateClaimResponse() {
        return new CreateClaimResponse();
    }

    /**
     * Create an instance of {@link RetrieveClaim }
     * 
     */
    public RetrieveClaim createRetrieveClaim() {
        return new RetrieveClaim();
    }

    /**
     * Create an instance of {@link RetrieveClaimResponse }
     * 
     */
    public RetrieveClaimResponse createRetrieveClaimResponse() {
        return new RetrieveClaimResponse();
    }

    /**
     * Create an instance of {@link Claim }
     * 
     */
    public Claim createClaim() {
        return new Claim();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDNotFoundException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IDNotFoundException }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "IDNotFoundException")
    public JAXBElement<IDNotFoundException> createIDNotFoundException(IDNotFoundException value) {
        return new JAXBElement<IDNotFoundException>(_IDNotFoundException_QNAME, IDNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearDataStore }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClearDataStore }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "clearDataStore")
    public JAXBElement<ClearDataStore> createClearDataStore(ClearDataStore value) {
        return new JAXBElement<ClearDataStore>(_ClearDataStore_QNAME, ClearDataStore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearDataStoreResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClearDataStoreResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "clearDataStoreResponse")
    public JAXBElement<ClearDataStoreResponse> createClearDataStoreResponse(ClearDataStoreResponse value) {
        return new JAXBElement<ClearDataStoreResponse>(_ClearDataStoreResponse_QNAME, ClearDataStoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClaim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateClaim }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "createClaim")
    public JAXBElement<CreateClaim> createCreateClaim(CreateClaim value) {
        return new JAXBElement<CreateClaim>(_CreateClaim_QNAME, CreateClaim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClaimResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateClaimResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "createClaimResponse")
    public JAXBElement<CreateClaimResponse> createCreateClaimResponse(CreateClaimResponse value) {
        return new JAXBElement<CreateClaimResponse>(_CreateClaimResponse_QNAME, CreateClaimResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveClaim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveClaim }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "retrieveClaim")
    public JAXBElement<RetrieveClaim> createRetrieveClaim(RetrieveClaim value) {
        return new JAXBElement<RetrieveClaim>(_RetrieveClaim_QNAME, RetrieveClaim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveClaimResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveClaimResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "retrieveClaimResponse")
    public JAXBElement<RetrieveClaimResponse> createRetrieveClaimResponse(RetrieveClaimResponse value) {
        return new JAXBElement<RetrieveClaimResponse>(_RetrieveClaimResponse_QNAME, RetrieveClaimResponse.class, null, value);
    }

}
