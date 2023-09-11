package uk.gorodny.alexandernevskyapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uk.gorodny.alexandernevskyapi.model.Statement;
import uk.gorodny.alexandernevskyapi.model.Statistics;
import uk.gorodny.alexandernevskyapi.repository.StatementRepository;
import uk.gorodny.alexandernevskyapi.repository.StatisticsRepository;

@Service
@RequiredArgsConstructor
public class StatementService {

    private final StatementRepository statementRepository;
    private final StatisticsRepository statisticsRepository;

    public Statement getRandomStatement() {
        return statementRepository.getRandomStatement();
    }

    public void updateStatistics() {
        Statistics statistics = statisticsRepository.findById(1L)
                .orElseThrow(() -> new RuntimeException("Statistics not contains object!"));
        statistics.setApiGetterCounter(statistics.getApiGetterCounter() + 1L);
        statisticsRepository.save(statistics);
    }
}
