package com.yang.controller;

import com.yang.pojo.District;
import com.yang.pojo.Result;
import com.yang.service.AirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AirController {
    @Autowired
    private AirService airService;
    @GetMapping("/district/list")
    public Result district(){
       List<District> districtList= airService.findDistrictList();
        return Result.success(districtList);
    }

}
