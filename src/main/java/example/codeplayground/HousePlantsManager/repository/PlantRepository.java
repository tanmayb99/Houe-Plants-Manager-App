package example.codeplayground.HousePlantsManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import example.codeplayground.HousePlantsManager.model.Plant;

import java.util.Optional;

public interface PlantRepository extends JpaRepository<Plant, Long> {
    void deletePlantById(Long id);

    Optional<Plant> findPlantById(Long id);
}
