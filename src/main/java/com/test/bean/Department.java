package com.test.bean;

/**
 * @Creator NETTED-WYF
 * @CreateDate 2019/5/25 0025 下午 4:52
 * @Description TODO
 */
public class Department {
    private Integer id;
    private String departmentName;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getId() {
        return id;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
