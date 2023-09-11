package uk.gorodny.alexandernevskyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uk.gorodny.alexandernevskyapi.model.Statement;

public interface StatementRepository extends JpaRepository<Statement, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM statements ORDER BY random() LIMIT 1")
    Statement getRandomStatement();
}
