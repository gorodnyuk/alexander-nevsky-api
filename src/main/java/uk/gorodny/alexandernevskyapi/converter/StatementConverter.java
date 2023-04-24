package uk.gorodny.alexandernevskyapi.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import uk.gorodny.alexandernevskyapi.api.StatementDto;
import uk.gorodny.alexandernevskyapi.model.Statement;

@Component
public class StatementConverter implements Converter<Statement, StatementDto> {

    @Override
    public StatementDto convert(Statement statement) {
        return StatementDto.builder()
                .valueRu(statement.getValueRu())
                .valueEn(statement.getValueEn())
                .build();
    }
}
