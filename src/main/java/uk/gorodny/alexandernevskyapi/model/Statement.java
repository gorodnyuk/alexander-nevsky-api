package uk.gorodny.alexandernevskyapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "statements")
public class Statement {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "value_ru")
    private String valueRu;

    @Column(name = "value_en")
    private String valueEn;
}
