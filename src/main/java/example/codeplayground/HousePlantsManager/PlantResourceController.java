package example.codeplayground.HousePlantsManager;

import example.codeplayground.HousePlantsManager.model.Plant;
import example.codeplayground.HousePlantsManager.service.PlantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plant")
public class PlantResourceController {
    private final PlantService plantService;

    public PlantResourceController(PlantService plantService) {
        this.plantService = plantService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Plant>> getAllPlant() {
        List<Plant> plants = plantService.findAllPlants();
        return new ResponseEntity<>(plants, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Plant> getPlantById(@PathVariable("id") Long id) {
        Plant plant = plantService.findPlantById(id);
        return new ResponseEntity<>(plant, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Plant> addPlant(@RequestBody Plant plant) {
        Plant newPlant = plantService.addPlant(plant);
        return new ResponseEntity<>(newPlant, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Plant> updatePlant(@RequestBody Plant plant) {
        Plant updatePlant = plantService.updatePlant(plant);
        return new ResponseEntity<>(updatePlant, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePlant(@PathVariable("id") Long id) {
        plantService.deletePlant(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
