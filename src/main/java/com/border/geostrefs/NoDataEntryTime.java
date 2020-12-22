package com.border.geostrefs;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class NoDataEntryTime {
    @ApiModelProperty(notes = "Brak danych data poczatkowa", example = "timedate")
    private LocalDate entryTime;
    @ApiModelProperty(notes = "Brak danych data koncowa", example = "timedate")
    private LocalDate exitTime;

}
