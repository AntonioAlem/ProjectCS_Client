
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

    private final static QName _Exception_QNAME = new QName("http://server.insure.com/", "Exception");
    private final static QName _UserException_QNAME = new QName("http://server.insure.com/", "UserException");
    private final static QName _CreateAddDocument_QNAME = new QName("http://server.insure.com/", "createAddDocument");
    private final static QName _CreateAddDocumentResponse_QNAME = new QName("http://server.insure.com/", "createAddDocumentResponse");
    private final static QName _CreateClaim_QNAME = new QName("http://server.insure.com/", "createClaim");
    private final static QName _CreateClaimResponse_QNAME = new QName("http://server.insure.com/", "createClaimResponse");
    private final static QName _DeleteDocuments_QNAME = new QName("http://server.insure.com/", "deleteDocuments");
    private final static QName _DeleteDocumentsResponse_QNAME = new QName("http://server.insure.com/", "deleteDocumentsResponse");
    private final static QName _GetClaimFromID_QNAME = new QName("http://server.insure.com/", "getClaimFromID");
    private final static QName _GetClaimFromIDResponse_QNAME = new QName("http://server.insure.com/", "getClaimFromIDResponse");
    private final static QName _PrintClaim_QNAME = new QName("http://server.insure.com/", "printClaim");
    private final static QName _PrintClaimResponse_QNAME = new QName("http://server.insure.com/", "printClaimResponse");
    private final static QName _RetrieveDocuments_QNAME = new QName("http://server.insure.com/", "retrieveDocuments");
    private final static QName _RetrieveDocumentsResponse_QNAME = new QName("http://server.insure.com/", "retrieveDocumentsResponse");
    private final static QName _Size_QNAME = new QName("http://server.insure.com/", "size");
    private final static QName _SizeResponse_QNAME = new QName("http://server.insure.com/", "sizeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.insure.client.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link UserException }
     * 
     */
    public UserException createUserException() {
        return new UserException();
    }

    /**
     * Create an instance of {@link CreateAddDocument }
     * 
     */
    public CreateAddDocument createCreateAddDocument() {
        return new CreateAddDocument();
    }

    /**
     * Create an instance of {@link CreateAddDocumentResponse }
     * 
     */
    public CreateAddDocumentResponse createCreateAddDocumentResponse() {
        return new CreateAddDocumentResponse();
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
     * Create an instance of {@link DeleteDocuments }
     * 
     */
    public DeleteDocuments createDeleteDocuments() {
        return new DeleteDocuments();
    }

    /**
     * Create an instance of {@link DeleteDocumentsResponse }
     * 
     */
    public DeleteDocumentsResponse createDeleteDocumentsResponse() {
        return new DeleteDocumentsResponse();
    }

    /**
     * Create an instance of {@link GetClaimFromID }
     * 
     */
    public GetClaimFromID createGetClaimFromID() {
        return new GetClaimFromID();
    }

    /**
     * Create an instance of {@link GetClaimFromIDResponse }
     * 
     */
    public GetClaimFromIDResponse createGetClaimFromIDResponse() {
        return new GetClaimFromIDResponse();
    }

    /**
     * Create an instance of {@link PrintClaim }
     * 
     */
    public PrintClaim createPrintClaim() {
        return new PrintClaim();
    }

    /**
     * Create an instance of {@link PrintClaimResponse }
     * 
     */
    public PrintClaimResponse createPrintClaimResponse() {
        return new PrintClaimResponse();
    }

    /**
     * Create an instance of {@link RetrieveDocuments }
     * 
     */
    public RetrieveDocuments createRetrieveDocuments() {
        return new RetrieveDocuments();
    }

    /**
     * Create an instance of {@link RetrieveDocumentsResponse }
     * 
     */
    public RetrieveDocumentsResponse createRetrieveDocumentsResponse() {
        return new RetrieveDocumentsResponse();
    }

    /**
     * Create an instance of {@link Size }
     * 
     */
    public Size createSize() {
        return new Size();
    }

    /**
     * Create an instance of {@link SizeResponse }
     * 
     */
    public SizeResponse createSizeResponse() {
        return new SizeResponse();
    }

    /**
     * Create an instance of {@link Claim }
     * 
     */
    public Claim createClaim() {
        return new Claim();
    }

    /**
     * Create an instance of {@link AtomicInteger }
     * 
     */
    public AtomicInteger createAtomicInteger() {
        return new AtomicInteger();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserException }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "UserException")
    public JAXBElement<UserException> createUserException(UserException value) {
        return new JAXBElement<UserException>(_UserException_QNAME, UserException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAddDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAddDocument }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "createAddDocument")
    public JAXBElement<CreateAddDocument> createCreateAddDocument(CreateAddDocument value) {
        return new JAXBElement<CreateAddDocument>(_CreateAddDocument_QNAME, CreateAddDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAddDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAddDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "createAddDocumentResponse")
    public JAXBElement<CreateAddDocumentResponse> createCreateAddDocumentResponse(CreateAddDocumentResponse value) {
        return new JAXBElement<CreateAddDocumentResponse>(_CreateAddDocumentResponse_QNAME, CreateAddDocumentResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocuments }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteDocuments }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "deleteDocuments")
    public JAXBElement<DeleteDocuments> createDeleteDocuments(DeleteDocuments value) {
        return new JAXBElement<DeleteDocuments>(_DeleteDocuments_QNAME, DeleteDocuments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocumentsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteDocumentsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "deleteDocumentsResponse")
    public JAXBElement<DeleteDocumentsResponse> createDeleteDocumentsResponse(DeleteDocumentsResponse value) {
        return new JAXBElement<DeleteDocumentsResponse>(_DeleteDocumentsResponse_QNAME, DeleteDocumentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClaimFromID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClaimFromID }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "getClaimFromID")
    public JAXBElement<GetClaimFromID> createGetClaimFromID(GetClaimFromID value) {
        return new JAXBElement<GetClaimFromID>(_GetClaimFromID_QNAME, GetClaimFromID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClaimFromIDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClaimFromIDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "getClaimFromIDResponse")
    public JAXBElement<GetClaimFromIDResponse> createGetClaimFromIDResponse(GetClaimFromIDResponse value) {
        return new JAXBElement<GetClaimFromIDResponse>(_GetClaimFromIDResponse_QNAME, GetClaimFromIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintClaim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PrintClaim }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "printClaim")
    public JAXBElement<PrintClaim> createPrintClaim(PrintClaim value) {
        return new JAXBElement<PrintClaim>(_PrintClaim_QNAME, PrintClaim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintClaimResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PrintClaimResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "printClaimResponse")
    public JAXBElement<PrintClaimResponse> createPrintClaimResponse(PrintClaimResponse value) {
        return new JAXBElement<PrintClaimResponse>(_PrintClaimResponse_QNAME, PrintClaimResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDocuments }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveDocuments }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "retrieveDocuments")
    public JAXBElement<RetrieveDocuments> createRetrieveDocuments(RetrieveDocuments value) {
        return new JAXBElement<RetrieveDocuments>(_RetrieveDocuments_QNAME, RetrieveDocuments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDocumentsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveDocumentsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "retrieveDocumentsResponse")
    public JAXBElement<RetrieveDocumentsResponse> createRetrieveDocumentsResponse(RetrieveDocumentsResponse value) {
        return new JAXBElement<RetrieveDocumentsResponse>(_RetrieveDocumentsResponse_QNAME, RetrieveDocumentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Size }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Size }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "size")
    public JAXBElement<Size> createSize(Size value) {
        return new JAXBElement<Size>(_Size_QNAME, Size.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SizeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SizeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "sizeResponse")
    public JAXBElement<SizeResponse> createSizeResponse(SizeResponse value) {
        return new JAXBElement<SizeResponse>(_SizeResponse_QNAME, SizeResponse.class, null, value);
    }

}
