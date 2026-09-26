package com.yang.service;

import com.github.pagehelper.PageInfo;
import com.yang.pojo.AddAirParam;
import com.yang.pojo.Air;
import com.yang.pojo.District;

import java.util.List;

public interface AirService {
    List<District> findDistrictList() ;

    PageInfo findAirByDistrictId(Integer page, Integer pageSize, Integer districtId);

    void addAir(AddAirParam addAirParam);

    void updateById(Air air);

    void deleteAir(Integer id);
}
