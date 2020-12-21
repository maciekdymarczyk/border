package com.border.geostrefs;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BorderCross {

    private LocalDate crossTime;
    private String from;
    private String to;
    private Long odometer;
    private String driver;
}
