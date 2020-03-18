package com.wdcanteen.canteen.model;

import com.github.pagehelper.PageSerializable;

import java.io.Serializable;
import java.util.List;

/**
 * description:
 *
 * @author 杨鹏鹏(pengpeng.yang @ ucarinc.com)
 * @version 1.0
 * @date 2019/11/4 11:10
 */
public class Result implements Serializable {
    private Integer status;
    private String mgs;
    private List<Object> re;

    public Result() {
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMgs() {
        return mgs;
    }

    public void setMgs(String mgs) {
        this.mgs = mgs;
    }

    public List<Object> getRe() {
        return re;
    }

    public void setRe(List<Object> re) {
        this.re = re;
    }
}
