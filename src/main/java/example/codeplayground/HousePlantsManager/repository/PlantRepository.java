package example.codeplayground.HousePlantsManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import example.codeplayground.HousePlantsManager.model.Plant;

public interface PlantRepository extends JpaRepository<Plant, Long> {
}
