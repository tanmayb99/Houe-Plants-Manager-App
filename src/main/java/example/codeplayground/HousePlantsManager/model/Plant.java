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
    private String binomialName;
    private String commonName;
    private String imageUrl;
    private Long descriptionYear;
    private String plantCode;

    public Plant() {}

    public Plant(String family, String genus, String binomialName, String commonName, String imageUrl, Long descriptionYear, String plantCode) {
        this.family = family;
        this.genus = genus;
        this.binomialName = binomialName;
        this.commonName = commonName;
        this.imageUrl = imageUrl;
        this.descriptionYear = descriptionYear;
        this.plantCode = plantCode;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getFamily() {
        return family;
    }
    
    public void setFamily(String family) {
        this.family = family;
    }
    
    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getBinomialName() {
        return binomialName;
    }

    public void setBinomialName(String binomialName) {
        this.family = binomialName;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getDescriptionYear() {
        return descriptionYear;
    }

    public void setDescriptionYear(Long descriptionYear) {
        this.descriptionYear = descriptionYear;
    }

    public String getPlantCode() {
        return plantCode;
    }

    public void setPlantCode(String plantCode) {
        this.plantCode = plantCode;
    }

    @Override // to see in the console
    public String toString() {
        return "Plant {" +
                "id = " + id +
                ", family = " + family + '\'' +
                ", genus = " + genus + '\'' +
                ", binomial name = " + binomialName + '\'' +
                ", common name = " + commonName + '\'' +
                ", image url = " + imageUrl + '\'' +
                ", description year = " + descriptionYear + '\'' +
                ", plant code = " + plantCode + '\'' +
                '}';
    }
}
