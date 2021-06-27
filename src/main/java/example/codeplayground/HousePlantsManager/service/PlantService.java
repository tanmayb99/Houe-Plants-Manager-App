package example.codeplayground.HousePlantsManager.service;

import example.codeplayground.HousePlantsManager.exceptions.PlantNotFoundException;
import example.codeplayground.HousePlantsManager.model.Plant;
import example.codeplayground.HousePlantsManager.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PlantService {
    private final PlantRepository plantRepository;

    @Autowired
    public PlantService(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    public Plant addPlant(Plant plant) {
        plant.setPlantCode(UUID.randomUUID().toString());
        return plantRepository.save(plant);
    }

    public List<Plant> findAllPlants() {
        return plantRepository.findAll();
    }

    public Plant updatePlant(Plant plant) {
        return plantRepository.save(plant);
    }

    public Plant findPlantById(Long id) {
        return plantRepository.findPlantById(id).
                orElseThrow(() -> new PlantNotFoundException("Plant by Id " + id + " not found."));
    }

    public void deletePlant(Long id) {
        plantRepository.deletePlantById(id);
    }
}
