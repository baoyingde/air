package com.yang.controller;

import com.github.pagehelper.PageInfo;
import com.yang.pojo.AddAirParam;
import com.yang.pojo.Air;
import com.yang.pojo.District;
import com.yang.pojo.Result;
import com.yang.service.AirService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class AirController {
    @Autowired
    private AirService airService;
    @GetMapping("/district/list")
    public Result district(){
       List<District> districtList= airService.findDistrictList();
        return Result.success(districtList);
    }
    @GetMapping("/air/list")
    public Result findAirByDistrictId(@RequestParam(value = "page" ,defaultValue = "1") Integer page,
                                      @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                                      Integer districtId){
        PageInfo pageInfo = airService.findAirByDistrictId(page,pageSize,districtId);
        return Result.success(pageInfo.getList(),pageInfo.getTotal());
    }
    @PostMapping("/air/add")
    public Result addAir(@Valid AddAirParam addAirParam, BindingResult result){
        if(result.hasErrors()){
            String message = result.getFieldError().getDefaultMessage();
            return Result.error(message);
        }
        airService.addAir(addAirParam);
        return Result.success();
    }
    @PostMapping("/air/update")
    public Result updateAir(Air air){
        Integer id=air.getId();
        if(id==null) return Result.error("参数不合法");
        airService.updateById(air);
        return Result.success();
    }
    @DeleteMapping("/air/delete/{id}")
    public Result deleteAir(@PathVariable Integer id){
        if(id ==null){
            System.out.println("参数为空");
            return Result.error("参数为空");
        }
        airService.deleteAir(id);
        return Result.success();
    }

}
