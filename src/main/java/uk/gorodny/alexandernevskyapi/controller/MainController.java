package uk.gorodny.alexandernevskyapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import uk.gorodny.alexandernevskyapi.service.StatisticsService;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final StatisticsService statisticsService;

    @GetMapping("/")
    public String index() {
        statisticsService.updateSiteEnterCounterStatistics();
        return "index";
    }
}
