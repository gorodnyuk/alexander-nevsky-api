package uk.gorodny.alexandernevskyapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uk.gorodny.alexandernevskyapi.model.Statement;
import uk.gorodny.alexandernevskyapi.repository.StatementRepository;

@Service
@RequiredArgsConstructor
public class StatementService {

    private final StatementRepository repository;

    public Statement getRandomStatement() {
        return repository.getRandomStatement();
    }
}
