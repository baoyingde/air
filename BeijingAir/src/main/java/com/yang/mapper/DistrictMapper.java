package com.yang.mapper;

import com.yang.pojo.District;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface DistrictMapper {
    @Select("select * from district")
    List<District> findAll();
}
