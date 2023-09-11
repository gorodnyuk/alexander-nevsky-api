package uk.gorodny.alexandernevskyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.gorodny.alexandernevskyapi.model.Statistics;

public interface StatisticsRepository extends JpaRepository<Statistics, Long> {
}
