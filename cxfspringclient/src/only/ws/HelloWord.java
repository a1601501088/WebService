package only.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-04-20T11:58:03.338+08:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://ws.only/", name = "HelloWord")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWord {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getCatsByUser", targetNamespace = "http://ws.only/", className = "only.ws.GetCatsByUser")
    @WebMethod
    @ResponseWrapper(localName = "getCatsByUserResponse", targetNamespace = "http://ws.only/", className = "only.ws.GetCatsByUserResponse")
    public java.util.List<Cat> getCatsByUser(
            @WebParam(name = "arg0", targetNamespace = "")
                    User arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "saHi", targetNamespace = "http://ws.only/", className = "only.ws.SaHi")
    @WebMethod
    @ResponseWrapper(localName = "saHiResponse", targetNamespace = "http://ws.only/", className = "only.ws.SaHiResponse")
    public String saHi(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAllCats", targetNamespace = "http://ws.only/", className = "only.ws.GetAllCats")
    @WebMethod
    @ResponseWrapper(localName = "getAllCatsResponse", targetNamespace = "http://ws.only/", className = "only.ws.GetAllCatsResponse")
    public StringCat getAllCats();
}