package only.auth;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.List;

/**
 * Created by Administrator on 2016/4/17.
 *
 * 自定义拦截器，用于做权限验证
 *
 * 这里是 读客户端Out拦截器中的SoapMessage消息(xml片断)
 */
public class AuthInInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
    public AuthInInterceptor() {
        /**
         * 表示该拦截器在调用之前执行
         */
        super(Phase.PRE_INVOKE);
    }

    /**
     *
     * @param soapMessage  为 消息，SoapMessage 包括 header与body两个部分
     * @throws Fault
     */
    @Override
    public void handleMessage(SoapMessage soapMessage) throws Fault {
       // System.out.println("----------"+soapMessage);
        List<Header> headers = soapMessage.getHeaders();
        if (null==headers|| headers.size()<1){
            throw new Fault(new IllegalArgumentException("没有header,验证不通过"));
        }

        /**
         * 假如要求第一个header携带用户名、密码信息
         */
        Header header = headers.get(0);
        Element el = (Element) header.getObject();

        /**
         * 假如客户端传过来的key名为 userId(用户) 与 userPass(密码)
         */
        NodeList userIds = el.getElementsByTagName("userId");
        NodeList userPasses = el.getElementsByTagName("userPass");

        /**
         * 只允许 userId有一个节点
         */
        if (userIds.getLength()!=1){
            throw new Fault(new IllegalArgumentException("用户名格式错误"));
        }
        /**
         * 只允许 userPass有一个节点
         */
        if (userPasses.getLength()!=1){
            throw new Fault(new IllegalArgumentException("密码格式错误"));
        }

        /**
         * 以userId中的第一个文本内容作为 用户名
         */
        String userId = userIds.item(0).getTextContent();
        /**
         * 以userPasses中的第一个文本内容作为 密码
         */
        String userPass =userPasses.item(0).getTextContent();
        /**
         * 在实际应用中，这里进行用户名与密码验证
         */
        if(!userId.equals("only") || !userPass.equals("123")){
            //用户名或密码不正确，拦截
            throw new Fault(new IllegalArgumentException("用户名或密码不正确"));
        }
    }
}
