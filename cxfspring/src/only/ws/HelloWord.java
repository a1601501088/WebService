package only.ws;


import only.domain.Cat;
import only.domain.User;
import only.utils.OnlyXmlAdapter;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/11.
 */

@WebService
public interface HelloWord {

    String saHi(String s);

    List<Cat> getCatsByUser(User user);


    /**
     *  @XmlJavaTypeAdapter  表示web com.only.service 不能识别Map<String,Cat> ,因此创建一个 OnlyXmlAdapter
     *                              来转换一个其识别的类 ,这个类为 StringCat(自己创建的类)
     * @return
     */
    @XmlJavaTypeAdapter(OnlyXmlAdapter.class)
    Map<String,Cat> getAllCats();
}
