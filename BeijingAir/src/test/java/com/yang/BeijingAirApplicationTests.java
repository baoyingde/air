package com.yang;

import com.yang.mapper.AirMapper;
import com.yang.pojo.District;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BeijingAirApplicationTests {
    @Autowired
    private AirMapper airMapper;
    @Test
   public void testFindAll() {
        List<District> all = airMapper.findAll();
        System.out.println(all);
    }

}
