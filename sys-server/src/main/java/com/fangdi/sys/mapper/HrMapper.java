package com.fangdi.sys.mapper;

import com.fangdi.sys.bean.Hr;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description: TODO
 * @Author: fangdi
 * @Date: 2019-10-08 09:44
 */
public interface HrMapper {

    @Select("<script>" +
            "select * from hr where 1=1" +
            "<if test='name != null'>" +
            "and name = #{name}" +
            "</if>" +
            "</script>")
    List<Hr> getHrList(@Param("name") String name);
}
