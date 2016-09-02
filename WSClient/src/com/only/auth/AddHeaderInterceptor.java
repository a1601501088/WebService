package com.only.auth;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;

/**
 * Created by Administrator on 2016/4/19.
 */
public class AddHeaderInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
    private String userId;
    private String userPass;

    public AddHeaderInterceptor(String userId, String userPass) {
        /**
         * PREPARE_SEND ： 表示在发送Soap消息这前，调用此拦截器
         */
        super(Phase.PREPARE_SEND);
        this.userId = userId;
        this.userPass = userPass;
    }

    @Override
    public void handleMessage(SoapMessage soapMessage) throws Fault {
        Document document = DOMUtils.createDocument();
        Element authHeader = document.createElement("authHeader");

        /**
         * 这里要与 服务器端的 自定义的In拦截中用户名与密码(key名)一至
         */
        Element userIdEle = document.createElement("userId");
        Element userPassEle = document.createElement("userPass");

        /**
         * 把用户名与密码添加到XML文档
         */
        userIdEle.setTextContent(userId);
        userPassEle.setTextContent(userPass);
        /**
         * 把 userId 与 userPass 添加到 authHeader下
         */
        authHeader.appendChild(userIdEle);
        authHeader.appendChild(userPassEle);
        /**
         * 上面代码生成的xml文档为:
         * <authHeader>
         *     <userId>only</userId>
         *     <userPass>123</userPass>
         * </authHeader>
         *
         */
        /************************************************************/
        /**
         * 把xml文档片段封装成 Header添加到SoapMessage的headers中
         */
        Header header = new Header(new QName(""), authHeader);
        soapMessage.getHeaders().add(header);
    }
}
