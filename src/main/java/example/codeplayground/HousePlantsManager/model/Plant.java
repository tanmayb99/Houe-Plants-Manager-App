package example.codeplayground.HousePlantsManager.model;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Plant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String family;
    private String genus;
    private String binomial_name;
    private String common_name;
    private String imageUrl;
    private String description_year;
}
