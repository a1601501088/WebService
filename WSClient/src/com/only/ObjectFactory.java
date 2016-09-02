
package com.only;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.only package. 
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

    private final static QName _SaHiResponse_QNAME = new QName("http://only.com/", "saHiResponse");
    private final static QName _GetCatsByUser_QNAME = new QName("http://only.com/", "getCatsByUser");
    private final static QName _SaHi_QNAME = new QName("http://only.com/", "saHi");
    private final static QName _GetAllCats_QNAME = new QName("http://only.com/", "getAllCats");
    private final static QName _GetAllCatsResponse_QNAME = new QName("http://only.com/", "getAllCatsResponse");
    private final static QName _GetCatsByUserResponse_QNAME = new QName("http://only.com/", "getCatsByUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.only
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllCatsResponse }
     * 
     */
    public GetAllCatsResponse createGetAllCatsResponse() {
        return new GetAllCatsResponse();
    }

    /**
     * Create an instance of {@link GetAllCats }
     * 
     */
    public GetAllCats createGetAllCats() {
        return new GetAllCats();
    }

    /**
     * Create an instance of {@link GetCatsByUserResponse }
     * 
     */
    public GetCatsByUserResponse createGetCatsByUserResponse() {
        return new GetCatsByUserResponse();
    }

    /**
     * Create an instance of {@link SaHiResponse }
     * 
     */
    public SaHiResponse createSaHiResponse() {
        return new SaHiResponse();
    }

    /**
     * Create an instance of {@link GetCatsByUser }
     * 
     */
    public GetCatsByUser createGetCatsByUser() {
        return new GetCatsByUser();
    }

    /**
     * Create an instance of {@link SaHi }
     * 
     */
    public SaHi createSaHi() {
        return new SaHi();
    }

    /**
     * Create an instance of {@link Cat }
     * 
     */
    public Cat createCat() {
        return new Cat();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Create an instance of {@link StringCat }
     * 
     */
    public StringCat createStringCat() {
        return new StringCat();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaHiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://only.com/", name = "saHiResponse")
    public JAXBElement<SaHiResponse> createSaHiResponse(SaHiResponse value) {
        return new JAXBElement<SaHiResponse>(_SaHiResponse_QNAME, SaHiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://only.com/", name = "getCatsByUser")
    public JAXBElement<GetCatsByUser> createGetCatsByUser(GetCatsByUser value) {
        return new JAXBElement<GetCatsByUser>(_GetCatsByUser_QNAME, GetCatsByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaHi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://only.com/", name = "saHi")
    public JAXBElement<SaHi> createSaHi(SaHi value) {
        return new JAXBElement<SaHi>(_SaHi_QNAME, SaHi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCats }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://only.com/", name = "getAllCats")
    public JAXBElement<GetAllCats> createGetAllCats(GetAllCats value) {
        return new JAXBElement<GetAllCats>(_GetAllCats_QNAME, GetAllCats.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://only.com/", name = "getAllCatsResponse")
    public JAXBElement<GetAllCatsResponse> createGetAllCatsResponse(GetAllCatsResponse value) {
        return new JAXBElement<GetAllCatsResponse>(_GetAllCatsResponse_QNAME, GetAllCatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://only.com/", name = "getCatsByUserResponse")
    public JAXBElement<GetCatsByUserResponse> createGetCatsByUserResponse(GetCatsByUserResponse value) {
        return new JAXBElement<GetCatsByUserResponse>(_GetCatsByUserResponse_QNAME, GetCatsByUserResponse.class, null, value);
    }

}
