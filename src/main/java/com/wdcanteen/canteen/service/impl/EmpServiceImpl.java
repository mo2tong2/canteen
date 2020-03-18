package com.wdcanteen.canteen.service.impl;

import com.wdcanteen.canteen.dao.EmpDao;
import com.wdcanteen.canteen.model.EmpVo;
import com.wdcanteen.canteen.service.EmpService;
import org.springframework.stereotype.Service;

/**
 * description:
 *
 * @author 杨鹏鹏(pengpeng.yang @ ucarinc.com)
 * @version 1.0
 * @date 2019/11/3 17:22
 */
@Service(value = "empService")
public class EmpServiceImpl implements EmpService{
    private EmpDao empDao;
    @Override
    public int addOrUpdateEmp(EmpVo empVo) {
        int reCount =0;
        EmpVo vo=empDao.getEmpByEmpNo(empVo.getEmpNo());

        if(null==vo){
            reCount=empDao.insert(empVo);
        }else{
            reCount=empDao.update(empVo);
        }
        return reCount;
    }
}
