package only.service;

import only.domain.Cat;
import only.domain.User;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/15.
 */
public interface UserService {

    List<Cat> getCatsByUser(User user);


    Map<String,Cat> getAllCats();
}
