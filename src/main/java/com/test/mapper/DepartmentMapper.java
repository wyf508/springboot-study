package com.test.mapper;

import com.test.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @Creator NETTED-WYF
 * @CreateDate 2019/5/25 0025 下午 4:54
 * @Description TODO
 */
//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface DepartmentMapper {
    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set department_name=#{departmentName} where id=#{id}")
    public int updateDept(Department department);

}
