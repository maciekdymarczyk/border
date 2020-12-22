package com.border.geostrefs;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BorderRaport {

    @ApiModelProperty(notes = "Kraj", example = "PL")
    private String country;
    @ApiModelProperty(notes = "Dystans przejechany w jednym kraju", example = "12345")
    private Long distance;
    @ApiModelProperty(notes = "Brak danych na początku do timedate", example = "timedate")
    private LocalDate entryTime;
    @ApiModelProperty(notes = "Brak danych na koncu do timedate", example = "timedate")
    private LocalDate exitTime;
    @ApiModelProperty(notes = "W sekundach", example = "1234")
    private LocalDate driveTime;
    @ApiModelProperty(notes = "exitTime - entryTime w sekundach", example = "2345")
    private LocalDate countryTime;

}
