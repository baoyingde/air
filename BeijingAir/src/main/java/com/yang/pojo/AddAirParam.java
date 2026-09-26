package com.yang.pojo;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddAirParam {
    @NotNull(message = "id is null")
    private Integer districtId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "monitorTime is null")
    private LocalDate monitorTime;
    @NotNull(message = "pm10 is null")
    private Integer pm10;
    @NotNull(message = "pm25 is null")
    private Integer pm25;
    @NotNull(message = "monitoringStation is null")
    private String monitoringStation;
}
