package only.utils;


import only.domain.Cat;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/17.
 *
 * 该转换器用于 StringCat 与 Map<String, Cat> 的转换
 *  StringCat 是能识别的类(自己创建的类) , Map<String,Cat> 是不能识别的类
 */
public class OnlyXmlAdapter extends XmlAdapter<StringCat, Map<String, Cat>> {

    /**
     *  StringCat 转换成  Map<String, Cat>
     * @param v
     * @return
     * @throws Exception
     */
    @Override
    public Map<String, Cat> unmarshal(StringCat v) throws Exception {
        List<StringCat.Entry> entrys = v.getEntrys();
        Map<String, Cat> map = new HashMap<String, Cat>();
        int size = entrys.size();
        for (int i = 0; i < size; i++) {
            map.put(entrys.get(i).getKey(), entrys.get(i).getValue());

        }

        return map;
    }

    /**
     *  Map<String, Cat> 转换成 StringCat
     * @param v
     * @return
     * @throws Exception
     */
    @Override
    public StringCat marshal(Map<String, Cat> v) throws Exception {
        StringCat sc = new StringCat();
        for (Map.Entry<String, Cat> e : v.entrySet()) {
            StringCat.Entry entry = new StringCat.Entry();
            entry.setKey(e.getKey());
            entry.setValue(e.getValue());
            sc.getEntrys().add(entry);
        }
        return sc;
    }
}
