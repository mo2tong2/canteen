package com.wdcanteen.canteen.service;

import com.github.pagehelper.PageInfo;
import com.wdcanteen.canteen.model.UserDomain;

/**
 * description:
 *
 * @author 杨鹏鹏(pengpeng.yang @ ucarinc.com)
 * @version 1.0
 * @date 2019/11/2 23:45
 */
public interface UserService {
    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}
