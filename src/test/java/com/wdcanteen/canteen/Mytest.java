package com.wdcanteen.canteen;

import com.wdcanteen.canteen.dao.UserDao;
import com.wdcanteen.canteen.model.UserDomain;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * description:
 *
 * @author 杨鹏鹏(pengpeng.yang @ ucarinc.com)
 * @version 1.0
 * @date 2019/11/3 12:24
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Mytest {
/*    @Autowired
    private UserDao userDao;*/
    @Test
    void sstest(){
        UserDomain ud=new UserDomain();
        ud.setUserName("liyi");
        ud.setPhone("553327");
        System.out.println(ud.toString());
        //userDao.insert(ud);
    }
}
