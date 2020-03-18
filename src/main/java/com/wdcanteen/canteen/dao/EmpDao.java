package com.wdcanteen.canteen.dao;

import com.wdcanteen.canteen.model.EmpVo;

/**
 * description:
 *
 * @author 杨鹏鹏(pengpeng.yang @ ucarinc.com)
 * @version 1.0
 * @date 2019/11/3 17:16
 */
public interface EmpDao {
    int insert(EmpVo empVo);
    int update(EmpVo empVo);
    EmpVo getEmpByEmpNo(String empNo);
}
