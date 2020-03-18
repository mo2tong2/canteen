package com.wdcanteen.canteen.dao;

import com.wdcanteen.canteen.model.UserDomain;

import java.util.List;

/**
 * description:
 *
 * @author 杨鹏鹏(pengpeng.yang @ ucarinc.com)
 * @version 1.0
 * @date 2019/11/2 23:44
 */
public interface UserDao {


    int insert(UserDomain record);



    List<UserDomain> selectUsers();
}
