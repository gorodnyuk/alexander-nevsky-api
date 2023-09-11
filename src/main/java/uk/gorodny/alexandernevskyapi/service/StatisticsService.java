package uk.gorodny.alexandernevskyapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uk.gorodny.alexandernevskyapi.model.Statistics;
import uk.gorodny.alexandernevskyapi.repository.StatisticsRepository;

@Service
@RequiredArgsConstructor
public class StatisticsService {

    private final StatisticsRepository statisticsRepository;

    public void updateApiGetterCounterStatistics() {
        Statistics statistics = statisticsRepository.findById(1L)
                .orElseThrow(() -> new RuntimeException("Statistics not contains object!"));
        statistics.setApiGetterCounter(statistics.getApiGetterCounter() + 1L);
        statisticsRepository.save(statistics);
    }

    public void updateSiteEnterCounterStatistics() {
        Statistics statistics = statisticsRepository.findById(1L)
                .orElseThrow(() -> new RuntimeException("Statistics not contains object!"));
        statistics.setSiteEnterCounter(statistics.getSiteEnterCounter() + 1L);
        statisticsRepository.save(statistics);
    }
}
