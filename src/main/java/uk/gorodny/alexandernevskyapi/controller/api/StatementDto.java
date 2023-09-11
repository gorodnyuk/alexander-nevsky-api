package uk.gorodny.alexandernevskyapi.controller.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatementDto {

    private String valueRu;

    private String valueEn;
}
