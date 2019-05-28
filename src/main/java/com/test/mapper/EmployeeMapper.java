package com.test.mapper;

import com.test.bean.Employee;

/**
 * @Creator NETTED-WYF
 * @CreateDate 2019/5/25 0025 下午 4:54
 * @Description TODO
 */
//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {
    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
