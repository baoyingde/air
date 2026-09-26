package com.yang;

import com.yang.mapper.AirMapper;
import com.yang.mapper.DistrictMapper;
import com.yang.pojo.District;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BeijingAirApplicationTests {
    @Autowired
    private DistrictMapper districtMapper;
    @Autowired
    private AirMapper airMapper;
    @Test
   public void testFindAll() {
        List<District> all = districtMapper.findAll();
        System.out.println(all);
    }

}
