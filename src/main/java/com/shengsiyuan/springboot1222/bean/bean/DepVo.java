package com.shengsiyuan.springboot1222.bean.bean;

import java.util.List;

public class DepVo extends Dep {

    private List<Emp> EmpList;

    public List<Emp> getEmpList() {
        return EmpList;
    }

    public void setEmpList(List<Emp> empList) {
        EmpList = empList;
    }
}
