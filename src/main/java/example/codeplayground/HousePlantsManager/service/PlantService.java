package example.codeplayground.HousePlantsManager.service;

import example.codeplayground.HousePlantsManager.model.Plant;
import example.codeplayground.HousePlantsManager.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlantService {
    private final PlantRepository plantRepository;

    @Autowired
    public PlantService(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    public Plant addPlant(Plant plant) {
        plant.setPlantCode(UUID.randomUUID().toString)
        return plantRepository.save(plant);
    }
}
