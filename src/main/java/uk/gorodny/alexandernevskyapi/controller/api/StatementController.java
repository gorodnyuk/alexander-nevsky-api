package uk.gorodny.alexandernevskyapi.controller.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.gorodny.alexandernevskyapi.converter.StatementConverter;
import uk.gorodny.alexandernevskyapi.service.StatementService;
import uk.gorodny.alexandernevskyapi.service.StatisticsService;

@RestController
@RequestMapping("/statements")
@RequiredArgsConstructor
public class StatementController {

    private final StatementService statementService;

    private final StatisticsService statisticsService;

    private final StatementConverter converter;

    @GetMapping("/random")
    public ResponseEntity<StatementDto> getRandomStatement() {
        statisticsService.updateApiGetterCounterStatistics();
        return ResponseEntity
                .ok(converter.convert(statementService.getRandomStatement()));
    }
}
