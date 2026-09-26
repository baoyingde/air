package com.yang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Air {
    Integer id;
    Integer districtId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate monitorTime;
    Integer pm10;
    Integer pm25;
    String monitoringStation;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    LocalDateTime lastModifyTime;
    String districtName;
}
