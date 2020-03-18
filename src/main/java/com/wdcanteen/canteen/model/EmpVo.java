package com.wdcanteen.canteen.model;

/**
 * description:
 *
 * @author 杨鹏鹏(pengpeng.yang @ ucarinc.com)
 * @version 1.0
 * @date 2019/11/3 17:04
 */
public class EmpVo {
    //自增主键
    private Long id;
    //万信号
    private String empNo;
    //员工中文名称
    private String empName;
    //员工职能 管理员，或者普通员工
    private Integer empRole;

    public EmpVo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpRole() {
        return empRole;
    }

    public void setEmpRole(Integer empRole) {
        this.empRole = empRole;
    }
}
