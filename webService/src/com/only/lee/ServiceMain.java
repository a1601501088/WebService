package com.only.lee;

import com.only.HelloWord;
import com.only.auth.AuthInInterceptor;
import com.only.impl.HelloWordImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;

import javax.xml.ws.Endpoint;


/**
 * Created by Administrator on 2016/4/11.
 */
public class ServiceMain {

    public static void main(String... args) {
        HelloWord hw = new HelloWordImpl();
        // Endpoint.publish("http://192.168.56.1:9999/abc",hw);
        EndpointImpl endpoint = (EndpointImpl) Endpoint.publish("http://172.22.159.5:9999/abc", hw);
        /**
         * 添加service端的 In拦截器  , LoggingInInterceptor为日志类，无参时日志打印在控制台
         */
        endpoint.getInInterceptors().add(new LoggingInInterceptor());
        /**
         * 添加service端的 Out拦截器  , LoggingOutInterceptor为日志类，无参时日志打印在控制台
         */
        //  endpoint.getOutInterceptors().add(new LoggingOutInterceptor());

        /**
         * 自定义拦截器， 如: 权限验证
         */
        endpoint.getInInterceptors().add(new AuthInInterceptor());
        System.out.println("web com.only.service 暴露成功");


    }
}
