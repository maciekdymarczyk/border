package com.border.geostrefs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/v1/api/border")
public class BorderController {

    @GetMapping("/")
    public List<BorderCross> getBorderCrossing(@RequestParam String devId, @RequestParam("localDate") LocalDate dateFrom, @RequestParam("localDate") LocalDate dateTo) {
        List<BorderCross> borderCrossList = new LinkedList<>();

        return borderCrossList;
    }
    @GetMapping("/raport")
    public List<BorderRaport> getBorderRaport(@RequestParam String devId, @RequestParam("localDate") LocalDate dateFrom, @RequestParam("localDate") LocalDate dateTo) {
        List<BorderRaport> borderRaportList = new LinkedList<>();

        return borderRaportList;
    }
}
