package uk.gorodny.alexandernevskyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uk.gorodny.alexandernevskyapi.model.Statement;

@Repository
public interface StatementRepository extends JpaRepository<Statement, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM statements ORDER BY random() LIMIT 1")
    Statement getRandomStatement();
}
