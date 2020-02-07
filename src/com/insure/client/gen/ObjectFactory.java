
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
    private final static QName _CreateAddDocumentClient_QNAME = new QName("http://server.insure.com/", "createAddDocumentClient");
    private final static QName _CreateAddDocumentClientResponse_QNAME = new QName("http://server.insure.com/", "createAddDocumentClientResponse");
    private final static QName _CreateAddDocumentOfficer_QNAME = new QName("http://server.insure.com/", "createAddDocumentOfficer");
    private final static QName _CreateAddDocumentOfficerResponse_QNAME = new QName("http://server.insure.com/", "createAddDocumentOfficerResponse");
    private final static QName _CreateClaim_QNAME = new QName("http://server.insure.com/", "createClaim");
    private final static QName _CreateClaimResponse_QNAME = new QName("http://server.insure.com/", "createClaimResponse");
    private final static QName _DeleteDocumentsClient_QNAME = new QName("http://server.insure.com/", "deleteDocumentsClient");
    private final static QName _DeleteDocumentsClientResponse_QNAME = new QName("http://server.insure.com/", "deleteDocumentsClientResponse");
    private final static QName _DeleteDocumentsOfficer_QNAME = new QName("http://server.insure.com/", "deleteDocumentsOfficer");
    private final static QName _DeleteDocumentsOfficerResponse_QNAME = new QName("http://server.insure.com/", "deleteDocumentsOfficerResponse");
    private final static QName _GetClaimFromID_QNAME = new QName("http://server.insure.com/", "getClaimFromID");
    private final static QName _GetClaimFromIDResponse_QNAME = new QName("http://server.insure.com/", "getClaimFromIDResponse");
    private final static QName _GetDocFromClaim_QNAME = new QName("http://server.insure.com/", "getDocFromClaim");
    private final static QName _GetDocFromClaimResponse_QNAME = new QName("http://server.insure.com/", "getDocFromClaimResponse");
    private final static QName _PrintClaim_QNAME = new QName("http://server.insure.com/", "printClaim");
    private final static QName _PrintClaimResponse_QNAME = new QName("http://server.insure.com/", "printClaimResponse");
    private final static QName _RetrieveDocumentsClient_QNAME = new QName("http://server.insure.com/", "retrieveDocumentsClient");
    private final static QName _RetrieveDocumentsClientResponse_QNAME = new QName("http://server.insure.com/", "retrieveDocumentsClientResponse");
    private final static QName _RetrieveDocumentsOfficer_QNAME = new QName("http://server.insure.com/", "retrieveDocumentsOfficer");
    private final static QName _RetrieveDocumentsOfficerResponse_QNAME = new QName("http://server.insure.com/", "retrieveDocumentsOfficerResponse");
    private final static QName _Size_QNAME = new QName("http://server.insure.com/", "size");
    private final static QName _SizeResponse_QNAME = new QName("http://server.insure.com/", "sizeResponse");
    private final static QName _UpdateDocumentClient_QNAME = new QName("http://server.insure.com/", "updateDocumentClient");
    private final static QName _UpdateDocumentClientResponse_QNAME = new QName("http://server.insure.com/", "updateDocumentClientResponse");
    private final static QName _UpdateDocumentOfficer_QNAME = new QName("http://server.insure.com/", "updateDocumentOfficer");
    private final static QName _UpdateDocumentOfficerResponse_QNAME = new QName("http://server.insure.com/", "updateDocumentOfficerResponse");

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
     * Create an instance of {@link CreateAddDocumentClient }
     * 
     */
    public CreateAddDocumentClient createCreateAddDocumentClient() {
        return new CreateAddDocumentClient();
    }

    /**
     * Create an instance of {@link CreateAddDocumentClientResponse }
     * 
     */
    public CreateAddDocumentClientResponse createCreateAddDocumentClientResponse() {
        return new CreateAddDocumentClientResponse();
    }

    /**
     * Create an instance of {@link CreateAddDocumentOfficer }
     * 
     */
    public CreateAddDocumentOfficer createCreateAddDocumentOfficer() {
        return new CreateAddDocumentOfficer();
    }

    /**
     * Create an instance of {@link CreateAddDocumentOfficerResponse }
     * 
     */
    public CreateAddDocumentOfficerResponse createCreateAddDocumentOfficerResponse() {
        return new CreateAddDocumentOfficerResponse();
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
     * Create an instance of {@link DeleteDocumentsClient }
     * 
     */
    public DeleteDocumentsClient createDeleteDocumentsClient() {
        return new DeleteDocumentsClient();
    }

    /**
     * Create an instance of {@link DeleteDocumentsClientResponse }
     * 
     */
    public DeleteDocumentsClientResponse createDeleteDocumentsClientResponse() {
        return new DeleteDocumentsClientResponse();
    }

    /**
     * Create an instance of {@link DeleteDocumentsOfficer }
     * 
     */
    public DeleteDocumentsOfficer createDeleteDocumentsOfficer() {
        return new DeleteDocumentsOfficer();
    }

    /**
     * Create an instance of {@link DeleteDocumentsOfficerResponse }
     * 
     */
    public DeleteDocumentsOfficerResponse createDeleteDocumentsOfficerResponse() {
        return new DeleteDocumentsOfficerResponse();
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
     * Create an instance of {@link GetDocFromClaim }
     * 
     */
    public GetDocFromClaim createGetDocFromClaim() {
        return new GetDocFromClaim();
    }

    /**
     * Create an instance of {@link GetDocFromClaimResponse }
     * 
     */
    public GetDocFromClaimResponse createGetDocFromClaimResponse() {
        return new GetDocFromClaimResponse();
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
     * Create an instance of {@link RetrieveDocumentsClient }
     * 
     */
    public RetrieveDocumentsClient createRetrieveDocumentsClient() {
        return new RetrieveDocumentsClient();
    }

    /**
     * Create an instance of {@link RetrieveDocumentsClientResponse }
     * 
     */
    public RetrieveDocumentsClientResponse createRetrieveDocumentsClientResponse() {
        return new RetrieveDocumentsClientResponse();
    }

    /**
     * Create an instance of {@link RetrieveDocumentsOfficer }
     * 
     */
    public RetrieveDocumentsOfficer createRetrieveDocumentsOfficer() {
        return new RetrieveDocumentsOfficer();
    }

    /**
     * Create an instance of {@link RetrieveDocumentsOfficerResponse }
     * 
     */
    public RetrieveDocumentsOfficerResponse createRetrieveDocumentsOfficerResponse() {
        return new RetrieveDocumentsOfficerResponse();
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
     * Create an instance of {@link UpdateDocumentClient }
     * 
     */
    public UpdateDocumentClient createUpdateDocumentClient() {
        return new UpdateDocumentClient();
    }

    /**
     * Create an instance of {@link UpdateDocumentClientResponse }
     * 
     */
    public UpdateDocumentClientResponse createUpdateDocumentClientResponse() {
        return new UpdateDocumentClientResponse();
    }

    /**
     * Create an instance of {@link UpdateDocumentOfficer }
     * 
     */
    public UpdateDocumentOfficer createUpdateDocumentOfficer() {
        return new UpdateDocumentOfficer();
    }

    /**
     * Create an instance of {@link UpdateDocumentOfficerResponse }
     * 
     */
    public UpdateDocumentOfficerResponse createUpdateDocumentOfficerResponse() {
        return new UpdateDocumentOfficerResponse();
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
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAddDocumentClient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAddDocumentClient }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "createAddDocumentClient")
    public JAXBElement<CreateAddDocumentClient> createCreateAddDocumentClient(CreateAddDocumentClient value) {
        return new JAXBElement<CreateAddDocumentClient>(_CreateAddDocumentClient_QNAME, CreateAddDocumentClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAddDocumentClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAddDocumentClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "createAddDocumentClientResponse")
    public JAXBElement<CreateAddDocumentClientResponse> createCreateAddDocumentClientResponse(CreateAddDocumentClientResponse value) {
        return new JAXBElement<CreateAddDocumentClientResponse>(_CreateAddDocumentClientResponse_QNAME, CreateAddDocumentClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAddDocumentOfficer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAddDocumentOfficer }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "createAddDocumentOfficer")
    public JAXBElement<CreateAddDocumentOfficer> createCreateAddDocumentOfficer(CreateAddDocumentOfficer value) {
        return new JAXBElement<CreateAddDocumentOfficer>(_CreateAddDocumentOfficer_QNAME, CreateAddDocumentOfficer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAddDocumentOfficerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAddDocumentOfficerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "createAddDocumentOfficerResponse")
    public JAXBElement<CreateAddDocumentOfficerResponse> createCreateAddDocumentOfficerResponse(CreateAddDocumentOfficerResponse value) {
        return new JAXBElement<CreateAddDocumentOfficerResponse>(_CreateAddDocumentOfficerResponse_QNAME, CreateAddDocumentOfficerResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocumentsClient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteDocumentsClient }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "deleteDocumentsClient")
    public JAXBElement<DeleteDocumentsClient> createDeleteDocumentsClient(DeleteDocumentsClient value) {
        return new JAXBElement<DeleteDocumentsClient>(_DeleteDocumentsClient_QNAME, DeleteDocumentsClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocumentsClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteDocumentsClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "deleteDocumentsClientResponse")
    public JAXBElement<DeleteDocumentsClientResponse> createDeleteDocumentsClientResponse(DeleteDocumentsClientResponse value) {
        return new JAXBElement<DeleteDocumentsClientResponse>(_DeleteDocumentsClientResponse_QNAME, DeleteDocumentsClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocumentsOfficer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteDocumentsOfficer }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "deleteDocumentsOfficer")
    public JAXBElement<DeleteDocumentsOfficer> createDeleteDocumentsOfficer(DeleteDocumentsOfficer value) {
        return new JAXBElement<DeleteDocumentsOfficer>(_DeleteDocumentsOfficer_QNAME, DeleteDocumentsOfficer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocumentsOfficerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteDocumentsOfficerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "deleteDocumentsOfficerResponse")
    public JAXBElement<DeleteDocumentsOfficerResponse> createDeleteDocumentsOfficerResponse(DeleteDocumentsOfficerResponse value) {
        return new JAXBElement<DeleteDocumentsOfficerResponse>(_DeleteDocumentsOfficerResponse_QNAME, DeleteDocumentsOfficerResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocFromClaim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocFromClaim }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "getDocFromClaim")
    public JAXBElement<GetDocFromClaim> createGetDocFromClaim(GetDocFromClaim value) {
        return new JAXBElement<GetDocFromClaim>(_GetDocFromClaim_QNAME, GetDocFromClaim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocFromClaimResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocFromClaimResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "getDocFromClaimResponse")
    public JAXBElement<GetDocFromClaimResponse> createGetDocFromClaimResponse(GetDocFromClaimResponse value) {
        return new JAXBElement<GetDocFromClaimResponse>(_GetDocFromClaimResponse_QNAME, GetDocFromClaimResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDocumentsClient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveDocumentsClient }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "retrieveDocumentsClient")
    public JAXBElement<RetrieveDocumentsClient> createRetrieveDocumentsClient(RetrieveDocumentsClient value) {
        return new JAXBElement<RetrieveDocumentsClient>(_RetrieveDocumentsClient_QNAME, RetrieveDocumentsClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDocumentsClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveDocumentsClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "retrieveDocumentsClientResponse")
    public JAXBElement<RetrieveDocumentsClientResponse> createRetrieveDocumentsClientResponse(RetrieveDocumentsClientResponse value) {
        return new JAXBElement<RetrieveDocumentsClientResponse>(_RetrieveDocumentsClientResponse_QNAME, RetrieveDocumentsClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDocumentsOfficer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveDocumentsOfficer }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "retrieveDocumentsOfficer")
    public JAXBElement<RetrieveDocumentsOfficer> createRetrieveDocumentsOfficer(RetrieveDocumentsOfficer value) {
        return new JAXBElement<RetrieveDocumentsOfficer>(_RetrieveDocumentsOfficer_QNAME, RetrieveDocumentsOfficer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDocumentsOfficerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveDocumentsOfficerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "retrieveDocumentsOfficerResponse")
    public JAXBElement<RetrieveDocumentsOfficerResponse> createRetrieveDocumentsOfficerResponse(RetrieveDocumentsOfficerResponse value) {
        return new JAXBElement<RetrieveDocumentsOfficerResponse>(_RetrieveDocumentsOfficerResponse_QNAME, RetrieveDocumentsOfficerResponse.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDocumentClient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDocumentClient }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "updateDocumentClient")
    public JAXBElement<UpdateDocumentClient> createUpdateDocumentClient(UpdateDocumentClient value) {
        return new JAXBElement<UpdateDocumentClient>(_UpdateDocumentClient_QNAME, UpdateDocumentClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDocumentClientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDocumentClientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "updateDocumentClientResponse")
    public JAXBElement<UpdateDocumentClientResponse> createUpdateDocumentClientResponse(UpdateDocumentClientResponse value) {
        return new JAXBElement<UpdateDocumentClientResponse>(_UpdateDocumentClientResponse_QNAME, UpdateDocumentClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDocumentOfficer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDocumentOfficer }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "updateDocumentOfficer")
    public JAXBElement<UpdateDocumentOfficer> createUpdateDocumentOfficer(UpdateDocumentOfficer value) {
        return new JAXBElement<UpdateDocumentOfficer>(_UpdateDocumentOfficer_QNAME, UpdateDocumentOfficer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDocumentOfficerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDocumentOfficerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.insure.com/", name = "updateDocumentOfficerResponse")
    public JAXBElement<UpdateDocumentOfficerResponse> createUpdateDocumentOfficerResponse(UpdateDocumentOfficerResponse value) {
        return new JAXBElement<UpdateDocumentOfficerResponse>(_UpdateDocumentOfficerResponse_QNAME, UpdateDocumentOfficerResponse.class, null, value);
    }

}
