package only.ws.lee;

import only.ws.HelloWord;
import only.ws.StringCat;
import only.ws.auth.AddHeaderInterceptor;
import only.ws.impl.HelloWordImpl;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;

/**
 * Created by Administrator on 2016/4/20.
 */
public class cxfspringclientMain {

    public static void main(String... args){
        HelloWordImpl factroy = new HelloWordImpl();
        HelloWord helloWord = factroy.getHelloWordImplPort();
        Client client = ClientProxy.getClient(helloWord);
        /*
            添加 Out拦截器
         */
        client.getOutInterceptors().add(new AddHeaderInterceptor("only","123"));


        String saHi = helloWord.saHi("陈庚");
        System.out.println(saHi);

        StringCat allCats = helloWord.getAllCats();



        System.out.println(allCats.getEntrys().get(0).getValue().getName());
    }
}
