package only.ws.action;

import only.ws.HelloWord;
import only.ws.impl.HelloWordImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/4/20.
 */
@Controller
public class ClientAction {
    @Resource
    private HelloWordImpl helloWordImpl;

    @RequestMapping("/excute")
    public void excute(){
        HelloWord helloWord = helloWordImpl.getHelloWordImplPort();
        String hello = helloWord.saHi("hello");
        System.out.println(hello);

    }

}
