package uk.gorodny.alexandernevskyapi.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.gorodny.alexandernevskyapi.converter.StatementConverter;
import uk.gorodny.alexandernevskyapi.service.StatementService;

@RestController
@RequestMapping("/statements")
@RequiredArgsConstructor
public class StatementController {

    private final StatementService service;

    private final StatementConverter converter;

    @GetMapping("/random")
    public ResponseEntity<StatementDto> getRandomStatement() {
        service.updateStatistics();
        return ResponseEntity
                .ok(converter.convert(service.getRandomStatement()));
    }
}
