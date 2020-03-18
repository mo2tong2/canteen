package com.wdcanteen.canteen.controller;

import com.wdcanteen.canteen.model.EmpVo;
import com.wdcanteen.canteen.model.Result;
import com.wdcanteen.canteen.model.UserDomain;
import com.wdcanteen.canteen.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.Date;
import java.util.Map;

/**
 * @Description:员工操作类
 *
 * @author 杨鹏鹏(pengpeng.yang @ ucarinc.com)
 * @version 1.0
 * @date 2019/11/2 23:06
 */
@Controller
@RequestMapping(value = "/emp")
public class EmpController {
    @Autowired
    private EmpService empService;
    /**
    * @Description:新增或者修改员工
    * @author 杨鹏(pengpeng.yang@ucarinc.com)
    * @date   2019/11/3 17:12
    * @param
    * @return
    */
    @ResponseBody
    @PostMapping("/add")
    public Object addUser(EmpVo empVo){
        Result re=new Result();
        empService.addOrUpdateEmp(empVo);
        return re;
    }
    @ResponseBody
    @PostMapping("/addTest")
    public Object addUser2(){
        Result re=new Result();
        EmpVo empVo=new EmpVo();
        empVo.setEmpName("liyi5");
        empVo.setEmpName("李毅");
        empVo.setEmpRole(0);
        int count=empService.addOrUpdateEmp(empVo);
        re.setStatus(0);
        return re;
    }
    public static Integer getThisDateType(Date targetTime){
        //String str=getyMDTime(targetTime);
        //String urlInfo=url+str;

        //String doPost = HttpUtil.doPost(urlInfo, map);
        String str="{\"20190913\":\"2\"}";
        Map<String, Integer> maps = (Map<String, Integer>) JSON.parse(str);

        for (Object map : maps.entrySet()){
            System.out.println(((Map.Entry)map).getKey()+"     " + ((Map.Entry)map).getValue());
        }
        return maps.get(str);
    }
}
