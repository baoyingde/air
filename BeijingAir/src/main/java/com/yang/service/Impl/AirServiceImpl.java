package com.yang.service.Impl;

import com.yang.mapper.AirMapper;
import com.yang.pojo.District;
import com.yang.service.AirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirServiceImpl implements AirService {
    @Autowired
    private AirMapper airMapper;
    @Override
    public List<District> findDistrictList() {
        List<District> districtList= airMapper.findAll();
        return districtList;
    }
}
