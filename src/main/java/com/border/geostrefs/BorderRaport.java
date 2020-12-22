package com.border.geostrefs;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class BorderRaport {

    @ApiModelProperty(notes = "Kraj", example = "PL")
    private String country;
    @ApiModelProperty(notes = "Dystans przejechany w jednym kraju", example = "12345")
    private Long distance;
    @ApiModelProperty(notes = "Timedate wjazdu do strefy", example = "timedate")
    private LocalDate entryTime;
    @ApiModelProperty(notes = "Timedate wyjazdu ze strefy", example = "timedate")
    private LocalDate exitTime;
    @ApiModelProperty(notes = "W sekundach", example = "1234")
    private LocalDate driveTime;
    @ApiModelProperty(notes = "exitTime - entryTime w sekundach", example = "2345")
    private LocalDate countryTime;
    @ApiModelProperty(notes = "Informacje o zakresach czasu w ktorych brakuje danych")
    private List<NoDataBorderRaport> borderRaportNoDate;

}
