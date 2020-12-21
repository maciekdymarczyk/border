package com.border.geostrefs;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BorderRaport {

    private String country;
    private Long distance;
    private LocalDate entryTime;
    private LocalDate exitTime;
    private LocalDate countryTime;

}
