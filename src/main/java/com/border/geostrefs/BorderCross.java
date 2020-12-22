package com.border.geostrefs;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BorderCross {
    @ApiModelProperty(notes = "Timedate przekroczenia granicy", example = "timedate")
    private LocalDate crossTime;
    @ApiModelProperty(notes = "Kraj z ktorego samochod wyjechal", example = "PL")
    private String from;
    @ApiModelProperty(notes = "Kraj do ktorego samochod wjechal", example = "DE")
    private String to;
    @ApiModelProperty(notes = "Licznik kilometrow", example = "12345")
    private Long odometer;
    @ApiModelProperty(notes = "Kierowca", example = "Stig")
    private String driver;
}
