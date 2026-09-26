package com.yang.mapper;

import com.yang.pojo.Air;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface AirMapper {

    List<Air> findAirByDistrictId(Integer districtId);

//    districtId = Integer   （必传项）
//    monitorTime = yyyy-MM-dd  （必传项）
//    pm10 = Integer  （必传项）
//    pm25 = Integer  （必传项）
//    monitoringStation = String  （必传项）
    @Insert("insert into beijing_air.air(district_id, monitor_time, pm10, pm25, monitoring_station) values (#{districtId},#{monitorTime},#{pm10},#{pm25},#{monitoringStation})")
    void insert(Air air);
    //@Update("update beijing_air.air set district_id=#{districtId},monitor_time=#{monitorTime},pm10=#{pm10},pm25=#{pm25},monitoring_station=#{monitoringStation} where id=#{id}")
    int updateAir(Air air);
}
