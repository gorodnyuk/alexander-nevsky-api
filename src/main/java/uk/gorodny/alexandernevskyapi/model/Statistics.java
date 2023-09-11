package uk.gorodny.alexandernevskyapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "statistics")
public class Statistics {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "site_enter_counter")
    private Long siteEnterCounter;

    @Column(name = "api_getter_counter")
    private Long apiGetterCounter;
}
