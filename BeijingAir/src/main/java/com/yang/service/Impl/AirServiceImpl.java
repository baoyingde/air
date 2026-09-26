package com.yang.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yang.mapper.AirMapper;
import com.yang.mapper.DistrictMapper;
import com.yang.pojo.AddAirParam;
import com.yang.pojo.Air;
import com.yang.pojo.District;
import com.yang.service.AirService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirServiceImpl implements AirService {
    @Autowired
    private DistrictMapper districtMapper;
    @Autowired
    private AirMapper airMapper;
    @Override
    public List<District> findDistrictList() {

        return districtMapper.findAll();
    }

    @Override
    public PageInfo findAirByDistrictId(Integer page, Integer pageSize, Integer districtId) {
        PageHelper.startPage(page,pageSize);
        List<Air> airList= airMapper.findAirByDistrictId(districtId);
        PageInfo pageInfo =new PageInfo(airList);
        return pageInfo;
    }

    @Override
    public void addAir(AddAirParam addAirParam) {
        Air air=new Air();
        BeanUtils.copyProperties(addAirParam,air);
        airMapper.insert(air);
    }

    @Override
    public void updateById(Air air) {
        int count =airMapper.updateAir(air);
        if(count!=1){
            System.out.println("数据错误");
            throw new RuntimeException("数据错误");
        }

    }

    @Override
    public void deleteAir(Integer id) {
        int count=airMapper.deleteAir(id);
        if(count!=1){
            System.out.println("数据错误");
            throw new RuntimeException("数据错误");
        }
    }
}
